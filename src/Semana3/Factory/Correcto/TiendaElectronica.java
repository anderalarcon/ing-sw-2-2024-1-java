package Semana3.Factory.Correcto;

public class TiendaElectronica extends Tienda {

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        return new ProductoElectronico(nombre, precio, costoEnvio);
    }
}
