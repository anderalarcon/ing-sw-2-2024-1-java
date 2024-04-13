package Semana2.IDP;

public class Main {

    public static void main(String[] args) {
        InterruptorV1 interruptor = new InterruptorV1();
        interruptor.presionarInterruptor(); // Enciende la lámpara directamente

        System.out.println("########################################");

        DispositivoElectrico lamparaV2 = new LamparaV2();

        InterruptorV2 interruptorLampara = new InterruptorV2(lamparaV2);
        interruptorLampara.presionarInterruptor();
        
    }
}
