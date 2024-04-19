package mx.utng.s_14.Ej_1;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void vivir() {
        System.out.println("Como foraneo.");
        super.vivir();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Desempleado a partir de: "+fechaTerminacion);
    }
     
    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }
    
    
}
