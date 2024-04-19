package mx.utng.s_14.Ej_1;

public class Profesor extends Persona{
    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
    }

    @Override
    public void vivir() {
        System.out.println("Vive sin lujos.");
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("IdProfesor: %s%n", idProfesor);
    }

    
    
}
