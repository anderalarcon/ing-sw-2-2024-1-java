package Semana4.Adaptador;

public class DonaRellena implements ComidaDeliciosa {

    String comida = "Dona Relleno";
    String[] ingredientes = {"Azucar", "Agua", "Galleta"};

    @Override
    public String obtenerComidaDeliciosa() {
        return comida;
    }

    @Override
    public String[] obtenerIngredientes() {
        return ingredientes;
    }

}
