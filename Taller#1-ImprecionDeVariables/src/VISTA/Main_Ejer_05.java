/*
Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. 
Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], 
el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).
 */
package VISTA;

import MODELO.Class_Ejer_05;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_05 {

    /**
     * @param args the command line arguments
     */
    //Proceso La_mascota
//	definir nom_mascota Como Caracter;
//	definir edad como entero;
//	definir tipo como caracter;
//	definir nombre Como Caracter;
//	escribir "ingrese el nombre de su mascota: ";
//	leer nom_mascota;
//	escribir "ingrese la edad de su mascota: ";
//	leer edad;
//	escribir "ingrese el tipo de su mascota: ";
//	leer tipo;
//	escribir "ingrese su nombre: ";
//	leer nombre;
//	Limpiar Pantalla;
//	escribir nom_mascota," es un(a) ",tipo,", el cual, tiene ",edad," años de edad y ",nombre," es actualmente su dueño(a)";
//FinProceso
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_05  nommascota=new Class_Ejer_05(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nom_mascota, nombre, tipo ;
      int edad ;
      nom_mascota=JOptionPane.showInputDialog("ingrese el nombre de su mascota: ");
      edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad de su mascota: "));
      tipo=JOptionPane.showInputDialog("ingrese el tipo de su mascota: ");
      nombre=JOptionPane.showInputDialog("ingrese su nombre: ");
      // con ayuda del objeto "mayor" se llama el metodo de la clase
      nommascota.MetodoNombreMascota( nom_mascota, edad, tipo , nombre);
    }
    }
    

