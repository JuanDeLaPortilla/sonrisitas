package Modelo;

import java.text.DecimalFormat;

public class Apoderado extends Usuario {

    //Atributos
    private String apoderadoID;
    private static int contad = 0;
    private String contraseña;
    private String correo;

    //Constructor
    public Apoderado(String nombre, String apellido, int edad, int dni, String direccion) {
        super(nombre, apellido, edad, dni, direccion);
        contad++;
        this.apoderadoID = generarID();
    }

    public Apoderado() {
    }

    //Get Apoderado
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setApoderadoID(String apoderadoID) {
        this.apoderadoID = apoderadoID;
    }

    public String getApoderadoID() {
        return apoderadoID;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Sobrescribir metodo
    public String generarID() {
        int min = 1;
        int max = 99999;
        int numeroAlAzar = (int) (Math.random() * (max - min + 1) + min);
        DecimalFormat df = new DecimalFormat("A00000");
        return df.format(numeroAlAzar);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del Apoderado\n");
        sb.append("\nID: ").append(apoderadoID);
        sb.append(super.toString());
        sb.append("\nCorreo Electrónico: ").append(correo);
        sb.append("\nContraseña: ").append(contraseña);
        return sb.toString();
    }

}
