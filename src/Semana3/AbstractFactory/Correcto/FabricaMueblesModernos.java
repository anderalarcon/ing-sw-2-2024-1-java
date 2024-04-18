package Semana3.AbstractFactory.Correcto;

class FabricaMueblesModernos extends FabricaMueblesAbstracta {

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
