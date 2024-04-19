package mx.utng.sesion04;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        
        System.out.println("Teclea tu nombre: ");
        //leer lo que el usuario mande como entrada
        String nombre = lector.nextLine();
        System.out.println("Hola!"+ nombre);
        System.out.printf("Hola %s \n", nombre);
        int edad = 18;
        boolean casado = false;
        System.out.printf("Hola me llamo %s y tengo %d años y %s casado", nombre, edad, casado==true?"soy":"no soy");
    }
    //Metodo muestra una cadena dada como parametro
    public void muestraMensaje(String mensaje){
        System.out.println(mensaje);
    }
    //leer a partir del escaner
    public String leerEntrada(){
        return scanner.nextLine();

    }

}
