/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Creado por Ismael
package simuladorecosistema;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class Lobo extends Animal implements Peligroso {
    private int exitosCaza;

    public Lobo(String nombre, double energia, int velocidad, double peso) {
        super(nombre, energia, velocidad, peso);
        this.exitosCaza = 0;
    }

    public int getExitosCaza() {
        return exitosCaza;
    }

    @Override
    public void actuar(Ecosistema eco) {
        if (this.isViva()) {
            comer(eco);
        }
    }

    @Override
    public void comer(Ecosistema eco) {
        ArrayList<Conejo> conejosVivos = new ArrayList<>();
        for (Conejo c : eco.getConejos()) {
            if (c.isViva()) {
                conejosVivos.add(c);
            }
        }

        if (conejosVivos.isEmpty()) {
            return;
        }

        Random rand = new Random();
        Conejo presa = conejosVivos.get(rand.nextInt(conejosVivos.size()));

        double probabilidadExito = this.getEnergia() * 0.6;
        probabilidadExito += (eco.getClimaActual().getBonusExitoCazaLobo() * 100);

        if (rand.nextDouble() * 100 < probabilidadExito) {
            presa.morir();
            this.exitosCaza++;
            this.setEnergia(this.getEnergia() + 30);
            System.out.println("Lobo '" + this.getNombre() + "' cazo a '" + presa.getNombre() + "' (+30 energia) [cacerias: " + exitosCaza + "]");
        } else {
            System.out.println("Lobo '" + this.getNombre() + "' fallo la caza");
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Lobo '" + getNombre() + "' | Energia: " + getEnergia() + " | Cacerias: " + exitosCaza);
    }

    @Override
    public int getNivelPeligro() {
        return (int)(getEnergia() * 0.2) + (exitosCaza * 5);
    }
}
