package mx.utng.s13;

public class Venado extends Animal implements Hervivoro{
    private boolean tieneCuernos;



    @Override
    public void respirar() {
        System.out.println("Respirar como de venado");
    }
    @Override
    public void comer() {
        System.out.println("Comiendo hierva");
    }
    
    public boolean isTieneCuernos() {
        return tieneCuernos;
    }

    public void setTieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }
    
    
}
