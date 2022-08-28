/*
//Dada la siguiente matriz bidimensional, el cual debe de quemar en el código
//01 02 03 04 05
//06 07 08 09 10
//11 12 13 14 15
//16 17 18 19 20
//Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima la siguiente matriz bidimensional.
//01 02 03 04 05
//10 09 08 07 06
//11 12 13 14 15
//20 19 18 17 16
 */
package VISTA;

import MODELO.Class_Ejer_04;

/**
 *
 * @author Camilo
 */
public class Main_Class_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_04 Imp=new Class_Ejer_04(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      Imp.ImprimirUnaMatriz();
    }
    
}
