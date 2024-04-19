package mx.utng.s16.Ej3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Bobby";
        final int EDAD = 3;
        final float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2020, 8, 3);
        System.out.println("El nombre de mi mascota es: "+NOMBRE+" Tiene una edad de: "+EDAD+" Su estatura es de: "+ESTATURA+" Nacio en: "+FECHA_NACIMIENTO);
        
        System.out.printf("El nombre de mi mascota es |%8s| tiene una edad de %5d años su estatura es %.2f nacio el dia %4$te de %4$tB del %4$tY",NOMBRE,EDAD,ESTATURA,FECHA_NACIMIENTO);
        

    }
    
}
