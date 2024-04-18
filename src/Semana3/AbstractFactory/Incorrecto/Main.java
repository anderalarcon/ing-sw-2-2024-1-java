package Semana3.AbstractFactory.Incorrecto;

public class Main {

    public static void main(String[] args) {
        // Crear una fábrica de muebles modernos
        FabricaMueblesModernos fabricaModerna = new FabricaMueblesModernos();

        // Utilizar la fábrica moderna para crear silla y mesa modernas
        Silla sillaModerna = fabricaModerna.crearSillaModerna();
        Mesa mesaModerna = fabricaModerna.crearMesaModerna();

        // Mostrar información de los muebles modernos
        sillaModerna.mostrarInfo();
        mesaModerna.mostrarInfo();

        // Crear una fábrica de muebles clásicos
        FabricaMueblesClasicos fabricaClasica = new FabricaMueblesClasicos();

        // Utilizar la fábrica clásica para crear silla y mesa clásicas
        Silla sillaClasica = fabricaClasica.crearSillaClasica();
        Mesa mesaClasica = fabricaClasica.crearMesaClasica();

        // Mostrar información de los muebles clásicos
        sillaClasica.mostrarInfo();
        mesaClasica.mostrarInfo();
    }
}
