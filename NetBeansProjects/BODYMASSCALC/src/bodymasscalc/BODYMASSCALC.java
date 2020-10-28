/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymasscalc;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BODYMASSCALC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     System.out.println("*****This Program Calculates and Classify the Body mass******");
   System.out.println("Enter your Height in M");
    int height = input.nextInt();
   System.out.println("Enter your Weight in KG");
   int weight = input.nextInt();
   int bmi = weight/(height^2);
   if (bmi>=30){
       System.out.println("You are an Obese as your BMI is over the mormal range");
       System.out.println("Kindly watch your weight as you still have at least" + (bmi-30)+"KG to lose");
   }
   else if(bmi > 25 && bmi <30){
       System.out.println("You are Overweight as your BMI is over the mormal range");
       System.out.println("Kindly watch your weight as you still have at least" + (30-bmi)+"KG to lose");    
    }
   else if(bmi <= 18){
       System.out.println("You are Underweight as your BMI is under the mormal range");
       System.out.println("Kindly add to your weight as you have at least" + (18-bmi)+ "KG to add");   
   }
   else {
   System.out.println("You are in the  mormal range");
       System.out.println("Please keep it up");
   }
   
    
    
    }
    }
    

