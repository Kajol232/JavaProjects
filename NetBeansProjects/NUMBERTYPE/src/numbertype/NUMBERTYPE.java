/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertype;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NUMBERTYPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    
        System.out.println("Input your number");
    int Num = input.nextInt();
    
    if (Num%2 == 0)
            System.out.println("The number is even");
    else
            System.out.println("The number is odd");
            }
    }
    

