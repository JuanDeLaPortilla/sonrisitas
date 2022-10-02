package Modelo;

import java.text.DecimalFormat;

public class Admin extends Usuario {
    //Atributos 

    private String adminID;
    private String pass;
    private String correo;
    private static int contad = 0;

    //Constuctor
    public Admin(String nombre, String apellido, int edad, int dni, String direccion) {
        super(nombre, apellido, edad, dni, direccion);
        contad++;
        this.adminID = generarID();
    }

    public Admin() {
        contad++;
        this.adminID = generarID();
    }

    //Getter
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Sobrescribir metodo
    public String generarID() {
        DecimalFormat df = new DecimalFormat("AD0000");
        return df.format(contad);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del admin\n");
        sb.append("\nID: ").append(adminID);
        sb.append("\nCorreo: ").append(correo);
        sb.append("\nContraseña: ").append(pass);
        return sb.toString();
    }


}
