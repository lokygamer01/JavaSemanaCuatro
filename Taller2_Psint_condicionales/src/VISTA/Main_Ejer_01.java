/*
Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor o igual a 18 años, 
deberá mostrar en pantalla: Usted es mayor de edad.
 */
package VISTA;
import MODELO.Class_Ejer_01;
import javax.swing.JOptionPane;
/**
 *
 * @author Camilo
 */
//Proceso Mayor_de_edad
//	definir edad como entero;
//	escribir "por favor ingrese su edad: ";
//	leer edad;
//	si  edad >= 18  Entonces
//	Escribir "Usted es mayor de edad";
//FinSi
//FinProceso
public class Main_Ejer_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_01  edadif=new Class_Ejer_01(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      int edad;
      edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
      // con ayuda del objeto "edadif" se llama el metodo de la clase
      edadif.MetodoEdad( edad);
    }
    
}
