/*
//Dada la siguiente matriz bidimensional, el cual debe de quemar en el código
//01 02 03 04 05
//06 07 08 09 10
//11 12 13 14 15
//16 17 18 19 20
//Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima la siguiente matriz bidimensional.
//01 02 03 04 05
//10 09 08 07 06
//11 12 13 14 15
//20 19 18 17 16
 */
package MODELO;



/**
 *
 * @author Camilo
 */
public class Class_Ejer_04 {
    public void ImprimirUnaMatriz() {
        
        int numeros,i,cont,f,c;
        //Se crea el array
        //y se delimita que tan grande es
       int num [][] = new int [4][5];
        //ahora hacemos el circuito que recorre dicho arreglo
        //vamos a quemar todos los numeros en el codigo
       num[0][0]=1;num[0][1]=2;num[0][2]=3;num[0][3]=4;num[0][4]=5;
       num[1][0]=6;num[1][1]=7;num[1][2]=8;num[1][3]=9;num[1][4]=10;
       num[2][0]=11;num[2][1]=12;num[2][2]=13;num[2][3]=14;num[2][4]=15;
       num[3][0]=16;num[3][1]=17;num[3][2]=18;num[3][3]=19;num[3][4]=20;
       
       for (f=0;f<=3;f++)
       {
           c=0;
           for (cont = 0;cont<=4;cont++)
           {
               System.out.printf("[ "+num[f][c]+" ]");
               c ++;
           }
           System.out.printf("\n");
       }
}
}
