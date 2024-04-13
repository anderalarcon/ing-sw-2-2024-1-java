package Semana3.Singleton.Correcto;

public class Main {

    public static void main(String[] args) {
        // Obtener la instancia única de DatabaseConnector y conectar a la base de datos
        DatabaseConnector connector1 = DatabaseConnector.getInstance();

        // Obtener la misma instancia de DatabaseConnector nuevamente
        DatabaseConnector connector2 = DatabaseConnector.getInstance();
    }
}
