/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ume;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age,score;
     Scanner test = new Scanner(System.in);
        
        System.out.println("Enter your age");
         age = test.nextInt();
        System.out.println("Enter your UTME score");
        score = test.nextInt();
        
      if(age > 16 && score > 200)
            System.out.println("you are eligible");
      else
            System.out.println("you are not eligible");
    }
    
}
