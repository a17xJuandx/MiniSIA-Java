/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minisia;

/**
 *
 * @author a17x_
 */
public class Materia {
    
    int inscritos = 0;
    String profesor = "No informado";
    int creditos;
    String nombre = "No informado";
    int notas;
    
    public Materia(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public Materia(String nombre, int creditos, String profesor){
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    public Materia(String nombre, int creditos, String profesor, int notas){
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.notas = notas;
    }
    public Materia(String nombre, int creditos, String profesor, int notas, int inscritos){
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.inscritos = inscritos;
        this.notas = notas;
    }
    void agregarEstudiantes(){
        inscritos++;
    }

    void agregarEstudiantes(int cantidad){
        inscritos += cantidad;
    }
    void info(){
    System.out.println("Nombre de la materia: "+ nombre);
    System.out.println("Nombre del profesor: "+ profesor);
    System.out.println("Numero de creditos: "+ creditos);
    System.out.println("Numero de inscritos: "+ inscritos);
    System.out.println("Numero de notas de la asignatura: "+notas);
    }
    
    
}
