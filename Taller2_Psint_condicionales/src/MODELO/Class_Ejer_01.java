/*

 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_01 {
    public void MetodoEdad(int edad)
 {
     if (edad >= 18)
   {  
       // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "Usted es mayor de edad ");
      System.out.println("Usted es mayor de edad ");
   }
     
   
   }
}
