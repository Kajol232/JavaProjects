/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
   Random randomNumberGenerator = new Random();
   int randNum = randomNumberGenerator.nextInt(100);
       System.out.println("***************THIS IS A GUESSING GAME*************");
  for ( int counter = 1; counter <= 10; counter++ ) {
     System.out.println("Enter any number between 0 and 100 inclusive");
      int num = input.nextInt();
   if (randNum > num){
     System.out.println("Your prediction is too low, you have"+ (10-counter) + "attempt(s)");
     System.out.println("Kindly try again!!!!");
   }
     else if(randNum < num){
     System.out.println("Your prediction is too high, you have"+ (10-counter) + "attempt(s)");
     System.out.println("Kindly try again!!!!");
     }
    else {
        System.out.println("Wow you are an expert at this game; you have guessed right in " + counter +"attempt(s)");
        break;
     }
        if (counter == 10 ){
         System.out.println("You have picked out of range; no attempts left");
     }
    
     }
     
    }
    
}
