package Model;

public class ProductoDigital extends Producto {
    // VARIABLES
    private double tamanoDescargaMb;
    private String enlaceDescarga;
    private int diasValidezEnlace;

    // GETTERS Y SETTERS
    public double getTamanoDescargaMb() {
        return tamanoDescargaMb;
    }

    public void setTamanoDescargaMb(double tamanoDescargaMb) {
        this.tamanoDescargaMb = tamanoDescargaMb;
    }

    public String getEnlaceDescarga() {
        return enlaceDescarga;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }

    public int getDiasValidezEnlace() {
        return diasValidezEnlace;
    }

    public void setDiasValidezEnlace(int diasValidezEnlace) {
        this.diasValidezEnlace = diasValidezEnlace;
    }

    // CONSTRUCTOR
    public ProductoDigital(int idProducto, String nombre, double precioBase, double tamanoDescargaMb, String enlaceDescarga, int diasValidezEnlace) {
        super(idProducto, nombre, precioBase);
        this.tamanoDescargaMb = tamanoDescargaMb;
        this.enlaceDescarga = enlaceDescarga;
        this.diasValidezEnlace = diasValidezEnlace;
    }

    // FUNCIONES

    /**
     * @return
     */
    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 1.21;
    }

    /**
     * @return
     */
    public void generarNuevoEnlace() {
        System.out.println("Simulación: Se ha generado un nuevo enlace seguro para el producto.");
    }

}