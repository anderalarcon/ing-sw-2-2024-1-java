package Semana3.AbstractFactory.Correcto;

public class FabricaMueblesClasicos extends FabricaMueblesAbstracta {

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }
}
