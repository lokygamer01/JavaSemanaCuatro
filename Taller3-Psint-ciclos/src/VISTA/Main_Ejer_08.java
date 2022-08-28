/*
//La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística y 
//establecer quienes lo han aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir registrar 
//su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). Recuerde 
//que el sistema debe terminar cuando el usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.
 */
package VISTA;

import MODELO.Class_Ejer_08;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_08 Escuela=new Class_Ejer_08(); 
      //NO definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      Escuela.EscuelAutomovilisticaElMaestro();
    }
    
}
