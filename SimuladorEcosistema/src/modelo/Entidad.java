/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Educacion
 */
public abstract class Entidad {
    private static final double ENERGIA_BASE_POR_TURNO = 1.0;
    
    private String nombre;
    private double energia;
    private int edad;
    private boolean viva;
    
    public Entidad(String nombre, double energia) {
        this.nombre = nombre;
        setEnergia(energia);
        this.edad = 0;
        this.viva = true;
    }
    
    public abstract void actuar(Ecosistema eco);
    public abstract String obtenerEstado();
    
    public void envejecer() {
        this.edad++;
        setEnergia(this.energia - ENERGIA_BASE_POR_TURNO);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getEnergia() {
        return energia;
    }
    
    public void setEnergia(double nuevaEnergia) {
        this.energia = Math.max(0, nuevaEnergia);
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    public boolean isViva() {
        return viva;
    }
    
    public void setViva(boolean viva) {
        this.viva = viva;
    }
}
