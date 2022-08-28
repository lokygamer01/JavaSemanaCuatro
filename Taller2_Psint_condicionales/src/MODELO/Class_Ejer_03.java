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
//	si edad >=18 Entonces
//		Escribir nombre," ",apellido," usted es mayor de edad, por lo tanto puede entrar a a la fiesta";
//	sino 
//		Escribir nombre," ",apellido," usted es menor de edad, por lo tanto NO puede entrar a a la fiesta";
//	FinSi
public class Class_Ejer_03 {
    public void MetodoEdadNom(String nombre, String apellido, int edad)
 {
     if (edad >= 18)
   {  
       // entrega de datos es con ayuda de ventana emergente
      JOptionPane.showMessageDialog(null, nombre+" "+apellido+" usted es mayor de edad, por lo tanto puede entrar a a la fiesta ");
      System.out.println(nombre+apellido+" usted es mayor de edad, por lo tanto puede entrar a a la fiesta ");
   }
     else
     {
     JOptionPane.showMessageDialog(null, nombre+" "+apellido+" usted es menor de edad, por lo tanto NO puede entrar a a la fiesta ");
      System.out.println(nombre+apellido+" usted es menor de edad, por lo tanto NO puede entrar a a la fiesta ");
     }
     
   
   }
}
