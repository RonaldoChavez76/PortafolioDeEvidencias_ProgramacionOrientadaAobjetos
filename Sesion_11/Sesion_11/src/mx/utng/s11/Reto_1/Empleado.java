package mx.utng.s11.Reto_1;

import java.time.LocalDate;

public class Empleado extends Persona{
    private float salario; 

    

    public Empleado(LocalDate fechanacimiento, byte edad, String nombre, float salario) {
        super(fechanacimiento, edad, nombre);
        this.salario = salario;
    }



    public float getSalario() {
        return salario;
    }

    
}
