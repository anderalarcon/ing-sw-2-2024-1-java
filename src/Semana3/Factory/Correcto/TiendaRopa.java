package Semana3.Factory.Correcto;

public class TiendaRopa extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        return new ProductoRopa(nombre, precio, costoEnvio);
    }
}
