/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_03 {
    public void escalaTriangulo(String vineta3) {
        int i=0,espacio,vineta=1,asterisco;
        while (i < 11)
        {
            i++;
           for (espacio=1;espacio<=(11-i);espacio++) 
           {
               System.out.printf(" ");
           }
           for (asterisco=1;asterisco<=i;asterisco++) 
           {
               System.out.printf(vineta3);
           }
           System.out.println(" ");
           if (i>10)
           {
               System.out.println("        ****        \n"
                       + "        ****        ");
           }
        }
}
}