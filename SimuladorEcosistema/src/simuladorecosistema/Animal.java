/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

/**
 *
 * @author Educacion
 */
public abstract class Animal extends Entidad implements Mortal {
    private int velocidad;
    private double peso;

    public Animal(String nombre, double energia, int velocidad, double peso) {
        super(nombre, energia);
        this.velocidad = velocidad;
        this.peso = peso;
    }

    @Override
    public boolean estaVivo() {
        return isViva();
    }

    @Override
    public void morir() {
        setViva(false);
        setEnergia(0);
    }

    public abstract void comer(Ecosistema eco);

    public void moverse() {
        System.out.println(getNombre() + " se desplazó.");
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}