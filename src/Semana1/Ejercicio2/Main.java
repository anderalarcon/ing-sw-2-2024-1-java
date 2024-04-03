package Semana1.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Moto m1 = new Moto("deportiva", "zuzuki", "rtv3000", 2024);

        Auto a1 = new Auto(4, "toyota", "yaris", 2012);
        
        m1.mostrarDatos();
        System.out.println("--------------------------");
        a1.mostrarDatos();

    }

}
