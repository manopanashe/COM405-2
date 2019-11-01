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

public class Week2 {

    public static void main(String[] args) {
        int count = 5;

        while (count < 21) {
            System.out.println("i have looped" + count + "times");
            count++;
        }

        System.out.println("this line will only run loop as finished");

        for (int timesTable = 2; timesTable <= 2; timesTable++) {
            System.out.println("printing the" + timesTable + "timestable");
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * timesTable);
            }
        }
        int plus = 5;
        do {
            System.out.println("the value of count is:" + plus);
            plus++;
        } while (plus <= 15);
        int min = 10;
        do {
            System.out.println("the value of count is:" + min);
            min--;
        } while (min >= 1);

        System.out.println("Please enter the letter which corresponds with your choice:\n"
                + "a – Calculate the area of a rectangle\n"
                + "b – Display a multiplication table\n"
                + "c – Add two numbers:");
        String input;
        try (Scanner scanIn = new Scanner(System.in)) {
            input = scanIn.nextLine();
        }

        System.out.println("You entered the value: " + input);

    }
}
