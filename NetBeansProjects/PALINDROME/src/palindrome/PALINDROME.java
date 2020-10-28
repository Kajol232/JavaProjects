/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PALINDROME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("This program checks if a string is a Palindrome,\n Enter any string of your Choice");
      boolean stop = false;
      int i =0, j = input.length()-1;
      String check = null;
      checkPalindrome(input);
       while (i< input.length()){
       if (input.charAt(i)== input.charAt(j)){
           check += j;
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
           
           System.out.println(check);
       
           System.out.println(input + " is a palindrome");
       }
       
        System.out.println("Goodbye to palindrome");
    }
        
    public static boolean checkPalindrome(String inputString) {
    String check = null;
    int x = 0; 
    int j = inputString.length() - 1;
    
    for(int i = 0; i < inputString.length(); i++){
        check = check + j; 
    } 
    
    if(inputString.equals(check)){
        System.out.println(check);
        return true;
    }   
    
    return false;

}

        
    
    
}
