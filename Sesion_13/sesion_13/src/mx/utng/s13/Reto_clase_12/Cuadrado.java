package mx.utng.s13.Reto_clase_12;

public class Cuadrado implements Figura{
    private double lado;
    {
        lado=25;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del cuadrado con lado: "+lado+" es: "+lado*lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
