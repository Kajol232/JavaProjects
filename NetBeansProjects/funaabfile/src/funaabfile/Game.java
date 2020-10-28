/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funaabfile;

import java.util.*;

/**
 *
 * @author user
 */
public class Game {
    public static void main(String[] args)
    {
   int lottery =(int)(Math.random()*1000);
    Scanner input = new Scanner(System.in);
        System.out.println("Kindly input any 3 digits num");
    
    int guess = input.nextInt();
    
    int lotdig1 = lottery/100;
    int temp = lottery%100;
    int lotdig2 = temp/10;
    int lotdig3 = temp%10;
    
    int guessdig1 = guess/100;
    int tempguess = guess%100;
    int guessdig2 = tempguess/10;
    int guessdig3 = tempguess%10;
    
        System.out.println("The lottery number is " + lottery);
    
    if (guess==lottery)
    {
        System.out.println("Exact match: you win $10,000");
    }
    else if (guessdig1 == lotdig1 && guessdig2 == lotdig2 && guessdig3 == lotdig3)
    {
        System.out.println("Match all digits : you win $3,000");   
    }
    else if (guessdig1 == lotdig1 || guessdig2 == lotdig2 || guessdig3 == lotdig3)
            {
                System.out.println("Match one digits : you win $1,000"); 
            }
    else
    {
        System.out.println("Sorry, no match");
    }
    }
}
