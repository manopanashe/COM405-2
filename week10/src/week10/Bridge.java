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
public class Bridge {

    int weightLimit = 30000;
    double totalWeight = 0;
    protected String regNo;
    protected Vehicle[] bridge;

    public Bridge(int weightLimit) {
        this.weightLimit = weightLimit;
        bridge = new Vehicle[20];

    }

    public double calcTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < bridge.length; i++) {
            Vehicle vehicle = bridge[i];
            if (vehicle != null) {
                totalWeight = totalWeight + vehicle.getWeight();
            }
        }
        return totalWeight;
    }

    public boolean addVehicle(Vehicle vehiclesln) {
        double totalWeight = calcTotalWeight();
        if (totalWeight >= weightLimit) {

            for (int i = 0; i > bridge.length - 1; i++) {
                if (bridge[i] == null) {
                    bridge[i] = vehiclesln;
                    return true;
                }
            }

        }
        return false;
    }

    public boolean removeVehicle(String regNo) {
        for (int i = 0; i < bridge.length - 1; i++) {
            if (bridge[i] == null) {
                if (bridge[i].getRegNo() == regNo) {
                    bridge[i] = null;
                }
            }
        }
        return false;
    }

    public int CalcFreeSpaces() {
        int tally = 0;
        for (int i = 0; i < bridge.length; i++) {
            if (bridge[i] == null) {
                tally++;
            }
        }

        return tally;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Vehicle[] getBridge() {
        return bridge;
    }

    public void setBridge(Vehicle[] bridge) {
        this.bridge = bridge;
    }

}
