/*
candidato=Integer.parseInt(JOptionPane.showInputDialog("por cual candidato decea votar: \n"));
 */
package VISTA;

import MODELO.Class_Ejer_03;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_03 escalaTriangulo=new Class_Ejer_03(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      String vineta3;
      vineta3 = "* ";
      escalaTriangulo.escalaTriangulo(vineta3);
    }
    
}
