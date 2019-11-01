/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 4manop68
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car c1 = new Car("Mercedes", 40, 120, 100,"black",5);
        

        System.out.println("the first car's name is " + c1.getName());
        System.out.println("the colour of the first car is " + c1.getColour());
        System.out.println("the car has " + c1.getDoors() + " doors");
        System.out.println("currentspeed " + c1.getCurrentspeed());
        System.out.println("fuellevel " + c1.getFuellevel());
        System.out.println("Maxspeed " + c1.getMaxspeed());
        
        c1.accelerate(1000);
        c1.brake(90);
        c1.refuel(100);
        
        System.out.println("the first car's name is " + c1.getName());
        System.out.println("the colour of the first car is " + c1.getColour());
        System.out.println("the car has " + c1.getDoors() + " doors");
        System.out.println("currentspeed " + c1.getCurrentspeed());
        System.out.println("fuellevel " + c1.getFuellevel());
        System.out.println("Maxspeed " + c1.getMaxspeed());

        
        Car c2 = new Car("Fiat", 60, 120, 100, "blue", 7);
        
        System.out.println("The second car's name is " + c2.getName());
        System.out.println("the colour of the first car is " + c2.getColour());
        System.out.println("the car has " + c2.getDoors() + " doors");
        System.out.println("currentspeed " + c2.getCurrentspeed());
        System.out.println("fuellevel " + c2.getFuellevel());
        System.out.println("Maxspeed " + c2.getMaxspeed());
        
        c2.accelerate(1000);
        c2.brake(15);
        c2.refuel(100);
        System.out.println("the first car's name is " + c2.getName());
        System.out.println("the colour of the first car is " + c2.getColour());
        System.out.println("the car has " + c2.getDoors() + " doors");
        System.out.println("currentspeed " + c2.getCurrentspeed());
        System.out.println("fuellevel " + c2.getFuellevel());
        

    }

}
