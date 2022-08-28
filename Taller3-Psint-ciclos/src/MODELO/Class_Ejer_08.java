/*
//La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística y 
//establecer quienes lo han aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir registrar 
//su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). Recuerde 
//que el sistema debe terminar cuando el usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.
 */
package MODELO;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_08 {
    public void EscuelAutomovilisticaElMaestro() {
        int i=0,contador=0,contador2,contador3,telDif = 0;
        String telefono,nombre,nit,prueba;
        String telefono1,telefono2,telefono3,telefono4,telefono5,telefono6,telefono7,telefono8;
        String nombre1,nombre2,nombre3,nombre4,nombre5,nombre6,nombre7,nombre8,nit1,nit2,nit3,nit4,nit5,nit6,nit7,nit8;
        String prueba1,prueba2,prueba3,prueba4,prueba5,prueba6,prueba7,prueba8;
        //denino estas variables para que no de eeror al consultar dichas en el punto 2
        nombre="Ninguno";nit="Ninguno";telefono="Ninguno";prueba="Ninguno";
	nombre1="Ninguno";nit1="Ninguno";telefono1="Ninguno";prueba1="Ninguno";
        nombre2="Ninguno";nit2="Ninguno";telefono2="Ninguno";prueba2="Ninguno";
	nombre3="Ninguno";nit3="Ninguno";telefono3="Ninguno";prueba3="Ninguno";
        nombre4="Ninguno";nit4="Ninguno";telefono4="Ninguno";prueba4="Ninguno";
	nombre5="Ninguno";nit5="Ninguno";telefono5="Ninguno";prueba5="Ninguno";
        nombre6="Ninguno";nit6="Ninguno";telefono6="Ninguno";prueba6="Ninguno";
	nombre7="Ninguno";nit7="Ninguno";telefono7="Ninguno";prueba7="Ninguno";
        nombre8="Ninguno";nit8="Ninguno";telefono8="Ninguno";prueba8="Ninguno";
        Scanner leer=new Scanner(System.in);

        //ahora hacemos el ciclo para pedir estos datos
        while(i<=3)
        {
         i=Integer.parseInt(JOptionPane.showInputDialog("## escuela automovilística El Maestro ##\n"
                  + "1. Registar persona \n"
                  + "2. Realizar prueba \n"
                  + "3. Retirar persona \n"
                 + "4. Salir del Sistema"));
         // crear contacto
      if (i==1)
      {
       nombre=JOptionPane.showInputDialog("## Registrar Persona a Escuela ##\n"
                  + "Nombre:  \n");
       do
       {
       telefono=JOptionPane.showInputDialog("Telefono: \n");
       //esto es para que el telefono no se repita S
       if ((telefono == null ? telefono1 == null : telefono.equals(telefono1) || (telefono == null ? telefono2 == null : telefono.equals(telefono2)) || (telefono == null ? telefono3 == null : telefono.equals(telefono3))))
       {
       System.out.println("El Telefono Ya Esta En Uso");
       }else
       {
          telDif=1; 
       }
       }
       while(telDif!=1);
       nit=JOptionPane.showInputDialog("nit: \n");
       contador++;
       telDif=0;
      }
      //guardar contacto
      if (i==1)
      {
          nombre1=nombre;
          telefono1=telefono;
	  nit1=nit;
	  contador=2;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==3)
      {
          nombre2=nombre;
          telefono2=telefono;
	  nit2=nit;
	  contador=4;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==5)
      {
          nombre3=nombre;
          telefono3=telefono;
	  nit3=nit;
	  contador=6;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==7)
      {
          nombre4=nombre;
          telefono4=telefono;
	  nit4=nit;
	  contador=8;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==9)
      {
          nombre5=nombre;
          telefono5=telefono;
	  nit5=nit;
	  contador=10;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==11)
      {
          nombre6=nombre;
          telefono6=telefono;
	  nit6=nit;
	  contador=12;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==13)
      {
          nombre7=nombre;
          telefono7=telefono;
	  nit7=nit;
	  contador=14;
          System.out.println("## Prueba Guardado con exito ##");
      }
      if (contador==15)
      {
          nombre8=nombre;
          telefono8=telefono;
	  nit8=nit;
	  contador=16;
          System.out.println("## Prueba Guardado con exito ##");
      }
      
    
      //Presentar prueba persona
      if (i==2)
      {
      contador2=Integer.parseInt(JOptionPane.showInputDialog("Que persona presenta la prueba: \n"
              + "Persona 1: \n"
              + "Persona 2: \n"
              + "Persona 3: \n"
              + "Persona 4: \n"
              + "Persona 5: \n"
              + "Persona 6: \n"
              + "Persona 7: \n"
              + "Persona 8 : \n"));
      if (contador2==1)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre1+"\n"
                  + "Telefono: "+telefono1+"\n"
                  + "nit: "+nit1+"\n"
                  + "Aprueba SI o NO: ");
                  prueba1=leer.nextLine();
      }
      if (contador2==2)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre2+"\n"
                  + "Telefono: "+telefono2+"\n"
                  + "nit: "+nit2+"\n"
                  + "Aprueba SI o NO: ");
                  prueba2=leer.nextLine();
      }
      if (contador2==3)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre3+"\n"
                  + "Telefono: "+telefono3+"\n"
                  + "nit: "+nit3+"\n"
                  + "Aprueba SI o NO: ");
                  prueba3=leer.nextLine();
      }
      if (contador2==4)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre4+"\n"
                  + "Telefono: "+telefono4+"\n"
                  + "nit: "+nit4+"\n"
                  + "Aprueba SI o NO: ");
                  prueba4=leer.nextLine();
      }
      if (contador2==5)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre5+"\n"
                  + "Telefono: "+telefono5+"\n"
                  + "nit: "+nit5+"\n"
                  + "Aprueba SI o NO: ");
                  prueba5=leer.nextLine();
      }
      if (contador2==6)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre6+"\n"
                  + "Telefono: "+telefono6+"\n"
                  + "nit: "+nit6+"\n"
                  + "Aprueba SI o NO: ");
                  prueba6=leer.nextLine();
      }
      if (contador2==7)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre7+"\n"
                  + "Telefono: "+telefono7+"\n"
                  + "nit: "+nit7+"\n"
                  + "Aprueba SI o NO: ");
                  prueba7=leer.nextLine();
      }
      if (contador2==8)
      {
          System.out.println("## Persona n°"+contador2+"\n"
                  + "Nombre: "+nombre8+"\n"
                  + "Telefono: "+telefono8+"\n"
                  + "nit: "+nit8+"\n"
                  + "Aprueba SI o NO: ");
                  prueba8=leer.nextLine();
      }
      
      }
      
      
      //Retirar persona de la escuela
      if (i==3)
      {
      contador3=Integer.parseInt(JOptionPane.showInputDialog("Que Persona decea Retirar:\n"
              + "persona 1: \n"
              + "persona 2: \n"
              + "persona 3: \n"
              + "persona 4: \n"
              + "persona 5: \n"
              + "persona 6 \n"
              + "persona 7 \n"
              + "persona 8 \n"));
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          prueba1="Ninguno";
          contador=0;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre2="Ninguno";
          telefono2="Ninguno";
	  nit2="Ninguno";
          prueba2="Ninguno";
          contador=2;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre3="Ninguno";
          telefono3="Ninguno";
	  nit3="Ninguno";
          prueba3="Ninguno";
          contador=4;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre4="Ninguno";
          telefono4="Ninguno";
	  nit4="Ninguno";
          prueba4="Ninguno";
          contador=6;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre5="Ninguno";
          telefono5="Ninguno";
	  nit5="Ninguno";
          prueba5="Ninguno";
          contador=8;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre6="Ninguno";
          telefono6="Ninguno";
	  nit6="Ninguno";
          prueba6="Ninguno";
          contador=10;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre7="Ninguno";
          telefono7="Ninguno";
	  nit7="Ninguno";
          prueba7="Ninguno";
          contador=12;
      }
      if (contador3==1)
      {
          System.out.println("## Persona n° "+contador3+" Eliminado\n");
          nombre8="Ninguno";
          telefono8="Ninguno";
	  nit8="Ninguno";
          prueba8="Ninguno";
          contador=14;
      }
      }
      }
}
      
}



