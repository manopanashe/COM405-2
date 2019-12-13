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
public class Lorry1 extends Vehicle1 {

    public Lorry1(String regNoln, double wieghtln, double fee) {
        super(regNoln, wieghtln, fee);

    }

    @Override
    public double CalculateFee() {
        if (weight > 8000) {
            return 15.00;
        }
        return 10.00;
    }

}
