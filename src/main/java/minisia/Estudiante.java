/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minisia;


/**
 *
 * @author a17x_
 */
public class Estudiante {
    String nombre = "No informado";
    long cedula;
    String carrera = "No informado";
    String facultad = "No informado";
    float promedio;
    Inscripcion inscripciones[] = new Inscripcion[10];
    int contador = 0;
    
    public Estudiante(String nombre, String carrera, long cedula){
    this.nombre = nombre;
    this.carrera = carrera;
    this.cedula = cedula;
    }
    public Estudiante(String nombre, String carrera,String facultad, long cedula){
    this.nombre = nombre;
    this.carrera = carrera;
    this.cedula = cedula;
    this.facultad = facultad;
    }
    public Estudiante(String nombre, String carrera,String facultad, long cedula, float promedio){
    this.nombre = nombre;
    this.carrera = carrera;
    this.cedula = cedula;
    this.facultad = facultad;
    this.promedio = promedio;
    }
   void inscribir(String materia){
        inscripciones[contador] = new Inscripcion(nombre, materia);
        contador++;
    }

    void inscribir(String materia, float promedio){
        inscripciones[contador] = new Inscripcion(nombre, materia, promedio);
        contador++;
    }
    void info(){
    System.out.println("Nombre del estudiante: "+ nombre);
    System.out.println("Documento: "+ cedula);
    System.out.println("Carrera: "+ carrera);
    System.out.println("Promedio: "+ promedio);
    System.out.println("Facultad: "+facultad);
    System.out.println("Inscripciones del estudiante");
    for(int j = 0; j < contador; j++){
    System.out.println(
        inscripciones[j].materia + 
        " - Promedio: " + inscripciones[j].promedio
    );
    }
    }
    
}
