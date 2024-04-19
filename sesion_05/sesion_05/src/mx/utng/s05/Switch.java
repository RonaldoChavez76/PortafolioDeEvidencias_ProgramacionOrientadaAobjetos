package mx.utng.s05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String mensaje;
        //defino objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion: ");
        int calif = scanner.nextInt();

        switch (calif) {
            case 10:
                mensaje="Exelente";
                break;
            case 9:
                mensaje="Muy bien";
            break;
            
            case 8:
            mensaje="Muy bien";
            break;
            case 7:
            mensaje="Bien";
            break;
            case 6:
            mensaje="Pasaste";
            break;
            case 5:
            mensaje="Vuelve a intentarlo";
            break;
            default:
            mensaje="Calificacion invalida";
                break;
        }
        System.out.println(mensaje);
    }
}
