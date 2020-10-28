/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegear;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class day1 {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        String name;
        int age;
        int level;
        String dept;
        
        System.out.print("INPUT YOUR NAME PLEASE : ");
        name = getInput.next();
        
        System.out.print("ENTER YOUR AGE PLEASE : ");
        age = getInput.nextInt();
        
        System.out.print("ENTER YOUR LEVEL PLEASE : ");
        level = getInput.nextInt();
        
        System.out.print("ENTER YOUR DEPARTMENT PLEASE : ");
       dept = getInput.next();
       
        System.out.println("The Student Name is " + name + " of age "+ age  );
               System.out.println(" A "+ level +" level student in " + dept +" department");
 //coursecode, title, course lecturer,semester,dpt, and level and score from department
//initialize a-z with their corresponding number and print backward
//a program to calculate, area of a circle, rectangle and perimeter of both +square 
     /**String name ="Oluwatosin";
     int age = 40;
     String dept = "Computer Science";
     String level = "200L";
     int Course = 5;
     
     System.out.println("My name is " + name +". I am "+ age+" years old");
        System.out.println("I am a "+level + " student in " + dept +" department ");
        System.out.println("My course is a "+ Course +" years course" );
        */
    
    }
}
