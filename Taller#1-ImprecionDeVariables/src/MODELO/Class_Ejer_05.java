/*
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
//	escribir nom_mascota," es un(a) ",tipo,", el cual, tiene ",edad," años de edad y ",nombre," es actualmente su dueño(a)";
public class Class_Ejer_05 {
    public void MetodoNombreMascota( String nom_mascota, int edad, String tipo ,String nombre)
 {
   
     // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "es un(a) "+tipo+" el cual, tiene "+edad+" años de edad y "+nombre+" es actualmente su dueño(a) ");
      System.out.println("es un(a) "+tipo+" el cual, tiene "+edad+" años de edad y "+nombre+" es actualmente su dueño(a) ");
   
   }
}
