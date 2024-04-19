package mx.utng.s20;

public class Gobierno {
private static Gobierno instancia;

private Gobierno(){
    System.out.println("Llamando a la unica instancia de gobierno");
}

public static Gobierno getInstancia() {
if(instancia ==null){
    instancia = new Gobierno();
}

    return instancia;
}

public void darApoyo(){
    System.out.println("Dar apoyo al ciudadano");
}
}
