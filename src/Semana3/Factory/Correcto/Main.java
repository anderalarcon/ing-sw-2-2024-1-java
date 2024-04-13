package Semana3.Factory.Correcto;

public class Main {

    public static void main(String[] args) {
        // Crear instancias de tiendas específicas
        Tienda tiendaElectronica = new TiendaElectronica();
        Tienda tiendaRopa = new TiendaRopa();

        // Utilizar el método crearProducto() de cada tienda para obtener productos específicos
        Producto productoElectronico = tiendaElectronica.crearProducto("Smartphone", 500.0, 10.0);
        Producto productoRopa = tiendaRopa.crearProducto("Polo", 50, 100);

        // Mostrar detalles de los productos obtenidos
        System.out.println("Producto electrónico:");
        mostrarDetallesProducto(productoElectronico);
        System.out.println();

        System.out.println("Producto de ropa:");
        mostrarDetallesProducto(productoRopa);
        System.out.println();
    }

    // Método para mostrar los detalles de un producto
    public static void mostrarDetallesProducto(Producto producto) {
        System.out.println("Nombre: " + producto.obtenerNombre());
        System.out.println("Precio: $" + producto.obtenerPrecio());
        System.out.println("Costo de envío: $" + producto.calcularEnvio());
    }
}
