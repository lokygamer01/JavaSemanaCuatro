/*
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_02 {
    public void MetodoNombreEdad(String nombre, String apellido,int edad,boolean estatura)
 {
   
     // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "SU NOMBRE ES: "+nombre);
      JOptionPane.showMessageDialog(null, "SU APELLIDO ES: "+apellido);
      JOptionPane.showMessageDialog(null, "SU NOMBRE ES: "+edad);
      JOptionPane.showMessageDialog(null, "SU APELLIDO ES: "+estatura);
      System.out.println("SU NOMBRE ES: "+nombre);
      System.out.println("SU APELLIDO ES: "+apellido);
      System.out.println("SU NOMBRE ES: "+edad);
      System.out.println("SU APELLIDO ES: "+estatura);
   
   }
}
