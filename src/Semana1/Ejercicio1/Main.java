package Semana1.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2, 3);
        t1.mostrarDatos();
        int area = t1.calcularArea();
        System.out.println("El area es :" + area);
    }
}
