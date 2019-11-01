/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author 4manop68
 */
public class Booking {

    private String name;
    private int numofguests;
    private boolean dineOutside;

    public Booking(String nameln, int numofguestsLn, boolean dineoutsideln) {
        name = nameln;
        numofguests = numofguestsLn;
        dineOutside = dineoutsideln;

    }

    Booking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public int getNumofguests() {
        return numofguests;
    }

    public boolean isDineOutside() {
        return dineOutside;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumofguests(int numofguests) {
        this.numofguests = numofguests;
    }

    public void setDineOutside(boolean dineOutside) {
        this.dineOutside = dineOutside;
    }

}
