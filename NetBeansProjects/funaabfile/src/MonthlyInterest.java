/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MonthlyInterest {
   public static void main(String [] args)
   {
   Scanner input = new Scanner(System.in);
       System.out.println("Kindly input your monthly savings");
       double principal = input.nextInt();
       double rate = 0.05;
       double monthlyInt = rate/12;
       double timeRate = monthlyInt + 1;
       double si, accVal, temp= principal;
       System.out.println("Kindly input the number of months");
       int month = input.nextInt();
       
       for (int i=0;i< month; i++)
        {
           si = temp*timeRate;
            //System.out.println(si);
            temp +=si;
           accVal = principal +  si;
        }
       
       System.out.println("After the "+ month + " month, the account value is $" + principal);
       }
   }

