
package Semana4.Facade;
public class Main {
    public static void main(String[] args) {
        FachadaTiendaOnline fachada = new FachadaTiendaOnline();
        fachada.completarOrden("ander", "andersonachata@gmail.com", "ps5", 5000);
    }
}
