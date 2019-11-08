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

    public Manager getAssignedManager() {
        return assignedManager;
    }

    public void setAssignedManager(Manager assignedManager) {
        this.assignedManager = assignedManager;
    }
    
    public String getDeatils()
    {   
        
        String ret = super.getDetails();
        if(assignedManager != null){
        ret += assignedManager.getName();
        }
        else{
        ret += "No manager assigned";
        }
        return ret;
}
     
}
