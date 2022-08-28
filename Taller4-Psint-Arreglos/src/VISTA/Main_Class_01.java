/*
//El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda debe estar previamente calculado en una matriz 
//bidimensional la cual cada resultado obedecerá a la fila y columna insertada por el usuario.

 */
package VISTA;

import MODELO.Class_Ejer_01;

/**
 *
 * @author Camilo
 */
public class Main_Class_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_01 Imp=new Class_Ejer_01(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      Imp.Llenar_5_Pocisiones();
    }
    
}
