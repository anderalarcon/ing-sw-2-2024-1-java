package Semana2.ISP;

public class Main {

    public static void main(String[] args) {
        Trabajador humano = new HumanoV1();
        humano.trabajar();
        humano.comer();
        humano.descansar();
        humano.reunirse();

        Trabajador robot = new RobotV1();
        robot.trabajar();
        robot.comer(); // Esto lanzará una excepción, ya que los robots no pueden comer
        
        System.out.println("");
        
        HumanoTrabajador humanov2 = new HumanoV2();
        humano.trabajar();
        humano.comer();
        humano.descansar();
        humano.reunirse();

        RobotTrabajador robotv2 = new RobotV2();
        robot.trabajar();
    }
}
