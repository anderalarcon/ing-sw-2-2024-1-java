package Semana2.ISP;

public class HumanoV2 implements HumanoTrabajador {

    @Override
    public void trabajar() {
        System.out.println("Humano trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("Humano comiendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Humano descansando...");
    }

    @Override
    public void reunirse() {
        System.out.println("Humano en reunión...");
    }
}
