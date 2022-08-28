/*
El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere una aplicación que permita 
registrar los vehículos que se cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del vehículo como son, 
placa y marca, y los datos del cliente como son nombre completo y número de teléfono. Para cada vehículo se debe permitir la opción de 
ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. Recuerde que el sistema debe
terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Class_Ejer_07 {
     public void ElParqueaderoElGuardian() {
        int i=0,contador=0,contador2,contador3,telDif = 0;
        String placa,marca,nombre, telefono , nit;
        String placa1,placa2,placa3,placa4,placa5,telefono1,telefono2,telefono3,telefono4,telefono5,organizacion1,organizacion2,organizacion3;
        String marca1,marca2,marca3,marca4,marca5,nombre1,nombre2,nombre3,nombre4,nombre5,nit1,nit2,nit3,nit4,nit5;
        
        //denino estas variables para que no de eeror al consultar dichas en el punto 2
        nombre1="Ninguno";marca1="Ninguno";nit1="Ninguno";telefono1="Ninguno";placa1="Ninguno";
	nombre2="Ninguno";marca2="Ninguno";nit2="Ninguno";telefono2="Ninguno";placa2="Ninguno";
	nombre3="Ninguno";marca3="Ninguno";nit3="Ninguno";telefono3="Ninguno";placa3="Ninguno";
        nombre4="Ninguno";marca4="Ninguno";nit4="Ninguno";telefono4="Ninguno";placa4="Ninguno";
        nombre5="Ninguno";marca5="Ninguno";nit5="Ninguno";telefono5="Ninguno";placa5="Ninguno";
        nombre="Ninguno";marca="Ninguno";nit="Ninguno";telefono="Ninguno";placa="Ninguno";
        
        //ahora hacemos el ciclo para pedir estos datos
        while(i<=3)
        {
         i=Integer.parseInt(JOptionPane.showInputDialog("## Parqueadreo El Guardian ##\n"
                  + "1. Ingresar al parqueadero \n"
                  + "2. Revisar Autos del parqueadore \n"
                  + "3. Salir del parqueadero \n"
                 + "4. Salir del Sistema"));
         // crear contacto
      if (i==1)
      {
       nombre=JOptionPane.showInputDialog("## Registrar Auto ##\n"
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
       placa=JOptionPane.showInputDialog("Placa: \n");
       marca=JOptionPane.showInputDialog("marca: \n");
       contador++;
       telDif=0;
      }
      //guardar contacto
      if (contador==1)
      {
          nombre1=nombre;
          telefono1=telefono;
	  nit1=nit;
          placa1=placa;
          marca1=marca;
	  contador=2;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==3)
      {
          nombre2=nombre;
          telefono2=telefono;
	  nit2=nit;
          placa2=placa;
          marca2=marca;
	  contador=4;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==5)
      {
           nombre3=nombre;
          telefono3=telefono;
	  nit3=nit;
          placa3=placa;
          marca3=marca;
	  contador=6;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==7)
      {
           nombre4=nombre;
          telefono4=telefono;
	  nit4=nit;
          placa4=placa;
          marca4=marca;
	  contador=8;
          System.out.println("## Contacto Guardado con exito ##");
      }
      if (contador==9)
      {
           nombre5=nombre;
          telefono5=telefono;
	  nit5=nit;
          placa5=placa;
          marca5=marca;
	  contador=0;
          System.out.println("## Contacto Guardado con exito ##");
      }
      //buscar auto
      if (i==2)
      {
      contador2=Integer.parseInt(JOptionPane.showInputDialog("Que Auto decea Revisar: \n"
              + "Auto 1: \n"
              + "Auto 2: \n"
              + "Auto 3: \n"
              + "Auto 4: \n"
              + "Auto 5: \n"));
      if (contador2==1)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre1+"\n"
                  + "Telefono: "+telefono1+"\n"
                  + "nit: "+nit1+"\n"
                  + "marca: "+marca1+"\n"
                  + "placa: "+placa1+"\n");
      }
      if (contador2==2)
      {
        System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre2+"\n"
                  + "Telefono: "+telefono2+"\n"
                  + "nit: "+nit2+"\n"
                  + "marca: "+marca2+"\n"
                  + "placa: "+placa2+"\n");
      }
      if (contador2==3)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre3+"\n"
                  + "Telefono: "+telefono3+"\n"
                  + "nit: "+nit3+"\n"
                  + "marca: "+marca3+"\n"
                  + "placa: "+placa3+"\n");
      }
      if (contador2==4)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre4+"\n"
                  + "Telefono: "+telefono4+"\n"
                  + "nit: "+nit4+"\n"
                  + "marca: "+marca4+"\n"
                  + "placa: "+placa4+"\n");
      }
      if (contador2==5)
      {
          System.out.println("## contacto n°"+contador2+"\n"
                  + "Nombre: "+nombre5+"\n"
                  + "Telefono: "+telefono5+"\n"
                  + "nit: "+nit5+"\n"
                  + "marca: "+marca5+"\n"
                  + "placa: "+placa5+"\n");
      }
      }
      //Retirar carro del parqueadero
      if (i==3)
      {
      contador3=Integer.parseInt(JOptionPane.showInputDialog("Que Auto decea Retirar:\n"
              + "Auto 1: \n"
              + "Auto 2: \n"
              + "Auto 3: \n"
              + "Auto 4: \n"
              + "Auto 5: \n"));
      if (contador3==1)
      {
          System.out.println("## Aunto n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          marca1="Ninguno";
          placa1="Ninguno";
          contador=0;
      }
      if (contador3==2)
      {
          System.out.println("## Aunto n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          marca1="Ninguno";
          placa1="Ninguno";
          contador=2;
      }
      if (contador3==3)
      {
          System.out.println("## Aunto n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          marca1="Ninguno";
          placa1="Ninguno";
          contador=4;
      }
      if (contador3==4)
      {
          System.out.println("## Aunto n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          marca1="Ninguno";
          placa1="Ninguno";
          contador=6;
      }
      if (contador3==5)
      {
          System.out.println("## Aunto n° "+contador3+" Eliminado\n");
          nombre1="Ninguno";
          telefono1="Ninguno";
	  nit1="Ninguno";
          marca1="Ninguno";
          placa1="Ninguno";
          contador=8;
      }
      }
      
}
}
}
