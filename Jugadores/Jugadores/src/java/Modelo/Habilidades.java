/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class Habilidades {
    private double regate;
    private double paseLargo;
    private double paseCorto;
    private double capacidadReaccion;
    

    public Habilidades() {
    }

    public Habilidades(double regate, double paseLargo, double paseCorto, double capacidadReaccion) {
        this.regate = regate;
        this.paseLargo = paseLargo;
        this.paseCorto = paseCorto;
        this.capacidadReaccion = capacidadReaccion;
    }

    public double getRegate() {
        return regate;
    }

    public void setRegate(double regate) {
        this.regate = regate;
    }

    public double getPaseLargo() {
        return paseLargo;
    }

    public void setPaseLargo(double paseLargo) {
        this.paseLargo = paseLargo;
    }

    public double getPaseCorto() {
        return paseCorto;
    }

    public void setPaseCorto(double paseCorto) {
        this.paseCorto = paseCorto;
    }

    public double getCapacidadReaccion() {
        return capacidadReaccion;
    }

    public void setCapacidadReaccion(double capacidadReaccion) {
        this.capacidadReaccion = capacidadReaccion;
    }
    
    
    
}
