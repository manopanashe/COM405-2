/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4manop68
 */
public class VehicleTest {

    @Test
    public void testGetWeightLimit(){
        String regNoln = "2rgej4";
        double wieghtln = 1529;
        double fee = 10.0;
        Vehicle v1 = new Lorry(regNoln, wieghtln, fee);
        assertEquals("284gkf", v1.getRegNo());
        assertEquals("incorrect Registration Number", v1.getRegNo());
    }
}
