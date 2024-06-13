package Semana11.Ejercicio1;


public class LoginSystemV1 {

    private Database database;

    public LoginSystemV1() {
        this.database = new Database();
    }

    public void login(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Invalid credentials.");

        }

        if (username.length() < 5 || password.length() < 8) {
            System.out.println("Inputs incorrectos");
        }

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Inputs vacios");
        }

        if (database.checkUserExists(username)) {
            System.out.println("username exists.");
            if (database.comparePassword(password)) {
                System.out.println("valid password");
                System.out.println("user loged");
            }
        } else {
            System.out.println("username not found.");
        }
    }

    public static void main(String[] args) {
        LoginSystemV1 loginSystem = new LoginSystemV1();

        // Ejemplos de login
        loginSystem.login("admin", "admin123");
    }
}

class Database {

    public boolean checkUserExists(String username) {
        // Simulación de consulta a la base de datos
        if (username.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePassword(String password) {
        // Simulación de consulta a la base de datos
        if (password.equals("admin123")) {
            return true;
        } else {
            return false;
        }
    }
}
