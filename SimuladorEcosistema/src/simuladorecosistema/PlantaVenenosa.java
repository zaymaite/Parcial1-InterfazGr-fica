/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

/**
 *
 * @author Educacion
 */
public class PlantaVenenosa extends Planta implements Peligroso {

    public PlantaVenenosa(String nombre, double energia, int tamanio) {
        super(nombre, energia, tamanio);
    }

    @Override
    public double serComida() {
        setEnergia(0);
        setViva(false);
        System.out.println("CUIDADO: " + getNombre() + " era venenosa!");
        return -30.0; // Resta 30 de energía al conejo que la coma
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Planta Venenosa: " + getNombre() + " | Tamanio: " + getTamanio() + " | Energia: " + getEnergia());
    }

    @Override
    public int getNivelPeligro() {
        // Nivel fijo de peligro representativo para el reporte
        return 15;
    }
}