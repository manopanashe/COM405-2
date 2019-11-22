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
public class AdminStaff extends Employee {

    private Manager assignedManager;

    public AdminStaff(String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln) {
        super(nameln, Payln, NumofHoursln, HolidayEntiltementln);
    }

    public Manager getAssignedManager() {
        return assignedManager;
    }

    public void setAssignedManager(Manager assignedManager) {
        this.assignedManager = assignedManager;
    }

    @Override
    public String getDetails() {
    String ret = name + "" + HolidayEntiltement + "" + getyearlySalary();
    return ret;
    }

    @Override
    public double getyearlySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
