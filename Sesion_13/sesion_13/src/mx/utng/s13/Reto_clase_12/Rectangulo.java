package mx.utng.s13.Reto_clase_12;

public class Rectangulo implements Figura{
    private double base;
    private double altura;
    {
        base=25;
        altura=90;
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
        System.out.println("El area del rectangulo con base: "+base+" y altura:"+altura+" es:"+base*altura);
    }


    
}
