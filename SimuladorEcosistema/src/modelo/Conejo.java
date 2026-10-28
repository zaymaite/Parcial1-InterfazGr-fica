/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
            moverse(eco);
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
                
                if (nutrientes < 0) {
                    eco.registrarEvento("¡CUIDADO! " + getNombre() + " comió a " + p.getNombre() + " que era venenosa (-30 energía).");
                } else {
                    eco.registrarEvento(getNombre() + " comió a " + p.getNombre() + " (+" + nutrientes + " energía).");
                }
                encontroComida = true;
                break;
            }
        }

        if (!encontroComida) {
            setEnergia(getEnergia() - 15);
            eco.registrarEvento(getNombre() + " no encontró comida (-15 energía).");
        }
    }

    @Override
    public String obtenerEstado() {
        String alerta = (getEnergia() < 20) ? " [PELIGRO]" : "";
        return "Conejo: " + getNombre() + " | Energía: " + getEnergia() + alerta;
    }

    @Override
    public boolean puedeReproducirse() {
        return isViva() && getEnergia() > 60;
    }

    @Override
    public void reproducirse(Ecosistema eco) {
        long conejosVivos = eco.getConejos().stream().filter(Entidad::isViva).count();
        if (conejosVivos >= 2) {
            Random r = new Random();
            if (r.nextDouble() < 0.5) {
                setEnergia(getEnergia() - 25);
                eco.registrarEvento(getNombre() + " se reprodujo y nació un nuevo conejo.");
                eco.agregarEntidad("conejo", 40.0);
            }
        }
    }
}