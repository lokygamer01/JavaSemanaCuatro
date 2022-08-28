/*
//mprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.
 */
package MODELO;



/**
 *
 * @author Camilo
 */
public class Class_Ejer_03 {
    public void NumerosPrimos() {
        
        int num,i=0,cont=0,div,cont2;
        //Se crea el array
        int [] numeros;
        //y se delimita que tan grande es
        numeros = new int [1000];
        //ahora hacemos el circuito que recorre dicho arreglo
        //y lo que va a imprimira
        for (cont=1;cont<=999;cont++)
        {
            div=1;
            cont2=0;
            while(div <= cont)
            {
                if (cont % div ==0)
                {
                    cont2 ++;
                }
                div++;
            }
            if (cont2==2)
            {
                numeros[cont]=cont;
                System.out.println("El numero, ["+numeros[cont]+"] es primo");
            }
        }
 
}
}
