package Semana3.AbstractFactory.Incorrecto;

public class FabricaMueblesModernos {

    public Silla crearSillaModerna() {
        return new SillaModerna();
    }

    public Mesa crearMesaModerna() {
        return new MesaModerna();
    }
}
