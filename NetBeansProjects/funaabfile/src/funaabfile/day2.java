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
public class day2 {
    public static void main(String [] args)
    {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Kindly inpur the subtotal payment");
        int subtotal = input.nextInt();
        
        System.out.println("Kindly input the gratuity rate");
        int gratuityRate = input.nextInt();
        
        double gratuity = (gratuityRate/100.0) * subtotal;
        double totalPayment = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and the total is $" +totalPayment );
    }
}
