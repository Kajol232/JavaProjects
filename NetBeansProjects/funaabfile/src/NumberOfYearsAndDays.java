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
public class NumberOfYearsAndDays {
   public static void main (String [] args)
   {
       int numOfYears;
       double numOfDays;
       
   Scanner input = new Scanner (System.in);
       System.out.println("Kindly input any the minutes");
       int min = input.nextInt();
       
       int yearMin = 60*24*365;
       numOfYears = min / yearMin;
       numOfDays = (double)min % yearMin;
       
       System.out.println(min + "is approximately " + numOfYears + " years" + numOfDays + " Days");
   }
}
