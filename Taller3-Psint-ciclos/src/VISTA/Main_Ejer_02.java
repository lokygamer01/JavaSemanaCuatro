/*
//Realizar la siguiente figura por medio del ciclo Mientras - Hacer
//          *
//         **  
//        ***
//       ****
//      *****
//     ******
//    *******
//   ********
 */
package VISTA;

import MODELO.Class_Ejer_02;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_02 escalainver=new Class_Ejer_02(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      String vineta3;
      vineta3 = "* ";
      escalainver.escalainver(vineta3);
    }
    
}
