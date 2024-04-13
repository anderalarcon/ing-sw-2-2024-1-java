
package Semana3.Singleton.Incorrecto;
public class Main {

    public static void main(String[] args) {
        // Crear una nueva instancia de DatabaseConnector y conectar a la base de datos
        DatabaseConnector connector1 = new DatabaseConnector();

        // Crear otra instancia de DatabaseConnector y conectar a la base de datos nuevamente
        DatabaseConnector connector2 = new DatabaseConnector();
    }

}
