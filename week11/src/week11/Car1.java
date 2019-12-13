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
public class Car1 extends Vehicle1 {

    public Car1(String regNoln, double wieghtln, double fee) {
        super(regNoln, wieghtln, fee);
    }

    @Override
    public double CalculateFee() {
        if (weight > 1590) {
            double additional = ((weight - 1590) / 100) * 0.1;

        }
        int additional = 0;

        return 5+additional;

    }

}
