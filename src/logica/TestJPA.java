
package logica;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class TestJPA {

    public static void main(String[] args) {
        
        //Instanciar (Nota recordar que cuando es una clase va con Mayuscula y cuando es una variable u objeto es con minuscula
//        Alumno alumno = new Alumno("12353434", "Christian", "Rojas", new Date("10/09/24"));
//        
//        Alumno alumno2 = new Alumno("123", "Karina", "Arteaga", new Date("10/09/87"));
//        
//        //Instancia de la controladora de persistencia
        ControladoraPersistencia control = new ControladoraPersistencia();
//        control.crearAlumno(alumno2);
        
//        control.eliminarAlumno("453532");
//        alumno2.setApellido("Arteaga");
//        alumno2.setNombre("Ingrid");
//        
//        control.modificarAlumno(alumno2);

//          ControladoraPersistencia control = new ControladoraPersistencia();
//          
//          List <Alumno> listaAlumnos = control.traerAlumnos();
//          
//          System.out.println("A continuación se citan todos los alumnos:");
//          for(Alumno alu: listaAlumnos){ //Por cada alumno que se encuentra en la lista de alumnos
//              System.out.println("* " + alu.getDni() + " " + alu.getApellido() + " " + alu.getNombre());
//              
//          }

        Alumno alu = control.traerAlumnoEnParticular("123");
            System.out.println("* " + alu.getDni() + " " + alu.getApellido() + " " + alu.getNombre());
    }
    
}
