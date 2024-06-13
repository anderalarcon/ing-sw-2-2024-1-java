package Semana11.Ejercicio1;

public class LoginSystemV2 {

    private Database database;

    public LoginSystemV2() {
        this.database = new Database();
    }

    public void login(String username, String password) {
        boolean isValidCredentials = validateCredentials(username, password);
        if (!isValidCredentials) {
            System.out.println("Throw error");
        }
        
        System.out.println("Inputs validated");
        boolean userExists = checkUserExists(username);

        if (userExists) {
            System.out.println("username exists.");
            boolean validatePassword = validatePassword(password);
            if (validatePassword) {
                System.out.println("valid password");
                System.out.println("User loged");
            } else {
                System.out.println("invalid password");
            }

        } else {
            System.out.println("User not found.");
        }

    }

    private boolean validateCredentials(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Invalid credentials.");
            return false;
        }

        if (username.length() < 5 || password.length() < 8) {
            System.out.println("Inputs incorrectos");
            return false;
        }

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Inputs vacios");
            return false;
        }

        return true;
    }

    private boolean checkUserExists(String username) {
        return database.checkUserExists(username);
    }

    private boolean validatePassword(String password) {
        return database.comparePassword(password);
    }
}
