/*
// haces las tablas de multiplicar con el siclo de tu preferencia
 */
package VISTA;

import MODELO.Class_Ejer_04;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_04 Tablas=new Class_Ejer_04(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      int num;
      num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla de multiplicar que decea ver: "));
      Tablas.TablaMult(num);
    }
    
}
