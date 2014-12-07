/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class Jugador {

    private String nombre;
    private String Edad;
    private String Posicion;
    private Rendimiento rendimiento;
    private Disciplina disciplina;
    private Habilidades habilidades;
    private double partidos;

    public Jugador() {

    }

    public Jugador(String nombre, String Edad, String Posicion, Rendimiento rendimiento, Disciplina disciplina, Habilidades habilidades, double partidos) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.Posicion = Posicion;
        this.rendimiento = rendimiento;
        this.disciplina = disciplina;
        this.habilidades = habilidades;
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public Rendimiento getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Rendimiento rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public double getPartidos() {
        return partidos;
    }

    public void setPartidos(double partidos) {
        this.partidos = partidos;
    }

   ////       public String presentar(String s) {
////        comparar(s);
////        return s;
////    }
public List cargarJugadores(){
        List list= new ArrayList();
                                    //regate paseL paseC Reaccion
        Habilidades h1= new Habilidades(4.0, 32.3, 1.5, 13.4);
        Habilidades h2= new Habilidades(3.6, 32.0, 2.0, 11.0);
        Habilidades h3= new Habilidades(3.2, 31.0, 2.2, 12.0);
        Habilidades h4= new Habilidades(4.5, 33.0, 1.9, 10.2);
        Habilidades h5= new Habilidades(2.7, 34.0, 1.8, 11.2);
        Habilidades h6= new Habilidades(4.3, 33.5, 2.1, 9.2);
        Habilidades h7= new Habilidades(3.6, 32.0, 2.2, 14.2);
        Habilidades h8= new Habilidades(3.0, 31.0, 2.0, 13.0);
        Habilidades h9= new Habilidades(3.8, 35.0, 1.7, 12.2);
        Habilidades h10= new Habilidades(3.9, 37.0, 1.4, 14.2);
        
                                //alimentacion entrena
        Disciplina d1= new Disciplina("buena", "bueno");
        Disciplina d2= new Disciplina("buena", "malo");
        Disciplina d3= new Disciplina("mala", "bueno");
        Disciplina d4= new Disciplina("regular", "malo");
        Disciplina d5= new Disciplina("mala", "bueno");
        Disciplina d6= new Disciplina("regular", "regular");
        Disciplina d7= new Disciplina("buena", "bueno");
        Disciplina d8= new Disciplina("mala", "malo");
        Disciplina d9= new Disciplina("regular", "bueno");
        Disciplina d10= new Disciplina("buena", "regular");
                                   //(resist,    pot,  pulm Veldad Salto)
        Rendimiento r1= new Rendimiento("buena", 23.2, 34.3, 3.0 , 2.0 );
        Rendimiento r2= new Rendimiento("buena", 20.2, 32.2, 2.0 , 2.2 );
        Rendimiento r3= new Rendimiento("buena", 21.2, 31.3, 5.0 , 1.8 );
        Rendimiento r4= new Rendimiento("buena", 24.2, 24.3, 6.0 , 1.6 );
        Rendimiento r5= new Rendimiento("buena", 25.2, 26.3, 4.2 , 1.3 );
        Rendimiento r6= new Rendimiento("buena", 22.2, 30.0, 4.5 , 2.1 );
        Rendimiento r7= new Rendimiento("buena", 26.2, 32.5, 3.6 , 1.4 );
        Rendimiento r8= new Rendimiento("buena", 27.2, 31.4, 3.4 , 1.3 );
        Rendimiento r9= new Rendimiento("buena", 28.2, 28.4, 2.8 , 2.4 );
        Rendimiento r10= new Rendimiento("buena", 20.3, 25.7, 2.4 , 2.6 );
        
        Jugador j1= new Jugador("Maximo_Manguera", "27", "portero", r1, d1, h1, 15);
        Jugador j2= new Jugador("Alexander_Dominguez", "25","portero",r2,d2,h2, 14);
        Jugador j3= new Jugador("Adrian_Bone", "27",  "portero", r3, d3, h3, 15);

        Jugador j4= new Jugador("Gabriel_Achilier","25","defensa",r4,d4,h4,21);
        Jugador j5= new Jugador("friczon Erazo","26","defensa",r5,d5,h5,23);
        
        Jugador j8= new Jugador("Cristian Noboa","28","volante",r8,d8,h8,20);
        Jugador j9= new Jugador("Pedro Quiñonez ","27","volante",r9,d9,h9,21);
        Jugador j10= new Jugador("Antonio Valencia","25","volante",r10,d10,h10,19);
        
        Jugador j6= new Jugador("Enner Valencia","24","delantero",r6,d6,h6,20);
        Jugador j7= new Jugador("Felipe Caicedo","23","delantero",r7,d7,h7,19);
        
        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);
        list.add(j5);
        list.add(j6);
        list.add(j7);
        list.add(j8);
        list.add(j9);
        list.add(j10);
        return list;
    }
    @Override
    public String toString() {
        return "Jugadores:" + "Nombre: " + nombre + " Edad: " + Edad + " Posicion: " + Posicion;
    }
}
