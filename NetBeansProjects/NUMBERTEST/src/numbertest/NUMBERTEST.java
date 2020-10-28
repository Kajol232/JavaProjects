/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NUMBERTEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first Number");
        int Num_1 = input. nextInt();
        System.out.println("Enter the second Number");
        int Num_2 = input.nextInt();
        
        if (Num_1==Num_2) {
                System.out.println("The numbers are equal");
              }
        else {
            if (Num_1<Num_2)
                        
                System.out.println("The larger number is" + Num_1);
               
            else 
                System.out.println("The lesser number is" + Num_2);
        }
    }
}
    

