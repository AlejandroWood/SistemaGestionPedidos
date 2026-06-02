import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // CREAMOS UN CLIENTE
        Cliente cliente1 = new Cliente(
            "12345678A",
            "Juan García",
            "juan.garcia@gmail.com",
            "Calle Inventada 12, Cádiz",
            true
        );

        // CREAMOS LOS PRODUCTOS
        ProductoFisico libro = new ProductoFisico(1, "Guía Proyecto", 14.99, 2.99, 1.5, 9);

        ProductoDigital ebook = new ProductoDigital(2, "Matemáticas Avanzadas", 12.00, 179.99, "https://proyecto.com/download/mathAV", 31);

        // CREAMOS EL PEDIDO
        Pedido miPedido = new Pedido(1001, new Date(12/12/2024), cliente1);

        // SE AÑADEN LOS PRODUCTOS AL PEDIDO
        miPedido.agregarProducto(libro);
        miPedido.agregarProducto(ebook);

        // SE MUESTRA EL RESUMEN INICIAL DONDE EL PAGO NO HA SIDO REALIZADO
        System.out.println("ESTADO INICIAL DEL PEDIDO:");
        miPedido.mostrarResumen();
        System.out.println();

        // SE PROCESA EL PAGO Y SE ACTUALIZA EL STOCK
        System.out.println("PROCESANDO EL PAGO DEL PEDIDO...");
        miPedido.pagarPedido();
        System.out.println();

        // SE MUESTRA EL RESUMEN FINAL DONDE EL PAGO SE HA REALIZADO
        System.out.println("ESTADO FINAL DEL PEDIDO:");
        miPedido.mostrarResumen();
        System.out.println();

        // SE SIMULA LA GENERACIÓN DE UN ENLACE NUEVO
        System.out.println("GENERACION DEL ENLACE:");
        ebook.generarNuevoEnlace();
    }
}
