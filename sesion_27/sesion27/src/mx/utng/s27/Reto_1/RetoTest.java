package mx.utng.s27.Reto_1;

public class RetoTest {
    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();

        hilo2.setDaemon(true); //Es algo que se ejecuta infinitamente o siempre--Sigue al hilo uno hasta que termine
        
        hilo1.start();
        hilo2.start();
        
    }
}
