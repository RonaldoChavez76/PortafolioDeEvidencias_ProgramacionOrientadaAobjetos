package mx.utng.s11.Reto_1;

import java.time.LocalDate;

public class DBA extends Empleado{
    private String herramientasConsultas;

    public String getHerramientasConsultas() {
        return herramientasConsultas;

    }

    public DBA(LocalDate fechanacimiento, byte edad, String nombre, float salario, String herramientasConsultas) {
        super(fechanacimiento, edad, nombre, salario);
        this.herramientasConsultas = herramientasConsultas;
    }
    

    
}