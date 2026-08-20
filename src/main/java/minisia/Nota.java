/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minisia;

/**
 *
 * @author a17x_
 */
public class Nota {
    
    float calificacion;
    String tipo = "No informado";
    String fecha = "No informado";
    String estudiante = "No informado";
    String materia = "No informado";
    
    public Nota(float calificacion,String materia, String estudiante){
        this.calificacion = calificacion;
        this.materia = materia;
        this.estudiante = estudiante;
    }
    public Nota(float calificacion,String materia, String estudiante, String tipo){
        this.calificacion = calificacion;
        this.materia = materia;
        this.estudiante = estudiante;
        this.tipo = tipo;
    }
    public Nota(float calificacion,String materia, String estudiante, String tipo,String fecha){
        this.calificacion = calificacion;
        this.materia = materia;
        this.estudiante = estudiante;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    float calcular(){
        return calificacion;
    }

    float calcular(float extra){
        return calificacion + extra;
    }
    void info(){
    System.out.println("Nombre de la materia: "+ materia);
    System.out.println("Nombre del estudiante: "+ estudiante);
    System.out.println("Tipo de nota: "+ tipo);
    System.out.println("Fecha de la nota: "+ fecha);
    System.out.println("Calificacion: "+calificacion);
    }
    
}
