/*
1. Realizar la siguiente figura por medio del ciclo Para
 */
package VISTA;

import MODELO.Class_Ejer_01;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_01 escalad=new Class_Ejer_01(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      String vineta3;
      vineta3 = "* ";
      escalad.escala(vineta3);
    }
    
}
