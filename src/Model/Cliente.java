package Model;

public class Cliente {
    // VARIABLES
    private String dni;
    private String nombre;
    private String correo;
    private String direccionEnvio;
    private boolean esPremium;

    // GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public boolean getEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    // CONSTRUCTOR
    public Cliente(String dni, String nombre, String correo, String direccionEnvio, boolean esPremium) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.direccionEnvio = direccionEnvio;
        this.esPremium = esPremium;
    }
}