/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmatricescomputation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Basic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A NUMBER");
        int number = input.nextInt();
        System.out.println("Enter table number");
        int mult = input.nextInt();
        
    
        for(int i = number; i >= 1; i--){
            for(int j=mult; j>=1; j--)
            System.out.println(i + " * " + j + " = " + i*j);
        }

        
        
    }
}
