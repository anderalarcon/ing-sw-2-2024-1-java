package Semana3.Factory.Correcto;

public class ProductoRopa implements Producto {

    private String nombre;
    private double precio;
    private double costoEnvio;

    public ProductoRopa(String nombre, double precio, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public double calcularEnvio() {
        return costoEnvio;
    }
}
