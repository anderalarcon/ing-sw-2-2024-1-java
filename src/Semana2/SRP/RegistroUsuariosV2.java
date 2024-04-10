package Semana2.SRP;

public class RegistroUsuariosV2 {

    private String nombre;
    private String contraseña;

    public RegistroUsuariosV2(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public void registrarUsuario() {
        Encriptador encriptador = new Encriptador();
        String contraseñaEncriptada = encriptador.encriptar(contraseña);
        System.out.println("Contraseña encriptada: " + contraseñaEncriptada);
        // Lógica para guardar el usuario en la base de datos
        System.out.println("Usuario registrado: " + nombre);
    }
}
