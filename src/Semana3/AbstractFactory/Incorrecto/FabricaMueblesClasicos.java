package Semana3.AbstractFactory.Incorrecto;

class FabricaMueblesClasicos {

    public Silla crearSillaClasica() {
        return new SillaClasica();
    }

    public Mesa crearMesaClasica() {
        return new MesaClasica();
    }
}
