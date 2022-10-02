package Modelo;

import java.text.DecimalFormat;

public class Estudiante extends Usuario {

    //Atributos
    private String estudianteID;
    private static int contad = 0;

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int dni, String direccion) {
        super(nombre, apellido, edad, dni, direccion);
        contad++;
        this.estudianteID = generarID();
    }

    public Estudiante() {
    }
    
    
    //Get y Setter
    public String getEstudianteID() {
        return estudianteID;
    }

    public void setEstudianteID(String estudianteID) {
        this.estudianteID = estudianteID;
    }

    //Sobrescribir metodo
    public String generarID() {
        int min = 1;
        int max = 99999;
        int numeroAlAzar = (int)(Math.random()*(max-min+1)+min);
        DecimalFormat df = new DecimalFormat("E00000");
        return df.format(numeroAlAzar);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del estudiante\n");
        sb.append(super.toString());
        sb.append("\nID: ").append(estudianteID);
        return sb.toString();
    }

}
