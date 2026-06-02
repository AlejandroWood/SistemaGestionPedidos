package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // VARIABLES
    private int idPedido;
    private Date fechaPedido;
    private String estado;
    private Cliente cliente;
    private List<Producto> listaProductos;

    // GETTERS Y SETTERS
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // CONSTRUCTOR
    public Pedido(int idPedido, Date fechaPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
        this.estado = "PENDIENTE";
        this.listaProductos = new ArrayList<>();
    }

    // FUNCIONES

    /**
     * @param producto 
     * @return
     */
    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }

    /**
     * @return
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }

    /**
     * @return
     */
    public void mostrarResumen() {
        System.out.println("RESUMEN DEL PEDIDO: \n" +
        "=================================\n" +
        "ID Pedido: " + idPedido + "\n" +
        "Fecha: " + fechaPedido + "\n" +
        "Estado" + estado + "\n" +
        "Nombre del Cliente: " + cliente.getNombre() + "\n" +
        "DNI del Cliente: " + cliente.getDni() + "\n" +
        "Dirección del Cliente: " + cliente.getDireccionEnvio() + "\n" +
        "=================================\n" +
        "Productos:"
        );

        for (Producto p : listaProductos) {
            System.out.println("- " + p.getNombre() + "" + p.calcularPrecioFinal() + "€");
        }

        System.out.println("=================================\n" +
            "TOTAL IMPORTE: " + calcularTotal() + "€\n" +
            "=================================" 
        );
    }

    /**
     * @return
     */
    public void pagarPedido() {
        this.estado = "PAGADO";
        for (Producto p : listaProductos) {
            if (p instanceof ProductoFisico) {
                ((ProductoFisico) p).reducirStock(1);
            }
        }
        System.out.println("¡Pedido " + idPedido + " pagado con éxito y stock actualizado!");
    }

}