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
public class Manager extends Employee {
      private int Bonus;
    public Manager(String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln) {
        super(nameln, Payln, NumofHoursln, HolidayEntiltementln);
    }

    @Override
    public String getDetails() {
        
    String ret = name + "" + HolidayEntiltement + "" + getyearlySalary();
    return ret;
    
    }

    @Override
    public double getyearlySalary() {
       double extra = (Bonus * Pay) / 100;
        return Pay + extra;
    }
    
}
