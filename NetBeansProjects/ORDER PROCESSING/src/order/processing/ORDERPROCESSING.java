/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.processing;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ORDERPROCESSING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****This Program Process an Order for a Customer******");
Scanner input = new Scanner(System.in);
    System.out.println("-- Order Code with Prices --");
    System.out.println("Product 1      1200NGN");
    System.out.println("Product 2      1600NGN");
    System.out.println("Product 3      4000NGN");
    System.out.println("Product 4      2000NGN");
    System.out.println("Product 5      2100NGN");
 
 boolean continueInput = true;
 int totalAmountSold = 0;
while (continueInput){
    System.out.println("Kindly place your order by selecting between 1-5 as shown below; Press 0 to quit");
    int order = input.nextInt();
    switch (order){
        case 1:
            System.out.println("Product 1 selected");
            totalAmountSold += 1200;
            break;
        case 2:
            System.out.println("Product 2 selected");
            totalAmountSold += 1600;
            break;
        case 3:
            System.out.println("Product 3 selected");
            totalAmountSold += 4000;
            break;
        case 4:
            System.out.println("Product 4 selected");
            totalAmountSold += 2000;
            break;
        case 5:
            System.out.println("Product 5 selected");
            totalAmountSold += 2100;
            break;
        case 0:
            System.out.println("Goodbye, Thanks for the patronage");
            continueInput = false;
            break;
        default:
            System.out.println("Product Number out of range; Please select a number between 1 - 5 ; Press 0 to quit");
            break;
    }
    System.out.println("Your total order is :" + totalAmountSold);
}
    }
    
}
