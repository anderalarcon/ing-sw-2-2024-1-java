package Semana3.Singleton.Incorrecto;

import java.sql.Connection;

public class DatabaseConnector {

    private Connection connection;

    public DatabaseConnector() {
        // Lógica de conexión a la base de datos
        try {
            System.out.println("Database connected");
        } catch (Error e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
