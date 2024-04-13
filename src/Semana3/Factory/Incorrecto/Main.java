package Semana3.Factory.Incorrecto;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la tienda
        Tienda tienda = new Tienda();

        // Crear productos utilizando la tienda
        Producto productoElectronico = tienda.crearProducto("electronico");
        Producto productoRopa = tienda.crearProducto("ropa");

        // Mostrar detalles de los productos
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
