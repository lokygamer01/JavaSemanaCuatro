/*
La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los productos que vende a sus 
clientes y para ello, los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. 
Para cada cliente, se tienen las opciones de compra de producto,consulta de precios por producto y devoluciones en caso de que se presenten.

 */
package VISTA;

import MODELO.Class_Ejer_05;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_05 Drogueria=new Class_Ejer_05(); 
      // Identificar tipo de datos de entrada y nombre a tres variables
      String nom_cliente;
      int nit;
      nom_cliente=JOptionPane.showInputDialog("INGRESE EL NOMBRE DE CLIENTE: ");
      nit=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NIT DEL CLIENTE: "));
      // con ayuda del objeto "edadif" se llama el metodo de la clase
      Drogueria.Drogueria_Mi_Salud(nom_cliente,nit);
    }
    
}
