package Semana4.Adaptador;

public class Main {
    
    public static void main(String[] args) {
        
        Dona donasimple = new Dona();
        DonaRellena donarellena = new DonaRellena();
        
        FabricaDonas fabricadonas = new FabricaDonas();
        fabricadonas.prepararDona(donasimple);
//        fabricadonas.prepararDona(donarellena);
        Adaptador adaptadorDonaRellena = new Adaptador(donarellena);
        
        fabricadonas.prepararDona(adaptadorDonaRellena);
    }
}
