/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

/**
 *
 * @author Educacion
 */
public class PlantaVenenosa extends Planta {

    public PlantaVenenosa(String nombre, double energia, int tamanio) {
        super(nombre, energia, tamanio);
    }

    @Override
    public double serComida() {
        setEnergia(0);
        setViva(false);
        System.out.println("¡" + getNombre() + " era venenosa!");
        return -30.0; // resta energia en vez de sumar
    }
    
    @Override
    public void mostrarEstado() {
        System.out.println("Planta Venenosa: " + getNombre() + " | Tamaño: " + getTamanio() + " | Energía: " + getEnergia());
    }
}