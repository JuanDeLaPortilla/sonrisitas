package Modelo;

import java.text.DecimalFormat;

public class Asignatura {

    //Atributos
    private String nombre;
    private String horario;
    private String profesorID;
    private String asignaturaID;
    private String nombreProfesor;
    private static int contad = 0;

    //Constructor
    public Asignatura(String nombre, String horario, String profesorID) {
        this.nombre = nombre;
        this.horario = horario;
        this.profesorID = profesorID;
        contad++;
        this.asignaturaID = generarID();
    }

    public Asignatura() {
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(String profesorID) {
        this.profesorID = profesorID;
    }

    public String getAsignaturaID() {
        return asignaturaID;
    }

    public void setAsignaturaID(String asignaturaID) {
        this.asignaturaID = asignaturaID;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    //Sobrescribir metodo
    public String generarID() {
        DecimalFormat df = new DecimalFormat("AS0000");
        return df.format(contad);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos de la Asignatura\n");
        sb.append("\nID: ").append(asignaturaID);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nHorario: ").append(horario);
        sb.append("\nID del Profesor: ").append(profesorID);
        sb.append("\nNombre del Profesor: ").append(nombreProfesor);
        return sb.toString();
    }

}
