/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LEAPYEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console =new Scanner(System.in);
    
        System.out.println("Enter the Year");
          int year = console.nextInt();
    if (year % 4 == 0 && year % 100!= 0)
            System.out.println("The year is a leap year");
       else
            System.out.println("Its not a leap year");
    }
    
}
