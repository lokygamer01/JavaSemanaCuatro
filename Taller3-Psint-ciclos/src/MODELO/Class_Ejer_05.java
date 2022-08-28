/*
Utilizando el ciclo que usted desee, crear un menú de ejecución infinita 
hasta que el usuario desee terminar dicho ciclo.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_05 {
    public void CicloInfinidad() {
        String nombre;
        Double cont = Double.parseDouble(JOptionPane.showInputDialog("## Menú de Usuario ##\n"
                + "1. Ingresar nombre: \n"
                + "2. Saludar persona: \n"
                + "3. Salir del Sistema: "));
      
      while (cont<=2)
      {
      cont=Double.parseDouble(JOptionPane.showInputDialog("## Menú de Usuario ##\n"
                  + "1. Ingresar nombre: \n"
                  + "2. Saludar persona: \n"
                  + "3. Salir del Sistema: "));
      if (cont==1)
      {
       nombre=JOptionPane.showInputDialog("Ingrese su nombre : ");
       System.out.println("nombre ingresado: "+nombre);
      }
      if (cont==2)
      {
       System.out.println("Buen Dia Amigo");
      }
      if (cont==3)
      {
          System.out.println("Bye");
      }
       }
      
}
}
