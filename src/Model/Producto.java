package Model;

public abstract class Producto {
    // VARIABLES
    private int idProducto;
    private String nombre;
    private double precioBase;

    // GETTERS Y SETTERS
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // CONSTRUCTOR
    public Producto(int idProducto, String nombre, double precioBase) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    // FUNCIONES

    /**
     * @return
     */
    public abstract double calcularPrecioFinal();

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Producto [ID=" + idProducto + ", Nombre=" + nombre + ", Precio Base=" + precioBase + "€]";
    }

}