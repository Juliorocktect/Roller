import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RollerTest {
    @Test
    void tankTest(){
        Roller testRoller = new Roller(12.0,11,5.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        testRoller.tanke(6.0);
        assertFalse(testRoller.tanke(6.0));
    }
    @Test
    void tankSollteBefülltwerden(){
        Roller testRoller = new Roller(12.0,11,5.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        assertTrue(testRoller.tanke(5.0));
    }
    @Test
    void fahrTest(){
        Roller testRoller = new Roller(12.0,11,5.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        testRoller.fahre(1);
        assertEquals(12,testRoller.getKilometerstand());
    }
    @Test
    void shouldDriveUntilEmpty(){
        Roller testRoller = new Roller(12.0,0,10.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        testRoller.fahre(40);
        assertEquals(20,testRoller.getKilometerstand());
    }
    @Test
    void kannDerTankBefülltwerdenMitDerMenge(){
        Roller testRoller = new Roller(12.0,0,10.0);
        Besitzer besitzer = new Besitzer(0.0,"Test",testRoller);
        assertTrue(testRoller.passtInTank(2.0));
        assertFalse(testRoller.passtInTank(3.0));
    }


}
