package Semana2.SRP;

public class Main {

    public static void main(String[] args) {
        RegistroUsuariosV1 registro1 = new RegistroUsuariosV1("ander", "contraseña123");
        registro1.registrarUsuario();

        RegistroUsuariosV2 registro2 = new RegistroUsuariosV2("ander", "contraseña123");
        registro2.registrarUsuario();
    }
}
