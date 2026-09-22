/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

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
            envejecer();
            moverse();
            comer(eco);
            intentarReproduccion(eco);
            verificarMuerte(); //acá se usa el default de la interfaz
        }
    }

    @Override
    public void comer(Ecosistema eco) {
        boolean encontroComida = false;
        
        /* CUANDO ISMA TERMINE ECOSISTEMA, SE DESCOMENTA ESTO:
        for (Planta p : eco.getPlantas()) {
            if (p.isViva()) {
                double nutrientes = p.serComida();
                setEnergia(getEnergia() + nutrientes);
                System.out.println(getNombre() + " comió a " + p.getNombre() + " (+" + nutrientes + " energia)");
                encontroComida = true;
                break;
            }
        }
        */

        if (!encontroComida) {
            setEnergia(getEnergia() - 15); // penalidad
            System.out.println(getNombre() + " no encontró comida (-15 energia).");
        }
    }

    @Override
    public void mostrarEstado() {
        String alerta = (getEnergia() < 20) ? " [PELIGRO]" : "";
        System.out.println("Conejo: " + getNombre() + " | Energía: " + getEnergia() + alerta);
    }

    @Override
    public boolean puedeReproducirse() {
        boolean hayOtroConejo = false;
        
        /* CUANDO ISMA TERMINE ECOSISTEMA, SE DESCOMENTA ESTO:
        for (Conejo c : eco.getConejos()) {
            if (c.isViva() && !c.equals(this)) {
                hayOtroConejo = true;
                break;
            }
        }
        */
        
        return isViva() && getEnergia() > 60 && hayOtroConejo;
    }

    @Override
    public void reproducirse(Ecosistema eco) {
        setEnergia(getEnergia() - 25);
        System.out.println(getNombre() + " tuvo una cría.");
        // eco.agregarEntidad(new Conejo(getNombre() + "-Cria", 30, getVelocidad(), 1.5));
    }
}