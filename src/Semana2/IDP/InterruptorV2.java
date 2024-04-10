package Semana2.IDP;

public class InterruptorV2 {

    private DispositivoElectrico dispositivo;

    public InterruptorV2(DispositivoElectrico dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionarInterruptor() {
        dispositivo.encender();
    }
}
