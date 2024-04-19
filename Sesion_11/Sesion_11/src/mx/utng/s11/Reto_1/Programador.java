package mx.utng.s11.Reto_1;

import java.time.LocalDate;

public class Programador extends Empleado {
    private String lenguajePrincipal;

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public Programador(LocalDate fechanacimiento, byte edad, String nombre, float salario, String lenguajePrincipal) {
        super(fechanacimiento, edad, nombre, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    

}
