package Semana11.Ejercicio1;

import Semana11.Ejercicio1.Database;

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
}
