
package VISTA;
import MODELO.Class_Ejer_01;
import javax.swing.JOptionPane;
/**
 *
 * @author Camilo
 */
//Proceso Nombre_y_apellidos
//	//definir las variables
//	Definir nombre,apellido Como Caracter;
//	//pedimos los datos
//	Escribir "Ingrese su nombre: ";
//	Leer nombre;
//	Escribir "ingrese su apellido: ";
//	leer apellido;
//	
//FinProceso

public class Main_Ejer_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_01  nom=new Class_Ejer_01(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nombre, apellido ;
      nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE");
      apellido=JOptionPane.showInputDialog("INGRESE SU APELLIDO");
      // con ayuda del objeto "mayor" se llama el metodo de la clase
      nom.MetodoNombre(nombre, apellido);
    }
    
}
