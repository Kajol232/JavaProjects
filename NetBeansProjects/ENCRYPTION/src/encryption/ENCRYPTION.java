/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ENCRYPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
   System.out.println("*************HI,THIS PROGRAM ENCRYPTS YOUR FILE");
       System.out.println("Enter your string for encoding");
       String encode;
       encode = input.nextLine().toLowerCase();
       System.out.println("The Encrypted result is");
       for (int i=0; i<encode.length(); i++){
            char alphabet = encode.charAt(i);
         {
             
            switch (alphabet){
                case 'a':
                    alphabet = 'e';
                    break;
                case 'e' :
                    alphabet ='i';
                     break;
                case 'i':
                    alphabet = 'o';
                    break;
                case 'o':
                    alphabet = 'u';
                    break;
                case 'u':
                    alphabet = 'a';
                    break;
            }
        }
           System.out.print(alphabet + "");
       }
       System.out.println();
         }
    }
    

