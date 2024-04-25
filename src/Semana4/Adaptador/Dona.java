package Semana4.Adaptador;

public class Dona implements Comida {

    String comida = "Dona";
    String[] ingredientes = {"Azucar", "Agua"};

    @Override
    public String obtenerComida() {
        return comida;
    }

    @Override
    public String[] obtenerIngredientes() {
        return ingredientes;
    }

}
