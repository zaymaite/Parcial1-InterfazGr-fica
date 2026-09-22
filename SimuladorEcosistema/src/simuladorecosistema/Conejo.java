/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

import java.util.Random;

/**
 *
 * @author Educacion
 */
public class Conejo extends Animal implements Reproducible {

    public Conejo(String nombre, double energia, int velocidad, double peso) {
        super(nombre, energia, velocidad, peso);
    }

    @Override
    public void actuar(Ecosistema eco) {
        if (isViva()) {
            moverse();
            comer(eco);
            intentarReproduccion(eco);
            verificarMuerte();
        }
    }

    @Override
    public void comer(Ecosistema eco) {
        boolean encontroComida = false;

        for (Planta p : eco.getPlantas()) {
            if (p.isViva()) {
                double nutrientes = p.serComida();
                setEnergia(getEnergia() + nutrientes);
                System.out.println(getNombre() + " comio a " + p.getNombre() + " (" + (nutrientes >= 0 ? "+" : "") + nutrientes + " energia)");
                encontroComida = true;
                break;
            }
        }

        if (!encontroComida) {
            setEnergia(getEnergia() - 15);
            System.out.println(getNombre() + " no encontro comida (-15 energia).");
        }
    }

    @Override
    public void mostrarEstado() {
        String alerta = (getEnergia() < 20) ? " [PELIGRO]" : "";
        System.out.println("Conejo: " + getNombre() + " | Energia: " + getEnergia() + alerta);
    }

    @Override
    public boolean puedeReproducirse() {
        return isViva() && getEnergia() > 60;
    }

    @Override
    public void reproducirse(Ecosistema eco) {
        long conejosVivos = eco.getConejos().stream().filter(Entidad::isViva).count();
        // Solo reproduce si hay pareja y con una probabilidad del 50% para evitar explosión demográfica
        if (conejosVivos >= 2) {
            Random r = new Random();
            if (r.nextDouble() < 0.5) {
                setEnergia(getEnergia() - 25);
                eco.agregarEntidad("conejo", 40.0);
                System.out.println(getNombre() + " se reprodujo y nacio un nuevo conejo.");
            }
        }
    }
}