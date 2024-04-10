package Semana2.OCP;

public class Sms implements CanalDeComunicacion {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando SMS: " + contenido);

    }
}
