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

public class Week2_3 {

    public static void main(String[] args) {
   for (int row=1; row<=3; row++) 
   {
        for (int count=1; count<=5; count++)
           {
               if (count == row+1)
               {
                   System.out.println(" ");
               }
               else{
               System.out.println("*");
               }
           }
   }   
}
}
