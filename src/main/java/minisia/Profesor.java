/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minisia;

/**
 *
 * @author a17x_
 */
public class Profesor {
    
    String nombre = "No informado";
    String facultad = "No informado";
    long cedula;
    long telefono;
    String correo = "No informado";
    
    public Profesor(String nombre, String facultad, long cedula){
        this.nombre = nombre;
        this.facultad = facultad;
        this.cedula = cedula;
    }
    public Profesor(String nombre, String facultad, long cedula, long telefono){
        this.nombre = nombre;
        this.facultad = facultad;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    public Profesor(String nombre, String facultad, long cedula, String correo){
        this.nombre = nombre;
        this.facultad = facultad;
        this.cedula = cedula;
        this.correo = correo;
    }
    public Profesor(String nombre, String facultad, long cedula,long telefono, String correo){
        this.nombre = nombre;
        this.facultad = facultad;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }
    void info(){
    System.out.println("Nombre del profesor: "+ nombre);
    System.out.println("Documento: "+ cedula);
    System.out.println("Telefono: "+ telefono);
    System.out.println("Correo: "+ correo);
    System.out.println("Facultad: "+facultad);
    }
    int calcularCarga(int materias){
    return materias;
}

int calcularCarga(int materias, int horasPorMateria){
    return materias * horasPorMateria;
}
    
}
