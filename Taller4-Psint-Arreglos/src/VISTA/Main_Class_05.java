/*
//El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda debe estar previamente calculado en una matriz 
//bidimensional la cual cada resultado obedecerá a la fila y columna insertada por el usuario.

 */
package VISTA;

import MODELO.Class_Ejer_05;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Main_Class_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_05 Imp=new Class_Ejer_05(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      int columna,fila;
      columna=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Columna: "));
      fila=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Fila: "));
      Imp.tablas_de_multiplicar(columna,fila);
    }
    
}
