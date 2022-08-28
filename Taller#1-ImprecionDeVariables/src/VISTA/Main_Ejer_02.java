/*
 */
package VISTA;

import MODELO.Class_Ejer_02;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
//Proceso nombre_apellido_edad_estatura
//	//definimos variables 
//	definir nombre Como Caracter;
//	definir apellido Como Caracter;
//	definir edad Como entero;
//	definir estatura Como real;
//	
//	//pedimos los datos
//	Escribir "por favor ingrese su nombre: ";
//	leer nombre;
//	escribir "por favor ingrese su apellido: ";
//	leer apellido;
//	Escribir "por favor ingrese su edad: ";
//	leer edad;
//	escribir "por favor ingrese su estatura: ";
//	leer estatura;
//	
//FinProceso
public class Main_Ejer_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_02  nomsta=new Class_Ejer_02(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nombre, apellido ;
      int edad;
      boolean estatura;
      nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
      apellido=JOptionPane.showInputDialog("INGRESE SU APELLIDO: ");
      edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
      estatura=Boolean.parseBoolean(JOptionPane.showInputDialog("INGRESE SU ESTATURA: "));
      // con ayuda del objeto "mayor" se llama el metodo de la clase
      nomsta.MetodoNombreEdad( nombre, apellido, edad , estatura);
    }
    
}
