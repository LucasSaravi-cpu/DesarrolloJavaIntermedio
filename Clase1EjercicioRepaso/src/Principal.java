/*
Diseño de Sistemas hay que cursar Paradigmas de Programación y antes de ésta hay que
cursar Algoritmos y Estructuras de Datos, donde esta última no tiene correlativas.
Teniendo en cuenta que el método principal del presente módulo debe ser el método
“boolean aprobada()” de la clase Inscripción, y teniendo como restricción que solamente se
podrán utilizar, además de la clase Inscripción, la clase Materia y Alumno;


alumno
  String nombre
  String apellido
  ^
  |
  |
  |
  |
  
inscripcion
  Alumno alumno
  materia materia
  
  ---------------
  metodo boolean 
  |
  |
  |
  |
  v
materias
string nombre 
lista de materias correlativas
 
 


*/


import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		
        Alumno alumno = new Alumno("lucas", "saravi");

        // Crear Materias
        Materia estructurasDeDatos = new Materia("Algoritmos");
        Materia programacionA = new Materia("Programacion estructurada");
        Materia programacionB = new Materia("Paradigmas de Programacion orientado a objetos");

        // Establecer correlativas
        programacionA.agregarCorrelativa(estructurasDeDatos);
        programacionB.agregarCorrelativa(programacionA);

        // Crear inscripciones
        Inscripcion inscripcion1 = new Inscripcion(alumno, estructurasDeDatos);
        Inscripcion inscripcion2 = new Inscripcion(alumno, programacionA);
        Inscripcion inscripcion3 = new Inscripcion(alumno, programacionB);

        // Materias aprobadas
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(estructurasDeDatos); // Supongamos que esta materia ya está aprobada
        materiasAprobadas.add(programacionA); // Supongamos que esta materia ya está aprobada

        // Mostrar materias en las que se inscribió el alumno
        System.out.println("Materias en las que se inscribió el alumno:");
        System.out.println("1. " + inscripcion1.aprobada(materiasAprobadas) + " - " + inscripcion1.getMateria().getNombre());
        System.out.println("2. " + inscripcion2.aprobada(materiasAprobadas) + " - " + inscripcion2.getMateria().getNombre());
        System.out.println("3. " + inscripcion3.aprobada(materiasAprobadas) + " - " + inscripcion3.getMateria().getNombre());

        // Verificar si el alumno puede cursar la tercera materia
        if (inscripcion3.aprobada(materiasAprobadas)) {
            System.out.println("El alumno puede cursar " + inscripcion3.getMateria().getNombre());
        } else {
            System.out.println("El alumno no puede cursar " + inscripcion3.getMateria().getNombre() + " debido a correlativas no aprobadas.");
        }
    





        
       
    }
	}


