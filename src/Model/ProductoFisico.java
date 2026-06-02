package Model;

public class ProductoFisico extends Producto {
    // VARIABLES
    private double costeEnvio;
    private double pesoKg;
    private int stockDisponible;

    // GETTERS Y SETTERS
    public double getCosteEnvio() {
        return costeEnvio;
    }

    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    // CONSTRUCTOR
    public ProductoFisico(int idProducto, String nombre, double precioBase, double costeEnvio, double pesoKg, int stockDisponible) {
        super(idProducto, nombre, precioBase);
        this.costeEnvio = costeEnvio;
        this.pesoKg = pesoKg;
        this.stockDisponible = stockDisponible;
    }

    // FUNCIONES

    /**
     * @return
     */
    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + this.costeEnvio;
    }

    /**
     * @param cantidad 
     * @return
     */
    public boolean reducirStock(int cantidad) {
        if (this.stockDisponible >= cantidad) {
            this.stockDisponible -= cantidad;
            return true;
        }
        System.out.println("Error: Stock insuficiente para el producto.");
        return false;
    }

}