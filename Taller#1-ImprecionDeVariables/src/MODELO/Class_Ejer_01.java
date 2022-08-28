/*
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_01 {
   public void MetodoNombre(String nombre, String apellido)
 {
   
     // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "SU NOMBRE ES: "+nombre);
      JOptionPane.showMessageDialog(null, "SU APELLIDO ES: "+apellido);
      System.out.println("SU NOMBRE ES: "+nombre);
      System.out.println("SU APELLIDO ES: "+apellido);
   
   }
}
