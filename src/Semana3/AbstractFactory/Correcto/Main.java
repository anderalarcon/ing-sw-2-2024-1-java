package Semana3.AbstractFactory.Correcto;

public class Main {

    public static void main(String[] args) {
        // Crear una fábrica de muebles modernos
        FabricaMueblesAbstracta fabricaModerna = new FabricaMueblesModernos();

        // Utilizar la fábrica moderna para crear silla y mesa modernas
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mesa mesaModerna = fabricaModerna.crearMesa();

        // Mostrar información de los muebles modernos
        sillaModerna.mostrarInfo();
        mesaModerna.mostrarInfo();

        // Crear una fábrica de muebles clásicos
        FabricaMueblesAbstracta fabricaClasica = new FabricaMueblesClasicos();

        // Utilizar la fábrica clásica para crear silla y mesa clásicas
        Silla sillaClasica = fabricaClasica.crearSilla();
        Mesa mesaClasica = fabricaClasica.crearMesa();

        // Mostrar información de los muebles clásicos
        sillaClasica.mostrarInfo();
        mesaClasica.mostrarInfo();
    }
}
