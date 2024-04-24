package Semana4.Adaptador;

public class FabricaDonas {

    void prepararDona(Comida comida) {
        System.out.println("Empezando proceso");
        System.out.println("Mezclando");
        for (int i = 0; i < comida.obtenerIngredientes().length; i++) {
            System.out.println(comida.obtenerIngredientes()[i] + " ");
        }
        System.out.println("\n" + comida.obtenerComida() + " preparada");
        System.out.println("--------------------------------");
    }
}
