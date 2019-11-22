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
public abstract class Employee {
    
     protected String name;
    protected double Pay;
    protected int NumofHours, HolidayEntiltement;

    public Employee(String nameln, int Payln, int NumofHoursln, int HolidayEntiltementln) {
        name = nameln;
        Pay = Payln;
        NumofHours = NumofHoursln;
        HolidayEntiltement = HolidayEntiltementln;

    }
    
    public boolean BookHoliday(int numDays)
    {
      if(numDays  > 0  && HolidayEntiltement-numDays >= 0)
      {
      HolidayEntiltement -= numDays;
      return true;
      
      }
        return false;
    
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getyearlySalary(); 

    public void setPay(int Pay) {
        this.Pay = Pay;
    }

    public int getNumofHours() {
        return NumofHours;
    }

    public boolean setNumofHours(int NumofHoursln) {
        if (NumofHours > 40) {
            return false;
        }
        NumofHours = NumofHoursln;
        return true;

    }

    public int getHolidayEntiltement() {
        return HolidayEntiltement;
    }

    public void setHolidayEntiltement(int HolidayEntiltement) {
        this.HolidayEntiltement = HolidayEntiltement;
    }
    
    public String getDetails()
    {
    String ret = name + "" + HolidayEntiltement + "" + getyearlySalary();
    return ret;
    }
    

}

    

