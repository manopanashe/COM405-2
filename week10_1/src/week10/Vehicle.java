/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author 4manop68
 */
public abstract class Vehicle {

    protected String regNo;
    protected double weight;
    protected double fee;

    public Vehicle(String regNoln, double wieghtln, double fee) {
        regNo = regNoln;
        weight = wieghtln;
        this.fee = fee;
    }

    /**
     *
     * @return
     */
    public abstract double CalculateFee();

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String RegNo) {
        this.regNo = RegNo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double Weight) {
        this.weight = Weight;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
