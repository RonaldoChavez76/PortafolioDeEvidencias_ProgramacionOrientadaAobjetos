package mx.utng.sesion04;

public class Letras {

    public static void main(String[] ards){
        //Crear un lector
        Lector lector = new Lector();
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();
        //Crear un objeto contador de caracteres
        ContadorCaracteres contador = new ContadorCaracteres();
        int numeroVocales = contador.cuentaVocales(palabra);
        System.out.println("Hay " +numeroVocales+ " Vocales");
        int numeroConsonantes = contador.cuentaConsonantes(palabra);
        System.out.println("Hay "+numeroConsonantes+" Consonantes");
        int numeroSimbolos = contador.cuentaSimbolos(palabra);
        System.out.println("Hay "+numeroSimbolos+" Caracteres especiales");
        int numeroNumeros = contador.cuentaNumeros(palabra);
        System.out.println("Hay "+numeroNumeros+" Numeros");
    }

    
    
}
