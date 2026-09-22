/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package simuladorecosistema;

import java.util.ArrayList;
import java.util.Comparator;

public class Ecosistema {
    private ArrayList<Planta> plantas;
    private ArrayList<Conejo> conejos;
    private ArrayList<Lobo> lobos;
    private Clima climaActual;
    private int turnoActual;

    private int totalNacimientosPlantas = 0;
    private int totalNacimientosConejos = 0;
    private int totalNacimientosLobos = 0;
    private int totalMuertesPlantas = 0;
    private int totalMuertesConejos = 0;
    private int totalMuertesLobos = 0;
    private int turnoMayorActividad = 1;
    private int maxEventosEnUnTurno = 0;
    private int eventosTurnoActual = 0;

    private ArrayList<Entidad> historicoEntidades = new ArrayList<>();

    public Ecosistema(Clima climaInicial) {
        this.plantas = new ArrayList<>();
        this.conejos = new ArrayList<>();
        this.lobos = new ArrayList<>();
        this.climaActual = climaInicial;
        this.turnoActual = 1;
    }

    public ArrayList<Planta> getPlantas() { return plantas; }
    public ArrayList<Conejo> getConejos() { return conejos; }
    public ArrayList<Lobo> getLobos() { return lobos; }
    public Clima getClimaActual() { return climaActual; }
    public int getTurnoActual() { return turnoActual; }

    public void cambiarClima(Clima nuevo) {
        this.climaActual = nuevo;
        System.out.println("El clima cambio a: " + nuevo);
    }

    public void agregarEntidad(String tipo) {
        agregarEntidad(tipo, 50.0);
    }

    public void agregarEntidad(String tipo, double energiaInicial) {
        tipo = tipo.toLowerCase().trim();
        eventosTurnoActual++;

        if (tipo.equals("planta")) {
            Planta p;
            // 20% de probabilidad de generar una PlantaVenenosa (Bonus)
            if (Math.random() < 0.20) {
                p = new PlantaVenenosa("PlantaVenenosa-" + (historicoEntidades.size() + 1), energiaInicial, 3);
            } else {
                p = new Planta("Planta-" + (historicoEntidades.size() + 1), energiaInicial, 3);
            }
            plantas.add(p);
            historicoEntidades.add(p);
            totalNacimientosPlantas++;
        } else if (tipo.equals("conejo")) {
            Conejo c = new Conejo("Conejo-" + (historicoEntidades.size() + 1), energiaInicial, 10, 5.0);
            conejos.add(c);
            historicoEntidades.add(c);
            totalNacimientosConejos++;
        } else if (tipo.equals("lobo")) {
            if (totalNacimientosLobos < 5) {
                Lobo l = new Lobo("Lobo-" + (historicoEntidades.size() + 1), energiaInicial, 15, 30.0);
                lobos.add(l);
                historicoEntidades.add(l);
                totalNacimientosLobos++;
            } else {
                System.out.println("No se pueden agregar mas de 5 lobos en la simulacion.");
            }
        }
    }

    public void procesarTurno() {
        System.out.println("\n=== TURNO " + turnoActual + " | Clima: " + climaActual + " ===");
        mostrarEstado();
        System.out.println("--- Eventos ---");
        eventosTurnoActual = 0;

        // 1. Reproduccion polimorfica
        ArrayList<Reproducible> reproducibles = new ArrayList<>();
        reproducibles.addAll(plantas);
        reproducibles.addAll(conejos);
        for (Reproducible r : reproducibles) {
            r.intentarReproduccion(this);
        }

        // 2. Acciones de alimentacion y caza
        for (Conejo c : new ArrayList<>(conejos)) {
            if (c.isViva()) c.comer(this);
        }
        for (Lobo l : new ArrayList<>(lobos)) {
            if (l.isViva()) l.actuar(this);
        }

        // 3. Efectos climaticos
        for (Conejo c : conejos) {
            if (c.isViva()) {
                c.setEnergia(c.getEnergia() + climaActual.getEfectoEnergiaConejo());
            }
        }
        for (Lobo l : lobos) {
            if (l.isViva()) {
                l.setEnergia(l.getEnergia() + climaActual.getEfectoEnergiaLobo());
            }
        }

        // 4. Envejecimiento general y chequeo de energia
        ArrayList<Entidad> todas = new ArrayList<>();
        todas.addAll(plantas);
        todas.addAll(conejos);
        todas.addAll(lobos);

        for (Entidad e : todas) {
            if (e.isViva()) {
                e.envejecer();
                if (e.getEnergia() <= 0) {
                    if (e instanceof Mortal) {
                        ((Mortal) e).morir();
                        System.out.println(e.getNombre() + " murio por falta de energia.");
                    } else {
                        e.setViva(false);
                    }
                }
            }
        }

        // 5. Limpieza de muertos y contabilidad
        int plantasMuertas = (int) plantas.stream().filter(p -> !p.isViva()).count();
        int conejosMuertos = (int) conejos.stream().filter(c -> !c.isViva()).count();
        int lobosMuertos = (int) lobos.stream().filter(l -> !l.isViva()).count();

        totalMuertesPlantas += plantasMuertas;
        totalMuertesConejos += conejosMuertos;
        totalMuertesLobos += lobosMuertos;
        eventosTurnoActual += (plantasMuertas + conejosMuertos + lobosMuertos);

        plantas.removeIf(p -> !p.isViva());
        conejos.removeIf(c -> !c.isViva());
        lobos.removeIf(l -> !l.isViva());

        if (eventosTurnoActual > maxEventosEnUnTurno) {
            maxEventosEnUnTurno = eventosTurnoActual;
            turnoMayorActividad = turnoActual;
        }

        System.out.print("Estado final del turno: ");
        mostrarEstado();
        turnoActual++;
    }

