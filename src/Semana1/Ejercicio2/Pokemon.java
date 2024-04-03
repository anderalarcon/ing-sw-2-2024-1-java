
package Semana1.Ejercicio2;
public class Pokemon {

    private String nombre;
    private String ataque;
    private double daño;

    public Pokemon(String nombre, String ataque, double daño) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.daño = daño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAtaque() {
        return ataque;
    }

    public double getDaño() {
        return daño;
    }

}
