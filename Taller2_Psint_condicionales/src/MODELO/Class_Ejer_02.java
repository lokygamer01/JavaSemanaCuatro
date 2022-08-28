/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_02 {
     public void MetodoEdad(int edad)
 {
     if (edad <= 18)
   {  
       // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "Usted es menor de edad ");
      System.out.println("Usted es menor de edad ");
   }
 }
}
