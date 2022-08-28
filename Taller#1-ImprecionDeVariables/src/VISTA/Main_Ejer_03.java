/*
 */
package VISTA;

import MODELO.Class_Ejer_03;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_03 {

    /**
     * @param args the command line arguments
     */
    //Proceso nombre_padre_y_madre
//	definir nombre Como Caracter;
//	definir nom_madre Como Caracter;
//	definir nom_padre Como Caracter;
//	escribir 'Ingrese sus nombres y apellidos por favor: ';
//	leer nombre;
//	escribir 'Ingrese los nombres y apellidos de su madre por favor: ';
//	leer nom_madre;
//	escribir 'Ingrese los nombres y apellidos de su padre por favor: ';
//	leer nom_padre;
//	Limpiar Pantalla;
//	escribir "Yo ",nombre," soy hijo de ",nom_madre," y ",nom_padre;
//FinProceso

    public static void main(String[] args) {
           // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_03  nomparien=new Class_Ejer_03(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nom, nom_mad , nom_pad ;
      nom=JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
      nom_mad=JOptionPane.showInputDialog("INGRESE El NOMBRE DE SU MADRE: ");
      nom_pad=JOptionPane.showInputDialog("INGRESE EL NOMBRE DE SU PADRE: ");
      // con ayuda del objeto "nomparien" se llama el metodo de la clase
      nomparien.MetodoNombrePadres( nom, nom_mad, nom_pad );
    }
    
}
