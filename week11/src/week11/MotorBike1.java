/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author 4manop68
 */
public class MotorBike1 extends Vehicle1 {
 

    public MotorBike1(String RegNoln, double Wieghtln, double Fee) {
        super(RegNoln, Wieghtln,Fee);
    }

    @Override
    public double CalculateFee() {
        return 3.00;
    }

  

    
}
