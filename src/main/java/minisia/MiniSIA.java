/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package minisia;

/**
 *
 * @author a17x_
 */
public class MiniSIA {

    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante("Juan", "Sistemas", 123);
        Estudiante e2 = new Estudiante("Ana", "Derecho", "Sociales", 456, 4.5f);

     
        Profesor p1 = new Profesor("Carlos", "Ingenieria", 111);
        Profesor p2 = new Profesor("Luis", "Ingenieria", 222, 300123456, "luis@unal.edu.com");

        
        Materia m1 = new Materia("Matematicas", 3);
        Materia m2 = new Materia("Programacion", 4,"Alberto Guitierrez",5);

        
        Inscripcion i1 = new Inscripcion("Juan", "Matematicas");
        Inscripcion i2 = new Inscripcion("Ana", "Programacion", 4.0f, 3.8f);

        
        Nota n1 = new Nota(4.5f, "Matematicas", "Juan");
        Nota n2 = new Nota(3.8f, "Programacion", "Ana", "Parcial 1", "15 Septiembre");

        
        e1.inscribir("Matematicas");
        e1.inscribir("Programacion", 4.0f);

        e2.inscribir("Derecho");
        e2.inscribir("Civil", 3.5f);

       
        i1.calcularDefinitiva();
        i2.calcularDefinitiva(3.0f, 4.5f);

        
        m1.agregarEstudiantes();
        m2.agregarEstudiantes(5);

        
        float r1 = n1.calcular();
        float r2 = n2.calcular(0.5f);
        
        int carga1 = p1.calcularCarga(3);
        int carga2 = p2.calcularCarga(2, 4);
        
        System.out.println("Informacion del profesor ");
        p1.info();
        System.out.println("Carga profesor 1: " + carga1);
        System.out.println();
        System.out.println("Informacion del profesor ");
        p2.info();
        System.out.println("Carga profesor 2: " + carga2);
        System.out.println();
        System.out.println("Informacion del estudiante ");
        e1.info();
        System.out.println();
        
        System.out.println("Informacion del estudiante ");
        e2.info();
        System.out.println();
        
        System.out.println("Informacion de la materia ");
        m1.info();
        System.out.println();
        System.out.println("Informacion de la materia ");
        m2.info();
        System.out.println();
        System.out.println("Informacion de la inscripcion ");
        i1.info();
        System.out.println();
        System.out.println("Informacion de la inscripcion ");
        i2.info();
        System.out.println();
        System.out.println("Informacion de la nota ");
        n1.info();
        System.out.println();
        System.out.println("Informacion de la nota ");
        n2.info();
        System.out.println();
    }
}
