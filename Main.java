
public class Main {
    public static void main(String[] args){
        Roller flitzer = new Roller(8.4, 2352, 15.6);
        Besitzer Paul = new Besitzer(50.0, "Paul", flitzer);
        Roller roller2 = new Roller(7.1, 11, 1.0);
        Besitzer tim = new Besitzer(50, "Tim", roller2);
        System.out.println(Paul.getName());
        System.out.println(tim.getName());
        System.out.println(flitzer.getKilometerstand());
        System.out.println(flitzer.getTankinhalt());
        flitzer.fahre(34);
        System.out.println(flitzer.getTankinhalt());
        System.out.println(flitzer.getKilometerstand());
    }
}