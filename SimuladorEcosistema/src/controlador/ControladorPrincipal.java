/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.SimulacionDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.Clima;
import modelo.Conejo;
import modelo.Ecosistema;
import modelo.Entidad;
import modelo.Lobo;
import modelo.Planta;
import modelo.PlantaVenenosa;
import vista.VentanaPrincipal;

/**
 *
 * @author Paulo
 */
public class ControladorPrincipal {

    private Ecosistema modelo;
    private final VentanaPrincipal vista;
    private final SimulacionDAO dao;

    public ControladorPrincipal(VentanaPrincipal vista) {
        this.vista = vista;
        this.dao = new SimulacionDAO();
    }

    // =======================================
    //  Inicio y validación de configuración
    // =======================================
    public void iniciarNuevaSimulacion(String strPlantas, String strConejos, String strLobos, String strTurnos, String strClima) {
        // Validación de campos vacíos
        if (strPlantas == null || strPlantas.trim().isEmpty()
                || strConejos == null || strConejos.trim().isEmpty()
                || strLobos == null || strLobos.trim().isEmpty()
                || strTurnos == null || strTurnos.trim().isEmpty()) {
            vista.mostrarError("Hay que completar todos los campos che.");
            return;
        }

        int plantas, conejos, lobos, turnos;
        try {
            plantas = Integer.parseInt(strPlantas.trim());
            conejos = Integer.parseInt(strConejos.trim());
            lobos = Integer.parseInt(strLobos.trim());
            turnos = Integer.parseInt(strTurnos.trim());
        } catch (NumberFormatException e) {
            vista.mostrarError("Los valores ingresados deben ser números enteros válidos.");
            return;
        }

        // Validación de rangos obligatorios de la consigna
        if (plantas < 5 || plantas > 30) {
            vista.mostrarError("La cantidad de plantas debe ser entre 5 y 30.");
            return;
        }
        if (conejos < 2 || conejos > 15) {
            vista.mostrarError("La cantidad de conejos debe ser entre 2 y 15.");
            return;
        }
        if (lobos < 1 || lobos > 5) {
            vista.mostrarError("La cantidad de lobos debe ser entre 1 y 5.");
            return;
        }
        if (turnos < 10 || turnos > 50) {
            vista.mostrarError("La cantidad de turnos debe ser entre 10 y 50.");
            return;
        }

        // Determinación del clima
        Clima climaSeleccionado;
        try {
            climaSeleccionado = Clima.valueOf(strClima.trim().toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            climaSeleccionado = Clima.SOLEADO;
        }

        // Creación del ecosistema
        this.modelo = new Ecosistema(climaSeleccionado, turnos);

        for (int i = 0; i < plantas; i++) {
            this.modelo.agregarEntidad("planta", 40.0);
        }
        for (int i = 0; i < conejos; i++) {
            this.modelo.agregarEntidad("conejo", 50.0);
        }
        for (int i = 0; i < lobos; i++) {
            this.modelo.agregarEntidad("lobo", 60.0);
        }

        // Actualizar interfaz e iniciar simulación
        vista.setIdentificador("Simulacion en ejecución");
        vista.setEstado("Simulación configurada exitosamente.");
        vista.getPanelSimulacion().mostrarEnCurso("Simulación activa: " + turnos + " turnos planificados.");
        vista.habilitarReporte(false);
        vista.habilitarGuardado(true);

        actualizarVistaSimulacion();
        verificarIntervencion();
        vista.mostrarSimulacion();
    }

    // ======================================
    //  Avance de turno y control de colapso
    // ======================================
    public void avanzarTurno() {
        if (modelo == null || modelo.simulaciónFinalizada()) {
            return;
        }

        // Procesar turno en el modelo
        modelo.procesarTurno();

        // Actualizar datos en la vista
        actualizarVistaSimulacion();

        // Verificar si la simulación terminó por límite o por colapso
        if (modelo.simulaciónFinalizada()) {
            finalizarSimulacion();
            return;
        }

        // Chequear si corresponde habilitar el panel de intervención (cada 3 turnos)
        verificarIntervencion();
    }

    private void verificarIntervencion() {
        int turno = modelo.getTurnoActual();
        // Se puede intervenir cada 3 turnos (ej: turno 3, 6, 9...)
        if (turno % 3 == 0) {
            vista.getPanelSimulacion().habilitarIntervencion(true, "¡Intervención disponible en este turno!");
        } else {
            int restantes = 3 - (turno % 3);
            vista.getPanelSimulacion().habilitarIntervencion(false, "Intervención disponible en " + restantes + " turno(s)");
        }
    }

    private void finalizarSimulacion() {
        vista.getPanelSimulacion().habilitarIntervencion(false, "Simulación finalizada");
        vista.setIdentificador("SIMULACIÓN FINALIZADA");
        vista.setEstado("Fin de la simulación: " + modelo.obtenerCausaFin());

        if (modelo.ecosistemaColapsado()) {
            vista.mostrarError("¡Alerta! El ecosistema ha colapsado.\n" + modelo.obtenerCausaFin());
        } else {
            vista.mostrarMensaje("Simulación completada con éxito tras alcanzar el límite de turnos.");
        }

        // Habilitar la pestaña del reporte final
        vista.habilitarReporte(true);
    }

    // =============================
    //  Intervencion del jugador
    // =============================
    public void aplicarCambioClima(String strNuevoClima) {
        if (modelo == null || modelo.simulaciónFinalizada()) {
            return;
        }

        try {
            Clima nuevo = Clima.valueOf(strNuevoClima.trim().toUpperCase());
            modelo.cambiarClima(nuevo);
            vista.setEstado("Clima modificado a: " + nuevo);
            actualizarVistaSimulacion();
            vista.mostrarMensaje("El clima fue actualizado a " + nuevo + ".");
        } catch (IllegalArgumentException e) {
            vista.mostrarError("Clima seleccionado inválido.");
        }
    }

    public void aplicarAgregarEntidad(String tipo) {
        if (modelo == null || modelo.simulaciónFinalizada()) {
            return;
        }

        tipo = tipo.trim().toLowerCase();
        if (tipo.equals("lobo") && modelo.getTotalNacimientosLobos() >= 5) {
            vista.mostrarError("No se pueden agregar más de 5 lobos en total en la simulación, vas a matar a todos los conejos.");
            return;
        }

        modelo.agregarEntidad(tipo);
        modelo.registrarEvento("Intervención humana: se agregó un(a) " + tipo + " al ecosistema.");
        vista.setEstado("Se agregó una entidad tipo: " + tipo);
        actualizarVistaSimulacion();
        vista.mostrarMensaje("Se agregó un(a) " + tipo + " con éxito.");
    }

    // =======================================
    //  Coordinacion de datos hacia la vista
    // =======================================
    private void actualizarVistaSimulacion() {
        int turno = modelo.getTurnoActual();
        int maxTurnos = modelo.getMaxTurnos();
        String clima = modelo.getClimaActual().name();
        int plantas = modelo.getPlantas().size();
        int conejos = modelo.getConejos().size();
        int lobos = modelo.getLobos().size();

        // 1. Actualizar contadores
        vista.getPanelSimulacion().actualizarEstado(turno, maxTurnos, clima, plantas, conejos, lobos);

        // 2. Cargar eventos del turno
        vista.getPanelSimulacion().mostrarEventos(modelo.getEventosTurnoActual());

        // 3. Construir lista de filas para la tabla (sin Swing en el controlador)
        List<Object[]> filasTabla = new ArrayList<>();

        for (Planta p : modelo.getPlantas()) {
            String tipo = (p instanceof PlantaVenenosa) ? "Planta Venenosa" : "Planta";
            filasTabla.add(new Object[]{p.getNombre(), tipo, String.format("%.1f", p.getEnergia()), p.getEdad(), p.isViva() ? "Viva" : "Muerta"});
        }
        for (Conejo c : modelo.getConejos()) {
            filasTabla.add(new Object[]{c.getNombre(), "Conejo", String.format("%.1f", c.getEnergia()), c.getEdad(), c.isViva() ? "Vivo" : "Muerto"});
        }
        for (Lobo l : modelo.getLobos()) {
            filasTabla.add(new Object[]{l.getNombre(), "Lobo", String.format("%.1f", l.getEnergia()), l.getEdad(), l.isViva() ? "Vivo" : "Muerto"});
        }

        vista.getPanelSimulacion().cargarTabla(filasTabla);
    }

    // ==========================
    //  Persistencia con el DAO
    // ==========================
    public void guardarPartida() {
        if (modelo == null) {
            vista.mostrarError("No hay ninguna simulación activa para guardar.");
            return;
        }

        List<String> datos = new ArrayList<>();
        // Cabecera: TurnoActual, MaxTurnos, Clima
        datos.add("ESTADO;" + modelo.getTurnoActual() + ";" + modelo.getMaxTurnos() + ";" + modelo.getClimaActual().name());

        // Guardar cada entidad viva
        for (Planta p : modelo.getPlantas()) {
            String tipo = (p instanceof PlantaVenenosa) ? "PLANTAVENENOSA" : "PLANTA";
            datos.add(tipo + ";" + p.getNombre() + ";" + p.getEnergia() + ";" + p.getEdad() + ";" + p.getTamanio());
        }
        for (Conejo c : modelo.getConejos()) {
            datos.add("CONEJO;" + c.getNombre() + ";" + c.getEnergia() + ";" + c.getEdad() + ";" + c.getVelocidad() + ";" + c.getPeso());
        }
        for (Lobo l : modelo.getLobos()) {
            datos.add("LOBO;" + l.getNombre() + ";" + l.getEnergia() + ";" + l.getEdad() + ";" + l.getVelocidad() + ";" + l.getPeso() + ";" + l.getExitosCaza());
        }

        dao.guardarEstado(datos);
        vista.mostrarMensaje("Partida guardada correctamente en partida_simulacion.txt.");
    }

    public void cargarPartida() {
        List<String> lineas = dao.cargarEstado();
        if (lineas == null || lineas.isEmpty()) {
            vista.mostrarError("No se encontró ningún archivo de partida guardada o el archivo está vacío.");
            return;
        }

        try {
            Ecosistema nuevoEco = null;

            for (String linea : lineas) {
                String[] partes = linea.split(";");
                if (partes.length == 0) continue;

                if (partes[0].equals("ESTADO")) {
                    int turno = Integer.parseInt(partes[1]);
                    int maxTurnos = Integer.parseInt(partes[2]);
                    Clima clima = Clima.valueOf(partes[3]);

                    nuevoEco = new Ecosistema(clima, maxTurnos);
                    nuevoEco.setTurnoActual(turno);
                } else if (nuevoEco != null) {
                    String tipo = partes[0];
                    String nombre = partes[1];
                    double energia = Double.parseDouble(partes[2]);
                    int edad = Integer.parseInt(partes[3]);

                    switch (tipo) {
                        case "PLANTA":
                            int tamP = Integer.parseInt(partes[4]);
                            Planta p = new Planta(nombre, energia, tamP);
                            p.setEdad(edad);
                            nuevoEco.getPlantas().add(p);
                            nuevoEco.getHistoricoEntidades().add(p);
                            break;
                        case "PLANTAVENENOSA":
                            int tamPV = Integer.parseInt(partes[4]);
                            PlantaVenenosa pv = new PlantaVenenosa(nombre, energia, tamPV);
                            pv.setEdad(edad);
                            nuevoEco.getPlantas().add(pv);
                            nuevoEco.getHistoricoEntidades().add(pv);
                            break;
                        case "CONEJO":
                            int velC = Integer.parseInt(partes[4]);
                            double pesoC = Double.parseDouble(partes[5]);
                            Conejo c = new Conejo(nombre, energia, velC, pesoC);
                            c.setEdad(edad);
                            nuevoEco.getConejos().add(c);
                            nuevoEco.getHistoricoEntidades().add(c);
                            break;
                        case "LOBO":
                            int velL = Integer.parseInt(partes[4]);
                            double pesoL = Double.parseDouble(partes[5]);
                            int cazas = Integer.parseInt(partes[6]);
                            Lobo l = new Lobo(nombre, energia, velL, pesoL);
                            l.setEdad(edad);
                            l.setExitosCaza(cazas);
                            nuevoEco.getLobos().add(l);
                            nuevoEco.getHistoricoEntidades().add(l);
                            break;
                    }
                }
            }

            if (nuevoEco != null) {
                this.modelo = nuevoEco;
                vista.setIdentificador("SIMULACIÓN CARGADA");
                vista.setEstado("Partida cargada con éxito. Turno: " + modelo.getTurnoActual());
                vista.getPanelSimulacion().mostrarEnCurso("Simulación cargada desde archivo.");
                vista.habilitarGuardado(true);
                vista.habilitarReporte(modelo.simulaciónFinalizada());

                actualizarVistaSimulacion();
                verificarIntervencion();
                vista.mostrarSimulacion();
                vista.mostrarMensaje("Partida cargada exitosamente.");
            }
        } catch (Exception e) {
            vista.mostrarError("Ocurrió un error al procesar el archivo guardado: " + e.getMessage());
        }
    }

    public Ecosistema getModelo() {
        return modelo;
    }
}
