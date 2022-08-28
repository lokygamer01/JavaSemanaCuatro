/*
Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. Si la persona es mayor o igual a 18 años, 
entonce se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta. 
Si la edad de la persona es menor que 18 años, entonces, 
deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, 
por favor devuélvase a su casa.
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
    //Proceso la_fiesta
//	definir nombre Como Caracter;
//	definir apellido Como Caracter;
//	definir edad Como Entero;
//	Escribir "Por favor ingrese su nombre: ";
//	leer nombre;
//	escribir "por favor ingrese su apellido: ";
//	leer apellido;
//	Escribir "por favor ingrese su edad: ";
//	leer edad;
//	si edad >=18 Entonces
//		Escribir nombre," ",apellido," usted es mayor de edad, por lo tanto puede entrar a a la fiesta";
//	sino 
//		Escribir nombre," ",apellido," usted es menor de edad, por lo tanto NO puede entrar a a la fiesta";
//	FinSi
//FinProceso
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_03  edadnom=new Class_Ejer_03(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nombre , apellido;
      int edad;
      nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
      apellido=JOptionPane.showInputDialog("INGRESE SU APELLIDO: ");
      edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD: "));
      // con ayuda del objeto "edadif" se llama el metodo de la clase
      edadnom.MetodoEdadNom(nombre,apellido, edad);
    }
    
}
