/*
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_03 {
     public void MetodoNombrePadres(String nombre, String nom_mad,String nom_pad)
 {
   
     // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "SU NOMBRE ES: "+nombre);
      JOptionPane.showMessageDialog(null, "El NOMBRE DE SU MADRE ES: "+nom_mad);
      JOptionPane.showMessageDialog(null, "SU NOMBRE DE SU PADRE ES: "+nom_pad);
      // y se muestra en consola tambien para que se vea  bien 
      System.out.println("SU NOMBRE ES: "+nombre);
      System.out.println("El NOMBRE DE SU MADRE ES: "+nom_mad);
      System.out.println("El NOMBRE DE SU PADRE ES: "+nom_pad);
   
   }
}
