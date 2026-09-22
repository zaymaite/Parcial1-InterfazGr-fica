/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

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
            envejecer();
            intentarReproduccion(eco);
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Planta: " + getNombre() + " | Tamaño: " + tamanio + " | Energía: " + getEnergia());
    }

    public double serComida() {
        double valorNutritivo = this.tamanio * 10.0;
        setEnergia(0);
        setViva(false); // muere al ser comida
        return valorNutritivo;
    }

    @Override
    public boolean puedeReproducirse() {
        return isViva() && getEnergia() > 30.0;
    }

    @Override
    public void reproducirse(Ecosistema eco) {
        setEnergia(getEnergia() - 15);
        System.out.println(getNombre() + " se reprodujo y soltó un nuevo brote.");
        // eco.agregarEntidad(new Planta(getNombre() + "-Brote", 20, 1));
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = Math.max(1, Math.min(5, tamanio));
    }
}