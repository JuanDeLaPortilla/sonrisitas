package Modelo;

import java.text.DecimalFormat;

public class Profesor extends Usuario {

    //Atributos
    private String profesorID;
    private static int contad = 0;

    //Constructor
    public Profesor(String nombre, String apellido, int edad, int dni, String direccion) {
        super(nombre, apellido, edad, dni, direccion);
        contad++;
        this.profesorID = generarID();
    }

    public Profesor() {
    }

    //Get and Set
    public String getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(String profesorID) {
        this.profesorID = profesorID;
    }

    //Sobrescribir metodo
    public String generarID() {
        DecimalFormat df = new DecimalFormat("P00000");
        return df.format(contad);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del Docente\n");
        sb.append("\nID: ").append(profesorID);
        sb.append(super.toString());
        return sb.toString();
    }

}
