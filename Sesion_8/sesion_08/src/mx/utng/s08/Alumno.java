package mx.utng.s08;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;
    {
        curso = "Programacion orientada a objetos";
        sesion = 8;
        objetivo = "Bloques de inicializacion";
    }
    {
        curso = "Base de datos";
    }

    public String getCurso() {
        return curso;
    }

    public String getObjetivo() {
        return objetivo;
    }
    public byte getSesion() {
        return sesion;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }
}
