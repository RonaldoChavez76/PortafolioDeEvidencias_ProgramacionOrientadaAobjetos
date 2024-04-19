package mx.utng.s05;

import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion: ");
        int calif = scanner.nextInt();

        if(calif == 10){
            System.out.println("Exelente");
        }else if(calif == 9){
            System.out.println("Muy bien");
        }else if(calif == 8){
            System.out.println("Muy bien");
        }else if(calif == 7){
            System.out.println("Bien hecho");
        }else if(calif == 6){
            System.out.println("Pasaste");
        }else if(calif == 5){
            System.out.println("Vuelve a intentarlo");

        }else{
            System.out.println("Calificacion invalida");
        }

    }

}
