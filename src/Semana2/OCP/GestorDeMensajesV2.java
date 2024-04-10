package Semana2.OCP;

public class GestorDeMensajesV2 {

    public void enviarMensaje(CanalDeComunicacion canal, String contenido) {
        canal.enviarMensaje(contenido);
    }
}
