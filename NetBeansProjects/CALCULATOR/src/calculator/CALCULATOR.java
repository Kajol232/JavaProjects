/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CALCULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***************A SIMPLE CALCULATOR PROGRAM********");
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = calc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = calc.nextInt();
        System.out.println("Select any of the operation below ");
        System.out.println("-- Calculator Menu --");
        System.out.println("0. Quit");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        int select = calc.nextInt();
        double result;
        switch(select){
           case 0:
               System.out.println("Calculator Quit Sucessfully");
                return;
           case 1:
               result = num1 + num2;
               System.out.println("Sum =" + " " + result);
               break;
           case 2:
               result = num1 - num2;
               System.out.println("Difference =" + " " + result);
               break;
           case 3:
               result = num1 * num2;
               System.out.println("Product =" + " " + result);
               break;
           case 4:
               result = (double) num1/num2;
               System.out.println("Division =" + " " + result);
               break;
           default:
                  System.out.println("Invalid Selection");
                  break;
            }        
    }
    
}
