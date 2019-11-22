/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;


/**
 *
 * @author 4manop68
 */
public class Car {

    private int currentspeed;
    private int maxspeed;
    private int fuellevel;
  
    
    public Car(int currentSpeedln, int maxspeedln, int fuellevelln)
    {
    
    currentspeed = currentSpeedln;
    maxspeed = maxspeedln;
    fuellevel = fuellevelln;
    }
    

    
    public void accelerate(int changeby) {
        if (fuellevel <= 0) {

            currentspeed = 0;
        } else if (currentspeed + changeby <= maxspeed) {
            currentspeed += changeby;
        } else {
            currentspeed = maxspeed;
        }
        fuellevel--;

    }

    public void brake(int changeby) {

        if (currentspeed - changeby > 0) {
            currentspeed -= changeby;

        }

    }

    public void refuel(int changeby) {

        if (fuellevel + changeby <= 100) {
            fuellevel += changeby;

        } else {
            fuellevel = 100;
        }

    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getFuellevel() {
        return fuellevel;
    }

    public void setFuellevel(int fuellevel) {
        this.fuellevel = fuellevel;
    }
}

  