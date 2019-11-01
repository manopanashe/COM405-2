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
public class Table {

    private int tablenumber;
    private int numofseats;
    private boolean isoutside;

    private Staff assignedstaff;
    private Booking assignedbooking;

    public Table(int tablenumberln, int numofseatsln, boolean isoutsideln) {
        tablenumber = tablenumberln;
        numofseats = numofseatsln;
        isoutside = isoutsideln;

    }

    public void Assignedstaff(Staff assignedstaffln) {
        assignedstaff = assignedstaffln;
    }

    public boolean booktable(Booking bookingln) {
        if (numofseats - bookingln.getNumofguests() < 3 && isoutside == bookingln.isDineOutside()) 
        {
             assignedbooking = bookingln;
        return true;

    }
        return false;
    }


    public void clearbooking() {
        assignedbooking = null;   
    }
    

    public int getTablenumber() {
        return tablenumber;
    }

    public int getNumofseats() {
        return numofseats;
    }

    public boolean isIsoutside() {
        return isoutside;
    }

    public Staff getAssignedstaff() {
        return assignedstaff;
    }

    public Booking getAssignedbooking() {
        return assignedbooking;
    }

    public void setTablenumber(int tablenumber) {
        this.tablenumber = tablenumber;
    }

    public void setNumofseats(int numofseats) {
        this.numofseats = numofseats;
    }

    public void setIsoutside(boolean isoutside) {
        this.isoutside = isoutside;
    }

    public void setAssignedbooking(Booking assignedbooking) {
        this.assignedbooking = assignedbooking;
    }

   

   
            
}
