/*
//Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, deberá mostrar en pantalla: 
Usted aún es un niño(a).
 */
package VISTA;

import MODELO.Class_Ejer_02;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
//Proceso menor_edad
//	definir edad Como Entero;
//	escribir "por favor ingrese su edad";
//	leer edad;
//	si edad < 18 Entonces
//		escribir "Usted es menor de edad";
//	FinSi
//FinProceso
public class Main_Ejer_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_02  edadif=new Class_Ejer_02(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      int edad;
      edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
      // con ayuda del objeto "edadif" se llama el metodo de la clase
      edadif.MetodoEdad( edad);
    }
    
}
