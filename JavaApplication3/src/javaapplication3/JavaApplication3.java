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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Employee e1 = new Employee("Panashe", 10, 5, 6);
        Manager m1 = new Manager("mano",20, 10,10, 8);
        AdminStaff a1 = new AdminStaff("rachel", 10, 10, 11);
        
        a1.setAssignedManager(m1);
        
         System.out.println(e1.getDetails());
         System.out.println(m1.getDetails());
       System.out.println(a1.getDetails());
        
    
    }
}


