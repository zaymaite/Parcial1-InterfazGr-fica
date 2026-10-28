/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ecosistema {
    private ArrayList<Planta> plantas;
    private ArrayList<Conejo> conejos;
    private ArrayList<Lobo> lobos;
    private Clima climaActual;
    private int turnoActual;
    private int maxTurnos;

    // Métricas para reportes y estadísticas
    private int totalNacimientosPlantas = 0;
    private int totalNacimientosConejos = 0;
    private int totalNacimientosLobos = 0;
    private int totalMuertesPlantas = 0;
    private int totalMuertesConejos = 0;
    private int totalMuertesLobos = 0;
    private int turnoMayorActividad = 1;
    private int maxEventosEnUnTurno = 0;

    // Lista de eventos del turno para el controlador/vista
    private List<String> eventosTurnoActual = new ArrayList<>();
    private ArrayList<Entidad> historicoEntidades = new ArrayList<>();

    public Ecosistema(Clima climaInicial, int maxTurnos) {
        this.plantas = new ArrayList<>();
        this.conejos = new ArrayList<>();
        this.lobos = new ArrayList<>();
        this.climaActual = climaInicial;
        this.turnoActual = 1;
        this.maxTurnos = maxTurnos;
    }

    public ArrayList<Planta> getPlantas() { return plantas; }
    public ArrayList<Conejo> getConejos() { return conejos; }
    public ArrayList<Lobo> getLobos() { return lobos; }
    public Clima getClimaActual() { return climaActual; }
    public int getTurnoActual() { return turnoActual; }
    public int getMaxTurnos() { return maxTurnos; }
    public List<String> getEventosTurnoActual() { return eventosTurnoActual; }
    public ArrayList<Entidad> getHistoricoEntidades() { return historicoEntidades; }

    public void setTurnoActual(int turnoActual) { this.turnoActual = turnoActual; }
    public void setMaxTurnos(int maxTurnos) { this.maxTurnos = maxTurnos; }

    public void registrarEvento(String evento) {
        eventosTurnoActual.add(evento);
    }

    public void cambiarClima(Clima nuevo) {
        this.climaActual = nuevo;
        registrarEvento("El clima cambió a: " + nuevo);
    }

    public void agregarEntidad(String tipo) {
        agregarEntidad(tipo, 50.0);
    }

    public void agregarEntidad(String tipo, double energiaInicial) {
        tipo = tipo.toLowerCase().trim();

        if (tipo.equals("planta")) {
            Planta p;
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
            }
        }
    }

    public void procesarTurno() {
        eventosTurnoActual.clear();

        // 1. Reproducción polimórfica
        ArrayList<Reproducible> reproducibles = new ArrayList<>();
        reproducibles.addAll(plantas);
        reproducibles.addAll(conejos);
        for (Reproducible r : reproducibles) {
            r.intentarReproduccion(this);
        }

        // 2. Acciones animales
        for (Conejo c : new ArrayList<>(conejos)) {
            if (c.isViva()) c.actuar(this);
        }
        for (Lobo l : new ArrayList<>(lobos)) {
            if (l.isViva()) l.actuar(this);
        }

        // 3. Modificadores climáticos sobre seres vivos
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

        // 4. Envejecimiento y chequeo de muerte
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
                        registrarEvento(e.getNombre() + " murió por falta de energía.");
                    } else {
                        e.setViva(false);
                    }
                }
            }
        }

        // 5. Depuración de bajas y cómputo de eventos
        int plantasMuertas = (int) plantas.stream().filter(p -> !p.isViva()).count();
        int conejosMuertos = (int) conejos.stream().filter(c -> !c.isViva()).count();
        int lobosMuertos = (int) lobos.stream().filter(l -> !l.isViva()).count();

        totalMuertesPlantas += plantasMuertas;
        totalMuertesConejos += conejosMuertos;
        totalMuertesLobos += lobosMuertos;

        plantas.removeIf(p -> !p.isViva());
        conejos.removeIf(c -> !c.isViva());
        lobos.removeIf(l -> !l.isViva());

        if (eventosTurnoActual.size() > maxEventosEnUnTurno) {
            maxEventosEnUnTurno = eventosTurnoActual.size();
            turnoMayorActividad = turnoActual;
        }

        turnoActual++;
    }

    public boolean ecosistemaColapsado() {
        return plantas.isEmpty() || conejos.isEmpty() || lobos.isEmpty();
    }

    public boolean simulaciónFinalizada() {
        return turnoActual > maxTurnos || ecosistemaColapsado();
    }

    public String obtenerCausaFin() {
        if (ecosistemaColapsado()) {
            String extinguido = plantas.isEmpty() ? "Plantas" : (conejos.isEmpty() ? "Conejos" : "Lobos");
            return "Colapso del ecosistema (Se extinguieron: " + extinguido + ").";
        }
        return "Límite de turnos completado con éxito.";
    }

    // Métodos para alimentar el Panel de Reporte sin usar consola
    public int getTurnoMayorActividad() { return turnoMayorActividad; }
    public int getMaxEventosEnUnTurno() { return maxEventosEnUnTurno; }
    public int getTotalNacimientosPlantas() { return totalNacimientosPlantas; }
    public int getTotalNacimientosConejos() { return totalNacimientosConejos; }
    public int getTotalNacimientosLobos() { return totalNacimientosLobos; }
    public int getTotalMuertesPlantas() { return totalMuertesPlantas; }
    public int getTotalMuertesConejos() { return totalMuertesConejos; }
    public int getTotalMuertesLobos() { return totalMuertesLobos; }

    public String getPlantaMasLongeva() {
        return historicoEntidades.stream()
                .filter(e -> e instanceof Planta)
                .max(Comparator.comparingInt(Entidad::getEdad))
                .map(p -> p.getNombre() + " (" + p.getEdad() + " turnos)")
                .orElse("Ninguna");
    }

    public String getConejoMasLongevo() {
        return historicoEntidades.stream()
                .filter(e -> e instanceof Conejo)
                .max(Comparator.comparingInt(Entidad::getEdad))
                .map(c -> c.getNombre() + " (" + c.getEdad() + " turnos)")
                .orElse("Ninguno");
    }

    public String getLoboMasLongevo() {
        return historicoEntidades.stream()
                .filter(e -> e instanceof Lobo)
                .max(Comparator.comparingInt(Entidad::getEdad))
                .map(l -> l.getNombre() + " (" + l.getEdad() + " turnos)")
                .orElse("Ninguno");
    }

    public String getLoboConMasCacerias() {
        return historicoEntidades.stream()
                .filter(e -> e instanceof Lobo)
                .map(e -> (Lobo) e)
                .max(Comparator.comparingInt(Lobo::getExitosCaza))
                .map(l -> l.getNombre() + " (" + l.getExitosCaza() + " presas)")
                .orElse("Ninguno");
    }

    public List<String> getRankingPeligrosos() {
        List<String> lista = new ArrayList<>();
        historicoEntidades.stream()
                .filter(e -> e instanceof Peligroso)
                .map(e -> (Peligroso) e)
                .sorted(Comparator.comparingInt(Peligroso::getNivelPeligro).reversed())
                .forEach(pel -> lista.add("Nivel " + pel.getNivelPeligro() + " -> " + ((Entidad) pel).getNombre()));
        return lista;
    }
    
}