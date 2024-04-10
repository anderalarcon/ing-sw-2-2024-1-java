package Semana2.OCP;

public class Correo implements CanalDeComunicacion {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando correo: " + contenido);
    }

}
