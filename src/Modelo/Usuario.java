package Modelo;

public abstract class Usuario {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String direccion;
    
    //Constructores
    public Usuario(String nombre, String apellido, int edad, int dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
    }

    public Usuario() {
    }
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //Metodos Abstractos
    public abstract String generarID();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nApellido: ").append(apellido);
        sb.append("\nEdad: ").append(edad);
        sb.append("\nDni: ").append(dni);
        sb.append("\nDireccion: ").append(direccion);
        return sb.toString();
    }
    
}

