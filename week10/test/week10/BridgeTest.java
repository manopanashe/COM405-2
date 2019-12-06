package week10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4manop68
 */
public class BridgeTest {

    @Test
    public void testAddVehicle() {
        Bridge b1 = new Bridge(400);
        Vehicle v1 = new Lorry("2rgej4", 1529, 10.0);

        assertTrue(b1.addVehicle(v1));

        for (int i = 1; i < 15; i++) {
            b1.addVehicle(v1);
        }

        assertFalse("Vehicle should be rejected", b1.addVehicle(v1));

    }

    @Test
    public void testRemoveCar() {
        Bridge b1 = new Bridge(400);
        assertFalse("Vehicle wont exist", b1.removeVehicle("27847rfhj"));
        b1.addVehicle(new Lorry("274y3ghf", 19273, 10.0));
        assertTrue(b1.removeVehicle("28364hm"));
    }

    @Test
    public void testCalcFreeSpaces() {
        Bridge b1 = new Bridge(400);

        assertEquals(20, b1.CalcFreeSpaces());
        b1.addVehicle(new Lorry("274y3ghf", 19273, 10.0));
        assertEquals(19, b1.CalcFreeSpaces());

        b1.removeVehicle("3875hmfk");
        assertEquals(20, b1.CalcFreeSpaces());

    }
}
