/*
//Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100; después de haber 
//llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse e imprimir los números pares e impares. Ejemplo
//Números pares: 2, 4, 6, 8, 10
//Números impares: 1, 3, 5, 7, 9
 */
package MODELO;

import javax.swing.JOptionPane;



/**
 *
 * @author Camilo
 */
public class Class_Ejer_02 {
    public void ArregloNumeroAleatorios() {
        
        int num,i,cont=0;
        //Se crea el array
        int [] numeros;
        //y se delimita que tan grande es
        numeros = new int [20];
        //ahora hacemos el circuito que recorre dicho arreglo
        //y lo que va a imprimira
        
  while ( cont <= 19 )
  {
     //numeros random
   numeros[cont]= (int) (Math.random()* (10+1));
   cont++;
  }
  cont = 1;
  //mostrar numeros pares
  JOptionPane.showMessageDialog(null,"Numero Pares");
  System.out.println("Numero Pares\n");
  while (cont <=19)
  {
      i = numeros[cont]%2;
      if (i == 0)
      {
          System.out.printf(cont+".[ "+numeros[cont]+" ] , ");
          cont++;
      }else
      {
          cont++;
      }
  }
  //mostrar numeros impares
  cont = 1;
  JOptionPane.showMessageDialog(null,"Numero Impares\n");
  System.out.println("\nNumero Impares");
  while (cont <= 19)
  {
      i=numeros[cont]%2;
      if (i == 1)
      {
         System.out.printf(cont+".[ "+numeros[cont]+" ] , ");
          cont++; 
      }else
      {cont++;
      }
  }
}
}
/*System.out.println("numeros[ "+numeros[1]+"]");
  System.out.println("numeros[ "+numeros[2]+"]");
  System.out.println("numeros[ "+numeros[3]+"]");
  System.out.println("numeros[ "+numeros[4]+"]");
  System.out.println("numeros[ "+numeros[5]+"]");
 i = Integer.parseInt(JOptionPane.showInputDialog("Ingre el campo "+cont+" a llenar del array: "));
  numeros[cont]=i;
  JOptionPane.showMessageDialog(null, cont+". numeros[ "+numeros[cont]+"]");
  System.out.println(cont+". numeros[ "+numeros[cont]+"]");
  cont++;*/