/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Scanner;
public class AdminPage {
    public static void main(String []args){
       Scanner input = new Scanner(System.in); 
       System.out.println("Enter number of columns temperature");
     int m = input.nextInt();
     int temp [] = new int [m];
     System.out.println("Enter your records  for rainfall ");
       for (int i = 0; i < m; i++)
               temp [m] = input.nextInt();
     
        System.out.println("Enter number of columns rainfall");
     int n = input.nextInt();
        int rain [] = new int [n];
        System.out.println("Enter your records  for rainfall ");
       for (int j = 0; j < n; j++)
           rain [n] = input.nextInt();
    
    }    
}
