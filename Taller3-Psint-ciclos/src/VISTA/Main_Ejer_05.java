/*
Utilizando el ciclo que usted desee, crear un menú de ejecución infinita 
hasta que el usuario desee terminar dicho ciclo.
 */
package VISTA;

import MODELO.Class_Ejer_05;

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
      Class_Ejer_05 Infinidad=new Class_Ejer_05(); 
      //NO definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      Infinidad.CicloInfinidad();
    }
    
}
