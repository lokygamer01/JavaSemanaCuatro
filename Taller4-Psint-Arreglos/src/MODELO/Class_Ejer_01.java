/*
//El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda debe estar previamente calculado en una matriz 
//bidimensional la cual cada resultado obedecerá a la fila y columna insertada por el usuario.

 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_01 {
    public void Llenar_5_Pocisiones() {
        int i,cont=0;
        //Se crea el array
        int [] numeros;
        //y se delimita que tan grande es
        numeros = new int [5];
        //ahora hacemos el circuito que recorre dicho arreglo
        //y lo que va a imprimira
  while ( cont <= 4 )
  {
  i = Integer.parseInt(JOptionPane.showInputDialog("Ingre el campo "+cont+" a llenar del array: "));
  numeros[cont]=i;
  JOptionPane.showMessageDialog(null, cont+". numeros[ "+numeros[cont]+"]");
  System.out.println(cont+". numeros[ "+numeros[cont]+"]");
  cont++;
  }
  
  /*System.out.println("numeros[ "+numeros[1]+"]");
  System.out.println("numeros[ "+numeros[2]+"]");
  System.out.println("numeros[ "+numeros[3]+"]");
  System.out.println("numeros[ "+numeros[4]+"]");
  System.out.println("numeros[ "+numeros[5]+"]");*/
  
}
}
