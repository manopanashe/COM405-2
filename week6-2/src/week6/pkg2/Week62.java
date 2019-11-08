/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg2;

/**
 *
 * @author 4manop68
 */
public class Week62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarPark cp = new CarPark(15);
        User u1 = new User("mercedes");
        
      cp.addUser(u1);
      cp.addUser(new User("mercedes"));
     
      if (cp.addUser(new User("mercedes")))
       {
           System.out.println("Added");
           
       }
       else
       {
           System.out.println("Car park full");
       }
       if ( cp.removeUser(2))
       {
           System.out.println("Have a good day");
           
       }
      
   
    }
    
}