    public boolean ecosistemaColapsado() {
        return plantas.isEmpty() || conejos.isEmpty() || lobos.isEmpty();
    }

    public void mostrarEstado() {
        System.out.println("Plantas: " + plantas.size() + " | Conejos: " + conejos.size() + " | Lobos: " + lobos.size());
    }

    public void generarReporteFinal() {
        System.out.println("\n==========================================");
        System.out.println("         REPORTE FINAL DEL ECOSISTEMA     ");
        System.out.println("==========================================");

        if (ecosistemaColapsado()) {
            String extinguido = plantas.isEmpty() ? "Plantas" : (conejos.isEmpty() ? "Conejos" : "Lobos");
            System.out.println("* Causa de fin: Colapso del ecosistema (Se extinguieron: " + extinguido + ").");
        } else {
            System.out.println("* Causa de fin: Limite de turnos completado con exito.");
        }

        System.out.println("* Turno de mayor actividad: Turno " + turnoMayorActividad + " (" + maxEventosEnUnTurno + " eventos).");

        historicoEntidades.stream().filter(e -> e instanceof Planta).max(Comparator.comparingInt(Entidad::getEdad))
            .ifPresent(p -> System.out.println("* Planta mas longeva: " + p.getNombre() + " (" + p.getEdad() + " turnos)"));
        historicoEntidades.stream().filter(e -> e instanceof Conejo).max(Comparator.comparingInt(Entidad::getEdad))
            .ifPresent(c -> System.out.println("* Conejo mas longevo: " + c.getNombre() + " (" + c.getEdad() + " turnos)"));
        historicoEntidades.stream().filter(e -> e instanceof Lobo).max(Comparator.comparingInt(Entidad::getEdad))
            .ifPresent(l -> System.out.println("* Lobo mas longevo: " + l.getNombre() + " (" + l.getEdad() + " turnos)"));

        historicoEntidades.stream()
            .filter(e -> e instanceof Lobo)
            .map(e -> (Lobo) e)
            .max(Comparator.comparingInt(Lobo::getExitosCaza))
            .ifPresent(l -> System.out.println("* Lobo con mas cacerias: " + l.getNombre() + " (" + l.getExitosCaza() + " presas)."));

        System.out.println("\n--- Estadisticas Demograficas ---");
        System.out.println("* Plantas -> Nacimientos: " + totalNacimientosPlantas + " | Muertes: " + totalMuertesPlantas);
        System.out.println("* Conejos -> Nacimientos: " + totalNacimientosConejos + " | Muertes: " + totalMuertesConejos);
        System.out.println("* Lobos   -> Ingresados: " + totalNacimientosLobos + " | Muertes: " + totalMuertesLobos);

        System.out.println("\n--- Elementos Peligrosos (Bonus) ---");
        historicoEntidades.stream()
            .filter(e -> e instanceof Peligroso)
            .map(e -> (Peligroso) e)
            .sorted(Comparator.comparingInt(Peligroso::getNivelPeligro).reversed())
            .forEach(pel -> System.out.println("Peligro nivel " + pel.getNivelPeligro() + " -> " + ((Entidad) pel).getNombre()));
        System.out.println("==========================================\n");
    }
}