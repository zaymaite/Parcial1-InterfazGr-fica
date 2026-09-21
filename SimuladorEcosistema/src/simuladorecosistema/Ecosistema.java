/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;
import java.util.ArrayList;

public class Ecosistema {
    private ArrayList<Planta> plantas;
    private ArrayList<Conejo> conejos;
    private ArrayList<Lobo> lobos;
    private Clima climaActual;
    private int turnoActual;

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
    
    public void cambiarClima(Clima nuevo) {
        this.climaActual = nuevo;
        System.out.println("El clima cambió a: " + nuevo);
    }

    // Sobrecarga 1
    public void agregarEntidad(String tipo) {
        agregarEntidad(tipo, 50.0);
    }

    // Sobrecarga 2
    public void agregarEntidad(String tipo, double energiaInicial) {
        tipo = tipo.toLowerCase();
        if (tipo.equals("planta")) {
            plantas.add(new Planta("Planta-" + (plantas.size()+1), energiaInicial, 3));
            System.out.println("Se agregó una nueva Planta.");
        } else if (tipo.equals("conejo")) {
            conejos.add(new Conejo("Conejo-" + (conejos.size()+1), energiaInicial, 10, 5.0));
            System.out.println("Se agregó un nuevo Conejo.");
        } else if (tipo.equals("lobo")) {
            if (lobos.size() < 5) {
                lobos.add(new Lobo("Lobo-" + (lobos.size()+1), energiaInicial, 15, 30.0));
                System.out.println("Se agregó un nuevo Lobo.");
            } else {
                System.out.println("No se pueden agregar más de 5 lobos en la simulación.");
            }
        }
    }

    public void procesarTurno() {
        System.out.println("\n=== TURNO " + turnoActual + " Clima: " + climaActual + " ===");
        mostrarEstado();
        System.out.println("Eventos --");

        for (int i = 0; i < plantas.size(); i++) { plantas.get(i).actuar(this); }
        for (int i = 0; i < conejos.size(); i++) { conejos.get(i).actuar(this); }
        for (int i = 0; i < lobos.size(); i++) { lobos.get(i).actuar(this); }

        ArrayList<Entidad> todas = new ArrayList<>();
        todas.addAll(plantas); 
        todas.addAll(conejos); 
        todas.addAll(lobos);
        
        for (Entidad e : todas) {
            e.envejecer();
            if (e instanceof Mortal) {
                ((Mortal) e).verificarMuerte(); 
            } else if (e.getEnergia() <= 0) {
                e.setViva(false);
            }
        }

        plantas.removeIf(p -> !p.isViva());
        conejos.removeIf(c -> !c.isViva());
        lobos.removeIf(l -> !l.isViva());

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
        System.out.println("\n=== REPORTE FINAL DEL ECOSISTEMA ===");
        if (ecosistemaColapsado()) {
            System.out.println("Causa de fin: Colapso del ecosistema.");
        } else {
            System.out.println("Causa de fin: Se alcanzó el límite de turnos.");
        }
        
        Lobo mejorLobo = null;
        for(Lobo l : lobos) {
            if(mejorLobo == null || l.getExitosCaza() > mejorLobo.getExitosCaza()) {
                mejorLobo = l;
            }
        }
        if(mejorLobo != null) {
            System.out.println("Lobo con más cacerías: " + mejorLobo.getNombre() + " (" + mejorLobo.getExitosCaza() + " cacerías).");
        }
    }
}
