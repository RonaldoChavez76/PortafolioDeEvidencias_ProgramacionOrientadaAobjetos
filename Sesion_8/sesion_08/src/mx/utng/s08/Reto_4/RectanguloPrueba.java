package mx.utng.s08.Reto_4;



public class RectanguloPrueba {
    public static void main(String[] args) {
        
    
    Rectangulo rectangulo1 = new Rectangulo();

        Rectangulo rectangulo2 = new Rectangulo(2, 2);

        Rectangulo rectangulo3 = new Rectangulo(3, 2);

        Rectangulo rectangulo4 = new Rectangulo(8);
        
        System.out.println("El area es: "+rectangulo1.hashCode());
        System.out.println("El area es: "+rectangulo2.hashCode());
        System.out.println("El area es: "+rectangulo3.hashCode());
        System.out.println("El area es: "+rectangulo4.hashCode());


    }
        


       
}
