package Modelo;

public class EstudianteApoderado {

    private String idApoderado;
    private String idEstudiante;
    private String nombreEstudiante;
    private String nombreApoderado;

    public EstudianteApoderado() {
    }

    public String getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(String idApoderado) {
        this.idApoderado = idApoderado;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del Estudiante por Apoderado: \n");
        sb.append("\nID del Apoderado: ").append(idApoderado);
        sb.append("\nNombre del Apoderado: ").append(nombreApoderado);
        sb.append("\nID del Estudiante: ").append(idEstudiante);
        sb.append("\nNombre del Estudiante: ").append(nombreEstudiante);
        return sb.toString();
    }

}
