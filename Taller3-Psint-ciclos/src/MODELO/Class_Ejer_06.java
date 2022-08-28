/*
Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo.
Para ello cada contacto debe contener nombre completo,teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos 
verificando que el número no esté almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
Recuerde que el sistema debe terminar cuando el usuario así lo indique.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_06 {
    public void apkclass() {
        int i=0,contador=0,contador2,contador3,telDif = 0;
        String nombre,telefono,organizacion,nombre1,nombre2,nombre3,telefono1,telefono2,telefono3;
        String enter,organizacion1,organizacion2,organizacion3;
        //denino estas variables para que no de eeror al consultar dichas en el punto 2
        nombre="Ninguno";telefono="Ninguno";organizacion="Ninguno";
	nombre1="Ninguno";telefono1="Ninguno";organizacion1="Ninguno";
	nombre2="Ninguno";telefono2="Ninguno";organizacion2="Ninguno";
	nombre3="Ninguno";telefono3="Ninguno";organizacion3="Ninguno";
        //ahora hacemos el ciclo para pedir estos datos
        while(i<=3)
        {
         i=Integer.parseInt(JOptionPane.showInputDialog("## Menú de Usuario ##\n"
                  + "1. Ingresar Contacto \n"
                  + "2. Buscar Contacto \n"
                  + "3. Eliminar Contacto del Sistema \n"
                 + "4. Salir del Sistema "));
         // crear contacto
      if (i==1)
      {
       nombre=JOptionPane.showInputDialog("## Crear Contacto ##\n"
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
       organizacion=JOptionPane.showInputDialog("Organizacion: \n");
       contador++;
       telDif=0;
      }
      //guardar contacto
      if (contador==1)
      {
          nombre1=nombre;
          telefono1=telefono;
	  organizacion1=organizacion;
	  contador=2;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==3)
      {
          nombre2=nombre;
          telefono2=telefono;
	  organizacion2=organizacion;
	  contador=4;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==5)
      {
          nombre3=nombre;
          telefono3=telefono;
	  organizacion3=organizacion;
	  contador=0;
          System.out.println("## Contacto Guardado con exito ##");
      }
      //buscar contacto
      if (i==2)
      {
      contador2=Integer.parseInt(JOptionPane.showInputDialog("Que contacto decea ver: \n"
              + "Contacto 1: \n"
              + "Contacto 2: \n"
              + "Contacto 3: \n"));
      if (contador2==1)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre1+"\n"
                  + "Telefono: "+telefono1+"\n"
                  + "Organizacion: "+organizacion1+"\n");
      }
      if (contador2==2)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre2+"\n"
                  + "Telefono: "+telefono2+"\n"
                  + "Organizacion: "+organizacion2+"\n");
      }
      if (contador2==3)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre3+"\n"
                  + "Telefono: "+telefono3+"\n"
                  + "Organizacion: "+organizacion3+"\n");
      }
      }
      //Eliminar contacto
      if (i==3)
      {
      contador3=Integer.parseInt(JOptionPane.showInputDialog("Que contacto decea Eliminar: \n"
              + "Contacto 1: \n"
              + "Contacto 2: \n"
              + "Contacto 3: \n"));
      if (contador3==1)
      {
          System.out.println("## contacto n°"+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  organizacion1="Ninguno";
          contador=0;
      }
      if (contador3==2)
      {
          System.out.println("## contacto n°"+contador3+"Eliminado\n");
          nombre2="Ninguno";
          telefono2="Ninguno";
	  organizacion2="Ninguno";
          contador=2;
      }
      if (contador3==3)
      {
          System.out.println("## contacto n°"+contador3+"Eliminado\n");
          nombre2="Ninguno";
          telefono2="Ninguno";
	  organizacion2="Ninguno";
          contador=4;
      }
      }
      
}
}
}
