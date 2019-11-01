/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 4manop68
 */
public class Car {

    private String name;
    private String colour;
    private int doors;
    private int currentspeed;
    private int maxspeed;
    private int fuellevel;

    public Car() {
        name = "default";
        currentspeed = 40;
        maxspeed = 120;
        fuellevel = 100;

    }

    public Car(String nameln, int currentspeedln, int maxspeedn, int fuellevelln, String colourln, int doorln) {

        name = nameln;
        currentspeed = 40;
        maxspeed = 120;
        fuellevel = 100;
        colour = colourln;
        doors = doorln;

    }

    public void accelerate(int changeby) {
        if (fuellevel <= 0) {

            currentspeed = 0;
        } else if (currentspeed + changeby <= changeby) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
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
