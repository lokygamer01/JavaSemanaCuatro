/*
//Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; después de haber 
//llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse e imprimir los números pares e impares. Ejemplo
//Números pares: 2, 4, 6, 8, 10
//Números impares: 1, 3, 5, 7, 9
 */
package VISTA;

import MODELO.Class_Ejer_02;

/**
 *
 * @author Camilo
 */
public class Main_Class_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_02 Imp=new Class_Ejer_02(); 
      //definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      Imp.ArregloNumeroAleatorios();
    }
    
}
