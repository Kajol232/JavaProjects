/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmwithdrawal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ATMWITHDRAWAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner input = new Scanner(System.in);
   System.out.println("*****This Program Allow a User to Withdraw from an ATM Machine******");
   System.out.println("-- Amount --");
   System.out.println("0      QUIT");
    System.out.println("1      1000NGN");
    System.out.println("2      2000NGN");
    System.out.println("3      5000NGN");
    System.out.println("4      10000NGN");
    System.out.println("5      15000NGN");
    System.out.println("6      20000NGN");
    boolean continueInput = true;
 int totalAmount = 0;
while (continueInput){
    System.out.println("Kindly enter the amount by selecting an option between 1-6 as shown above; Press 0 to quit");
    int amount = input.nextInt();
    switch (amount){
        case 1:
            System.out.println("You are withdrawing :" + 1000);
            totalAmount += 1000;
            break;
        case 2:
            System.out.println("You are withdrawing :" + 2000);
            totalAmount += 2000;
            break;
        case 3:
            System.out.println("You are withdrawing :" + 5000);
            totalAmount += 4000;
            break;
        case 4:
            System.out.println("You are withdrawing :" + 10000);
            totalAmount += 10000;
            break;
        case 5:
            System.out.println("You are withdrawing :" + 15000);
            totalAmount += 15000;
            break;
        case 6:
            System.out.println("You are withdrawing :" + 20000);
            totalAmount += 20000;
            break;    
        case 0:
            System.out.println("Goodbye, Thank you for banking with us");
            continueInput = false;
            break;
       default:
            System.out.println("Amount selected out of range; Please select an option between 1 - 6 ; Press 0 to quit");
            break;
   }
    System.out.println("The total amount you are withdrawing is " + totalAmount);
}
    System.out.println("Please take your cash");
    System.out.println("Thank you for banking with us");
   }
        catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception);
                }
    }
}
    

