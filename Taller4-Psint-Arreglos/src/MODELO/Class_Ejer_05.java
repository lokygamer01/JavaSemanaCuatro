/*
//El usuario deberá insertar la fila y columna de la cual desea ver el resultado, el resultado de cada celda debe estar previamente calculado en una matriz 
//bidimensional la cual cada resultado obedecerá a la fila y columna insertada por el usuario.

 */
package MODELO;



/**
 *
 * @author Camilo
 */
public class Class_Ejer_05 {
    public void tablas_de_multiplicar(int f,int c) {
        
        int num,i,cont=0,a,b;
        //Se crea el array
        //y se delimita que tan grande es
        int numeros[][] = new int [11][11];
        //ahora hacemos el circuito que recorre dicho arreglo
        //y lo que va a imprimira
        for(a = 0 ; a<=10;a++)
        {
         //c=0;
         for(b=0;b<=10;b++)
         {
           numeros[a][b]=(a*b);
           System.out.printf("( "+numeros[a][b]+" )");
         }
         System.out.println("\n");
        }
        System.out.println("El resultado es: ( "+numeros[f][c]+" )");
 
}
}
