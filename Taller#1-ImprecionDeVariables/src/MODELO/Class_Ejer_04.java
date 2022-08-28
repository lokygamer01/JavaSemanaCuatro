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
public class Class_Ejer_04 {
    public void MetodoNombrePais(String capital, String pais)
 {
      // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, "la ciudad "+capital+" es la capital del pais "+pais);
      System.out.println("la ciudad "+capital+" es la capital del pais "+pais);
   }
}
