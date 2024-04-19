package mx.utng.s11;

public class Herencia {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0, 5.0, "Estilo 1");
        Triangulo triangulo1 = new Triangulo(34.78, 78.3, "Estilo 8");
        Triangulo triangulo2 = new Triangulo(7.0, 23.8, "Estilo 23");

        System.out.println("Informacion sobre el triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("El area del triangulo es: " + triangulo.area());

        System.out.println("Informacion sobre el triangulo 1");
        triangulo1.mostrarDimension();
        triangulo1.mostrarEstilo();
        System.out.println("El area del triangulo es: " + triangulo1.area());

        System.out.println("Informacion sobre el triangulo 2");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("El area del triangulo es: " + triangulo2.area());
    }
    
}
