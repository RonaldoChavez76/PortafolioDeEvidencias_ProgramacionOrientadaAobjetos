package mx.utng.s11.Reto_1;

import java.time.LocalDate;

public class Persona {
    private final LocalDate FECHA_NACIMIENTO;
    private byte Edad;
    private String Nombre;

    public Persona(LocalDate fechanacimiento, byte edad, String nombre){
        this.FECHA_NACIMIENTO=fechanacimiento;
        this.Edad=edad;
        this.Nombre=nombre;
        
    }
    public byte getEdad() {
        return Edad;
    }
    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }
    public String getNombre() {
        return Nombre;
    }
   

    
}
