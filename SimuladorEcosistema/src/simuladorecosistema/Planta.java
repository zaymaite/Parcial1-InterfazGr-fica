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
public class Planta extends Entidad implements Reproducible {
    private int tamanio; // 1 a 5

    public Planta(String nombre, double energia, int tamanio) {
        super(nombre, energia);
        this.tamanio = Math.max(1, Math.min(5, tamanio));
    }

    @Override
    public void actuar(Ecosistema eco) {
        if (isViva()) {
            intentarReproduccion(eco);
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Planta: " + getNombre() + " | Tamanio: " + tamanio + " | Energia: " + getEnergia());
    }

    public double serComida() {
        double valorNutritivo = this.tamanio * 10.0;
        setEnergia(0);
        setViva(false);
        return valorNutritivo;
    }

    @Override
    public boolean puedeReproducirse() {
        return isViva() && getEnergia() > 30.0;
    }

    @Override
    public void reproducirse(Ecosistema eco) {
        double multClima = eco.getClimaActual().getMultiplicadorReproduccionPlantas();
        
        // En Invierno el multiplicador es 0: no se reproducen
        if (multClima <= 0.0) {
            return;
        }

        // Probabilidad según clima (Sequía = 50%, Soleado/Lluvioso = casi seguro)
        Random r = new Random();
        if (r.nextDouble() <= (multClima * 0.6)) {
            setEnergia(getEnergia() - 15);
            System.out.println(getNombre() + " se reprodujo y solto un nuevo brote.");
            eco.agregarEntidad("planta", 35.0);
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = Math.max(1, Math.min(5, tamanio));
    }
}