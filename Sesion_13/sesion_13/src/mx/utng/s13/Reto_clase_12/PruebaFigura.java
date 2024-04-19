package mx.utng.s13.Reto_clase_12;

/**
 * @author Santiago Ronaldo Chavez Pinon
 * @category GDS0622
 * @since 07-02-2024
 */

public class PruebaFigura {
    public static void main(String[] args) {
     Figura figura;
     figura = new Triangulo();
     figura.calcularArea();
     
     figura = new Rectangulo();
     figura.calcularArea();

     figura = new Cuadrado();
     figura.calcularArea();
    }
    
}
