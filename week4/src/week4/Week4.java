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
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Table t1 = new Table(1, 2, false);

        System.out.println("Number of seats " + t1.getNumofseats());
        System.out.println("the table number is  " + t1.getTablenumber());
        System.out.println("are they sitting outside?" + t1.isIsoutside());
        System.out.println("booking" + t1.getAssignedbooking());

        Table t2 = new Table(2, 3, true);
        System.out.println("Number of seats " + t2.getNumofseats());
        System.out.println("the table number is  " + t2.getTablenumber());
        System.out.println("are they sitting outside?" + t2.isIsoutside());

        Booking b1 = new Booking("rebekah", 4, true);
        b1.getNumofguests();
        b1.getName();
        b1.isDineOutside();
        

        Booking b2 = new Booking("charlotte", 2, true);
         b2.getNumofguests();
        b2.getName();
        b2.isDineOutside();
        
        Booking b3 = new Booking("tyriece", 4, false);
         b3.getNumofguests();
        b3.getName();
        b3.isDineOutside();
        
        Booking b4 = new Booking("harry", 6, true);
         b4.getNumofguests();
        b4.getName();
        b4.isDineOutside();

        Staff s1 = new Staff("panashe");
        s1.getName();
        
        
        Staff s2 = new Staff("chloe");
        s2.getName();
      

        t1.Assignedstaff(s1);
       t1.Assignedstaff(s2);
        
        if(t1.booktable(b1))
        {
        System.out.println("table booked");
        }
        else
        {
        System.out.println("table not booked");
        }
        
        t1.booktable(b2);
        t1.booktable(b3);
        t1.booktable(b4);
    }

}
