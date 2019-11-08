/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 4manop68
 */
public class Manager extends FrontlineStaff {

    private int Bonus;

    public Manager(String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln, int Bonusln) {
        super(nameln, Payln, NumofHoursln, HolidayEntiltementln);
        Bonus = Bonusln;
    }

    @Override
    public double getyearlySalary() {
        double extra = (Bonus * Pay) / 100;
        return Pay + extra;
    }

    public boolean setBonus(int Bonusln) {
        if (Bonusln >= 0 && Bonusln <= 100) {
            Bonus = Bonusln;
            return true;
        }
        return false;

    }

}
