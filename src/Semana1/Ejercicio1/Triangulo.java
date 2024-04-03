package Semana1.Ejercicio1;

public class Triangulo {

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("La base es " + base);
        System.out.println("La altura es " + altura);
    }

    public int calcularArea() {
        return this.base * this.altura;
    }
}
