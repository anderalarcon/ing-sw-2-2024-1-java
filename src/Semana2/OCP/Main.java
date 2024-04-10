package Semana2.OCP;

public class Main {

    public static void main(String[] args) {
        GestorDeMensajesV1 gestorV1 = new GestorDeMensajesV1();

        gestorV1.enviarMensaje("correo", "¡Hola, esto es un correo!");
        gestorV1.enviarMensaje("sms", "¡Hola, esto es un SMS!");

        GestorDeMensajesV2 gestorV2 = new GestorDeMensajesV2();

        Correo correo1 = new Correo();
        Sms sms1 = new Sms();

        gestorV2.enviarMensaje(correo1, "Enviamos correo V2");
        gestorV2.enviarMensaje(sms1, "Enviamos sms V2");

    }
}
