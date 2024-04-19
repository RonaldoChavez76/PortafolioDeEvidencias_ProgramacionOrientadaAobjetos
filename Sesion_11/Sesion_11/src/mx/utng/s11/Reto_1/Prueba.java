package mx.utng.s11.Reto_1;

import java.time.LocalDate;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        Programador programador = new Programador(LocalDate.of(2005, Month.JULY, 14), (byte)18, "Ronaldo", 60000, "Java");
        DBA dba = new DBA(LocalDate.of(2000, Month.APRIL, 12), (byte)23, "Ronaldo", 5000, "Base de datos");

            System.out.println("Informacion del programador: ");
            System.out.println("Nombre del programador: "+programador.getNombre());
            System.out.println("Fecha de nacimiento del proramador: "+programador.getFECHA_NACIMIENTO());
            System.out.println("Salario del programador: "+programador.getSalario());
            System.out.println("Lenguaje principal del progrmador " + programador.getLenguajePrincipal());
            System.out.println("");

            System.out.println("Informacion del DBA: ");
            System.out.println(dba.getHerramientasConsultas());
            System.out.println("Nombre del DBA "+dba.getNombre());
            System.out.println("Salario del DBA "+dba.getSalario());
            System.out.println("Edad del DBA "+dba.getEdad());
            System.out.println("Fecha de nacimiento del DBA "+dba.getFECHA_NACIMIENTO());
    }
}
