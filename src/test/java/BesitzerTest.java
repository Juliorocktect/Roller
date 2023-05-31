import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BesitzerTest {
    @Test
    void erhalteTaschenGeldTest(){
        Roller testRoller = new Roller(12.0,11,5.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        besitzer.erhalteTaschenGeld(2.0);
        assertEquals(2.0,besitzer.getGeld());
    }
    @Test
    void fahreDeinenRollerTest() {
        Roller testRoller = new Roller(12.0, 0, 5.0);
        Besitzer besitzer = new Besitzer(0.0, "Test", testRoller);
        besitzer.fahreDeinenRoller(10);
        assertEquals(10, testRoller.getKilometerstand());
    }
    @Test
    void tankeDeinenRoller(){
        Roller testRoller = new Roller(12.0, 0, 5.0);
        Besitzer besitzer = new Besitzer(5.0, "Test", testRoller);
        besitzer.tankeDeinenRoller(2);
        assertEquals(2.0,besitzer.getGeld());
    }
}
