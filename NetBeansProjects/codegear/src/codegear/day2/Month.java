/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegear.day2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Month {
    public static void main(String [] args){
    String monthList[] = new String[12];
    Scanner input = new Scanner (System.in);
    
       //collecting data
    for (int i=0; i<monthList.length; i++){
        System.out.println("KINDLY INPUT THE MONTH AT " + (i+1));
        monthList[i]=input.next();
    }
      //printing data
        System.out.println("*************MONTH OF THE YEAR*************");
   for (int i=0;i<monthList.length;i++){
       System.out.println(monthList[i]);
   }
    
    }
    
}
