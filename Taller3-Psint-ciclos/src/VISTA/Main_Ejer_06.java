/*
Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo.
Para ello cada contacto debe contener nombre completo,teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos 
verificando que el número no esté almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
Recuerde que el sistema debe terminar cuando el usuario así lo indique.
 */
package VISTA;

import MODELO.Class_Ejer_06;

/**
 *
 * @author Camilo
 */
public class Main_Ejer_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LLAMAR LA CLASE, CREAR EL OBJETO E INSTANCIARLO   
      Class_Ejer_06 APK=new Class_Ejer_06(); 
      //NO definimos las dos variables necesarias
      // con ayuda del objeto "escalad" se llama el metodo de la clase
      APK.apkclass();
    }
    
}
