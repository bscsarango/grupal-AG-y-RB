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
public class Rendimiento {
    private String Resistencia;
    private double Potencia;
    private double CapacidadPulmonar;
    private double velocidad;
    private double Salto;

    public Rendimiento(String Resistencia, double Potencia, double CapacidadPulmonar, double velocidad, double Salto) {
        this.Resistencia = Resistencia;
        this.Potencia = Potencia;
        this.CapacidadPulmonar = CapacidadPulmonar;
        this.velocidad = velocidad;
        this.Salto = Salto;
    }

    public String getResistencia() {
        return Resistencia;
    }

    public void setResistencia(String Resistencia) {
        this.Resistencia = Resistencia;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double Potencia) {
        this.Potencia = Potencia;
    }

    public double getCapacidadPulmonar() {
        return CapacidadPulmonar;
    }

    public void setCapacidadPulmonar(double CapacidadPulmonar) {
        this.CapacidadPulmonar = CapacidadPulmonar;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getSalto() {
        return Salto;
    }

    public void setSalto(double Salto) {
        this.Salto = Salto;
    }
    
    

   }
