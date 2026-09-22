/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Creado por Ismael
package simuladorecosistema;
import java.util.Random;
/**
 *
 * @author Ismael
 */
public class Lobo extends Animal implements Peligroso {
    private int exitosCaza;

    // Asumimos que Animal pedirá estos parámetros para pasárselos a Entidad
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
        if (eco.getConejos().isEmpty()) {
            return; 
        }

        Random rand = new Random();
        Conejo presa = eco.getConejos().get(rand.nextInt(eco.getConejos().size()));

        // Probabilidad base escalable según energía
        double probabilidadExito = this.getEnergia() * 0.6; 
        
        // Sumamos el bonus del clima (lee el 0.20 del INVIERNO y lo pasa a porcentaje)
        probabilidadExito += (eco.getClimaActual().getBonusExitoCazaLobo() * 100);

        if (rand.nextDouble() * 100 < probabilidadExito) {
            presa.setEnergia(0); 
            presa.verificarMuerte(); 
            this.exitosCaza++;
            this.setEnergia(this.getEnergia() + 30); 
            System.out.println("Lobo '" + this.getNombre() + "' cazó a '" + presa.getNombre() + "' (+30 energia) [cacerías: " + exitosCaza + "]");
        } else {
            System.out.println("Lobo '" + this.getNombre() + "' falló la caza");
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Lobo '" + getNombre() + "' | Energía: " + getEnergia() + " | Cacerías: " + exitosCaza);
    }

    @Override
    public int getNivelPeligro() {
        return (int)(getEnergia() * 0.2) + (exitosCaza * 5); 
    }
}
