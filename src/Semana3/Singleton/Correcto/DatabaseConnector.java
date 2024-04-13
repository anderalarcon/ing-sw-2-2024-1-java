package Semana3.Singleton.Correcto;

import java.sql.Connection;

public class DatabaseConnector {

    private static DatabaseConnector instance;
    private Connection connection;

    private DatabaseConnector() {
        // Lógica de conexión a la base de datos
        try {
            System.out.println("Database connected");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_log", "usuario", "contraseña");
        } catch (Error e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static synchronized DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }
}
