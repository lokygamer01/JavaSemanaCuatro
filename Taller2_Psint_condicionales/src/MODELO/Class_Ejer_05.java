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
public class Class_Ejer_05 {
     public void Drogueria_Mi_Salud(String nom_cliente, int nit)
 {
    int opciproducto,cantidad,tiempo = 0,devolucion = 0;
    String producto = null,obsevacion;
    double precio = 0 ,total;
    //ahora pedimos los datos para el proceso de alquilar la pelicula
    opciproducto=Integer.parseInt(JOptionPane.showInputDialog("---Drogueria Mi Salud---"
    + "\n"
    +" que producto decesa comprar:\n"+
    "1. Acetaminofen x10 $2.500 \n"+
    "2. Dolex x12 $4.000\n"+
    "3. ibuprofeno x9 $5.000\n"
    +"4. pañales winny x20 $30.000\n"
    + "5. Crema Colgate x1 $9.000\n"
    + "6. tequila Gran malo $90.000"
    ));
   switch (opciproducto)
   {
       case 1:
           JOptionPane.showInputDialog(null,"1. Acetaminofen x10 $2.500 ");
           producto="Acetaminofen x10 ";
           precio=2500;
           break;
       case 2:
           JOptionPane.showInputDialog(null,"2. Dolex x12 $4.000");
           producto="Dolex x12";
           precio=4000;
           break;
       case 3:
           JOptionPane.showInputDialog(null,"3. ibuprofeno x9 $5.000");
           producto="ibuprofeno x9";
           precio=5000;
           break;
       case 4:
           JOptionPane.showInputDialog(null,"4. pañales winny x20 $30.000 ");
           producto="pañales winny x20";
           precio=30000;
           break;
      case 5:
           JOptionPane.showInputDialog(null,"5. Crema Colgate x1 $9.000");
           producto="Crema Colgate x1";
           precio=9000;
           break;
      case 6:
           JOptionPane.showInputDialog(null,"6. tequila Gran malo $90.000");
           producto="tequila Gran malo";
           precio=90000;
           break;
   }
   cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad: "));
   total = (precio * cantidad);
   //ahora hacemos la esctructura de la factura, limpiando la pantalla
   JOptionPane.showMessageDialog(null, "**** Factura SETT-250 \n"
           + "\n"
           + "Nombre: "+nom_cliente+"\n"
           + "Nit: "+nit+"\n"
           + "* "+producto+" $ "+precio+" cantidad: "+cantidad+"\n"
           + "El total a pagar es: $ "+total+"\n"
           + "\n");
   //hacer la devolucion si lo requiere
      
   switch (opciproducto)
   {
       case 1:
           devolucion = 1;
           break;
       case 2:
           devolucion = 2;
           break;
   }
   //se muestra la devolucion
   if (devolucion == 1)
   {
       JOptionPane.showMessageDialog(null, "**** Devolucion de Compra **** \n"
              + "\n"
              + "Nombre: "+nom_cliente+"\n"
              + "Nit: "+nit+"\n"
              + "* "+producto+" $ "+precio+" cantidad: "+cantidad+"\n"
              + "devolucion: "+total
      );
   }
   else
   {
       JOptionPane.showMessageDialog(null," Gracias pro su compra :) ");
   }
   
   
   }
}
