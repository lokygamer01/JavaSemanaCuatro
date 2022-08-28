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
    public void Porvenir(String nom_cliente, int nit)
 {
    int opcion,opcion2,tiempo = 0;
    String pelicula = null,obsevacion;
    Double precio = null,total;
    //ahora pedimos los datos para el proceso de alquilar la pelicula
    opcion=Integer.parseInt(JOptionPane.showInputDialog(" video peliculas el Porvenir "
    + "\n"
    +" Las peliculas disponibles son:\n"+
    "1. Titanic (romanse,drama) $ 5.99\n"+
    "2. rapidos y furiosos 9 (acción,ficción) $ 10.30\n"+
    "3. Midsommar (Terror) $ 6.15\n"
    ));
   switch (opcion)
   {
       case 1:
           JOptionPane.showInputDialog(null,"1. Titanic (romanse,drama) $ 5.99");
           pelicula=" Titanic(romanse,drama)";
           precio=5.99;
           break;
       case 2:
           JOptionPane.showInputDialog(null,"2. rapidos y furiosos 9 (acción,ficción) $ 10.30");
           pelicula=" 2. rapidos y furiosos 9 (acción,ficción)";
           precio=10.30;
           break;
       case 3:
           JOptionPane.showInputDialog(null," Titanic(romanse,drama) ");
           pelicula="3. Midsommar (Terror) $ 6.15 ";
           precio=6.15;
           break;
   }
   opcion2=Integer.parseInt(JOptionPane.showInputDialog("cuanto tiempo quiere alquilar: "
    + "\n"
    +" 1. una semana\n"+
    "2. un mes\n"+
    "3. un año\n"
    ));
   switch (opcion)
   {
       case 1:
           tiempo = 7;
           break;
       case 2:
           tiempo = 30;
           break;
       case 3:
           tiempo = 365;
           break;
   }
   //hacemos calculos y luego imprimimos todo en consola y por el joptionpane
   total=(tiempo*precio);
   obsevacion=JOptionPane.showInputDialog("Ingrese obsevacion: ");
   JOptionPane.showMessageDialog(null, "@@@ Pelicula alquilada con extio\n"
           + "\n"
           + "Nombre: "+nom_cliente+"\n"
           + "Nit: "+nit+"\n"
           + "pelicula: "+pelicula+"\n"
           + "precio: $ "+precio+"\n"
           + "tiempo: "+tiempo+"\n"
           + "El total a pagar es: $ "+total+"\n"
           + "\n"
           + "obsevacion: "+obsevacion+"\n");
      System.out.println("@@@ Pelicula alquilada con extio\n"
              + "\n"
              + "Nombre: \n"
              + "Nit: ");
   
   }
}
