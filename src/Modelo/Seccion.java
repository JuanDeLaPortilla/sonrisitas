package Modelo;

import java.text.DecimalFormat;

public class Seccion {
    //Atributos 

    private String seccionID;
    private String nombre;
    private String profesorID;
    private static int contad = 0;
    private String nombreProfesor;

    //Constructor
    public Seccion(String nombre) {
        this.nombre = nombre;
        contad++;
        this.seccionID = generarID();
    }

    public Seccion() {
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccionID() {
        return seccionID;
    }

    public void setSeccionID(String seccionID) {
        this.seccionID = seccionID;
    }

    public String getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(String profesorID) {
        this.profesorID = profesorID;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    //Metodo publico
    public static String generarID() {
        DecimalFormat df = new DecimalFormat("S00000");
        return df.format(contad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos de la Seccion\n");
        sb.append("\nID: ").append(seccionID);
        sb.append("\nNombre: ").append(nombre);
        return sb.toString();
    }
}
