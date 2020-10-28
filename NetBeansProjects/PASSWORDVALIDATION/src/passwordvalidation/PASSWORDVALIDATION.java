/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PASSWORDVALIDATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
         Scanner input = new Scanner(System.in);
         String password = input.nextLine();
         int charCount = 0;
         int numCount = 0;
         int specialXter = 0;
         
          
         if (password.length() < 10)
         {
             System.out.println("According to the terms of agreement, password length can not be less than 10");
         }
         else{
         for (int i = 0; i < password.length(); i++){
             
             if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' || (password.charAt(i) >= 'a' && password.charAt(i) <= 'z')){
                 charCount++;
             }
             else if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                 numCount++;
             }
             else {
                    specialXter++;
                    System.out.println("inavlid");
                    System.out.println("According to T & C, other characters are not allowed");
                    System.out.println("Only numbers and digits are allowed");
                    break;
             }
         }
         if (numCount >= 2 && charCount >=8)
         {
             if (specialXter >=1)
             {
                 System.out.println("Password Invalid, special character not allowed");
                 System.out.println("Only numbers and digits are allowed");
             }
             
             else{
             
             System.out.println("Password Valid");}
         }
         else 
         {
             System.out.println("Password Invalid");
             System.out.println("According to T & C, password must have at least eight characters and at least 2 digits");
         }
         }
    }
    
}
