package mx.utng.s08;

public class AutomovilFactory {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);

        Automovil auto2 = new Automovil("Bugatti", "Veyron Ble Centeaire", 2009, 40000);

        Automovil auto3 = new Automovil("Mazda", "Miata mx-5", 2015, 10000);
        System.out.println("Auto 1: hash:" + auto1.hashCode());
        System.out.println("Auto 2: hash:" + auto2.hashCode());
        System.out.println("Auto 3: hash:" + auto3.hashCode());

        
    }

    
}
