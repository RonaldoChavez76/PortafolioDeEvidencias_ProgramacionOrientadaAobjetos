package mx.utng.s08.Reto_4;

public class Rectangulo {
    private double alto;
    private double ancho;

    public int area(){
        return (int)Math.pow(ancho, alto);
    }


    public Rectangulo() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Rectangulo(double dato) {
        this.alto = dato;
        this.ancho = dato;
    }
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public int hashCode() {
        int hash = 0;
       
        hash = ((int)ancho);
        hash *= ((int)alto);
        
        return hash;
    }
    


    
    

    
    
}
