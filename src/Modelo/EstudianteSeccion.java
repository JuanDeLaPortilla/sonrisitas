package Modelo;

public class EstudianteSeccion {

    private String seccionID;
    private String estudianteID;
    private String nombreSeccion;
    private String nombreEstudiante;

    public EstudianteSeccion() {
    }

    public String getSeccionID() {
        return seccionID;
    }

    public void setSeccionID(String seccionID) {
        this.seccionID = seccionID;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public String getEstudianteID() {
        return estudianteID;
    }

    public void setEstudianteID(String estudianteID) {
        this.estudianteID = estudianteID;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asignatura por Seccion\n");
        sb.append("\nID de la Seccion: ").append(seccionID);
        sb.append("\nNombre de la Seccion: ").append(nombreSeccion);
        sb.append("\nID del Estudiante: ").append(estudianteID);
        sb.append("\nNombre del Estudiante: ").append(nombreEstudiante);
        return sb.toString();
    }
}
