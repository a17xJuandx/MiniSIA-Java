/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minisia;

/**
 *
 * @author a17x_
 */
public class Inscripcion {
    
    String estudiante = "No informado";
    String materia = "No informado";
    float definitiva;
    float promedio;
    int disponibilidad = 30;
    
    public Inscripcion(String estudiante, String materia){
        this.estudiante = estudiante;
        this.materia = materia;
    }
    public Inscripcion(String estudiante, String materia,float promedio){
        this.estudiante = estudiante;
        this.materia = materia;
        this.promedio = promedio;
    }
    public Inscripcion(String estudiante, String materia,float promedio,float definitiva){
        this.estudiante = estudiante;
        this.materia = materia;
        this.promedio = promedio;
        this.definitiva = definitiva;
    }
     void calcularDefinitiva(){
        definitiva = promedio;
    }

    void calcularDefinitiva(float parcial1, float parcial2){
        definitiva = (parcial1 + parcial2) / 2;
    }
    void info(){
    System.out.println("Nombre de la materia: "+ materia);
    System.out.println("Nombre del estudiante: "+ estudiante);
    System.out.println("Disponibilidad: "+ disponibilidad);
    System.out.println("Promedio: "+ promedio);
    System.out.println("Definitiva: "+definitiva);
    }
}
