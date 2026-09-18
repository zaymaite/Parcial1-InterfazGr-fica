/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorecosistema;

/**
 *
 * @author Educacion
 */
public enum Clima {
    SOLEADO(1.5, 5.0, 0.0, 0.0),
    LLUVIOSO(2.0, 3.0, -5.0, 0.0),
    SEQUIA(0.5, -5.0, 0.0, 0.0),
    INVIERNO(0.0, -8.0, 0.0, 0.20);
    
    private final double multiplicadorReproduccionPlantas;
    private final double efectoEnergiaConejo;
    private final double efectoEnergiaLobo;
    private final double bonusExitoCazaLobo;
    
    Clima(double multiplicadorReproduccionPlantas,
          double efectoEnergiaConejo,
          double efectoEnergiaLobo,
          double bonusExitoCazaLobo) {
        this.multiplicadorReproduccionPlantas = multiplicadorReproduccionPlantas;
        this.efectoEnergiaConejo = efectoEnergiaConejo;
        this.efectoEnergiaLobo = efectoEnergiaLobo;
        this.bonusExitoCazaLobo = bonusExitoCazaLobo;
    }

    public double getMultiplicadorReproduccionPlantas() {
        return multiplicadorReproduccionPlantas;
    }

    public double getEfectoEnergiaConejo() {
        return efectoEnergiaConejo;
    }

    public double getEfectoEnergiaLobo() {
        return efectoEnergiaLobo;
    }

    public double getBonusExitoCazaLobo() {
        return bonusExitoCazaLobo;
    }
}
