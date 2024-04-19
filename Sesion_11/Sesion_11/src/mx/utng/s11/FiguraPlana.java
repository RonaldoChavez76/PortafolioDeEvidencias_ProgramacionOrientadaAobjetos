package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double ALTURA;

    public FiguraPlana (double base, double altura){
        this.ALTURA = altura;
        this.BASE = base;
    }

    public double getALTURA() {
        return ALTURA;
    }
    public double getBASE() {
        return BASE;
    }

    public void mostrarDimension(){
        System.out.println("La base y la altura son: " + BASE + " Y " + ALTURA);
    }
    
}
