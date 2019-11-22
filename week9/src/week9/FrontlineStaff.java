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
public class FrontlineStaff extends Employee {

    public FrontlineStaff(String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln) {
        super(nameln, Payln, NumofHoursln, HolidayEntiltementln);
    }

   

    @Override
    public double getyearlySalary() {
        return (Pay*NumofHours)*52;
    
}
}
