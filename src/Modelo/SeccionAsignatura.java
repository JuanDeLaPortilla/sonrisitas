package Modelo;

public class SeccionAsignatura {

    private String seccionID;
    private String asignaturaID;
    private String nombreSeccion;
    private String nombreAsignatura;

    public SeccionAsignatura() {
    }

    public String getSeccionID() {
        return seccionID;
    }

    public void setSeccionID(String seccionID) {
        this.seccionID = seccionID;
    }

    public String getAsignaturaID() {
        return asignaturaID;
    }

    public void setAsignaturaID(String asignaturaID) {
        this.asignaturaID = asignaturaID;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asignatura por Seccion\n");
        sb.append("\nID de la Seccion: ").append(seccionID);
        sb.append("\nNombre de la Seccion: ").append(nombreSeccion);
        sb.append("\nID de la Asignatura: ").append(asignaturaID);
        sb.append("\nNombre de la Asignatura: ").append(nombreAsignatura);
        return sb.toString();
    }
}
