package mx.utng.s13.Reto_clase_12;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    {
        base=10;
        altura=15;
    }


public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del triangulo con base: "+base+" y altura: "+altura+" es: "+base*altura/2);
    }


    
}
