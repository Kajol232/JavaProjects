/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class palindrome {
    public static void main(String [] args){
      String input = JOptionPane.showInputDialog("This program checks if a string is a Palindrome,\n Enter any string of your Choice");
      boolean stop = false;
      int i =0, j = input.length()-1;
       while (i< input.length()){
       if (input.charAt(i)== input.charAt(j)){
          i++;
          j--;
          stop = true;
          continue;          
       }
       else{
               System.out.println(input + "is not a palindrome");
               break;
       }
       
       }
       if (stop == true){
       
           System.out.println(input + " is a palindrome");
       }
       
        System.out.println("Goodbye to palindrome");
        
               }   
}
