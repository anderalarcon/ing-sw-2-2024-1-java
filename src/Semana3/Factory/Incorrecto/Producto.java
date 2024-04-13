package Semana3.Factory.Incorrecto;

public class Producto {

    private String nombre;
    private double precio;
    private double costoEnvio;

    public Producto(String nombre, double precio, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoEnvio = costoEnvio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public double calcularEnvio() {
        return costoEnvio;
    }
}
