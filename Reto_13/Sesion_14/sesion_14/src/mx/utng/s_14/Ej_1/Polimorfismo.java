package mx.utng.s_14.Ej_1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        //Instancia del profesor1
        Profesor profa = new Profesor("Paty", "Hernandez Lopez", "UTNG00541");
        profa.vivir();
        profa.mostrarDatos();

        Profesor profe = new ProfesorInterino("Jose", "Gutierrez Sanchez", "UTNG00786", LocalDate.of(2024, Month.DECEMBER, 14));
        profe.mostrarDatos();
        profe.vivir();

    }
    
}
