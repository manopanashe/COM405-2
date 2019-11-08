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
public class AdminStaff extends Employee 
{
    private Manager assignedManager;
     public AdminStaff (String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln) 
  {
     super(nameln, Payln, NumofHoursln, HolidayEntiltementln);   

    }
}
