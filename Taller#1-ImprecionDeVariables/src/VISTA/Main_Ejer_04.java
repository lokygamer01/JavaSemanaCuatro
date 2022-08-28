/*
 */
package VISTA;

import MODELO.Class_Ejer_04;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
//Proceso capital_pais
//	definir capital Como Caracter;
//	definir pais Como Caracter;
//	escribir 'ingrese el nombre de una ciudad capital de un pais: ';
//	leer capital;
//	escribir 'ingrese el nombre del pais al cual pertenece la capital anterior: ';
//	leer pais;
//	Limpiar Pantalla;
//	escribir "la ciudad ",capital," es la capital del pais ",pais,;
//FinProceso

public class Main_Ejer_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_04  nomsta=new Class_Ejer_04(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String pais, capital ;
      pais=JOptionPane.showInputDialog("ingrese el nombre de una ciudad capital de un pais: ");
      capital=JOptionPane.showInputDialog("ingrese el nombre del pais al cual pertenece la capital anterior: ");
      // con ayuda del objeto "mayor" se llama el metodo de la clase
      nomsta.MetodoNombrePais( pais, capital);
    }
    
}
