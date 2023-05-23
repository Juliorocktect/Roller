import java.sql.Time;

public class Main {
    public static void main(String[] args){
        Roller roller = new Roller(12.0,2,120.0);
        System.out.println(roller.getKilometerstand());
        Roller flitzer = new Roller(8.4, 2352, 5.2);
        Besitzer Paul = new Besitzer(50.0, "Paul", flitzer);
        Roller roller2 = new Roller(7.1, 11, 1.0);
        Besitzer tim = new Besitzer(50, "tim", roller2);

    }
}