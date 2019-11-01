/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

/**
 *
 * @author 4manop68
 */
import java.util.Scanner;

public class Week2_2 {

    public static void main(String[] args) {
        int state = 1;
        do {
            System.out.println("Please enter the letter which corresponds with your choice:\n"
                    + "a – Calculate the area of a rectangle\n"
                    + "b – Display a multiplication table\n"
                    + "c – Add two numbers\n"
                    + "x-exit:");
            String input;
            Scanner scanIn = new Scanner(System.in);

            input = scanIn.nextLine();
            if ("a".equals(input)) {
                System.out.println("You entered the value  a!!! ");

                System.out.println("you have selected A- Area of a rectangle:\n"
                        + "please enter width\n");
                int width = Integer.parseInt(scanIn.nextLine());
                System.out.println("please enter height\n");
                int height = Integer.parseInt(scanIn.nextLine());
                System.out.println("The area is" + width * height);
            } else if ("b".equals(input)) {
                System.out.println("You entered the value  b!!! ");

                System.out.println("you have selected B-Display a multiplication table:\n"
                        + "please enter a number\n");
                int number = Integer.parseInt(scanIn.nextLine());
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i * number);
                }
            } else {
                System.out.println("You entered the value  c!!! ");
                System.out.println("you have selected C- Add two numbers:\n"
                        + "please enter a number\n");
                int number = Integer.parseInt(scanIn.nextLine());
                System.out.println("please enter second number\n");
                int secondnumber = Integer.parseInt(scanIn.nextLine());
                System.out.println("the answer is" + number + secondnumber);
            } 
            
        } while (state == 1);

    }
}
