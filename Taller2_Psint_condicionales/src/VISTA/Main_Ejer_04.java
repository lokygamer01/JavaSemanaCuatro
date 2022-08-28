/*
La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una 
aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. Para cada usuario se debe 
permitir la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con 
la opción de realizar anotaciones sobre estas si se llegan a presentar daños u otra novedad sobre la película.
 */
package VISTA;

import MODELO.Class_Ejer_04;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
//	definir nom_cliente Como Caracter;
//	Definir nit Como Entero;
//	definir pelicula Como Caracter;
//	definir precio Como Real;
//	definir tiempo Como entero;
//	Definir total como real;
//	definir obsevacion Como Caracter;
//	definir opcion como entero;
//	definir opcion2 como entero;
public class Main_Ejer_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_04  Porvenir=new Class_Ejer_04(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nom_cliente;
      int nit;
      nom_cliente=JOptionPane.showInputDialog("INGRESE EL NOMBRE DE CLIENTE: ");
      nit=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NIT DEL CLIENTE: "));
      // con ayuda del objeto "edadif" se llama el metodo de la clase
      Porvenir.Porvenir(nom_cliente,nit);
    }
    
}
