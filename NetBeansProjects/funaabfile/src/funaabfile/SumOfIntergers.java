/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funaabfile;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SumOfIntergers {
    public static void main (String [] args)
    {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Kindly enter any number between 0 and 1000");
        int num = input.nextInt();
        int div, sum =0;
        
        while (num > 0)
        {
        div = num % 10;
        sum = sum + div;
        num /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
    
}
