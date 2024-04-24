package Semana4.Adaptador;

public class Adaptador implements Comida {

    public static ComidaDeliciosa comidaDeliciosa;

    public Adaptador(ComidaDeliciosa cd) {
        comidaDeliciosa = cd;
    }

    @Override
    public String obtenerComida() {
        return comidaDeliciosa.obtenerComidaDeliciosa();
    }

    @Override
    public String[] obtenerIngredientes() {
        return comidaDeliciosa.obtenerIngredientes();
    }
}
