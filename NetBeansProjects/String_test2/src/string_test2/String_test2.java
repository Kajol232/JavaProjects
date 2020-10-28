/*
 * String manipulation test
 */
package string_test2;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import java.util.*;
import javax.swing.*;
public class String_test2 {
    public static void main(String[] args) {
        //reading in the string
        String word = JOptionPane.showInputDialog("ENTER YOUR STRING HERE");
        System.out.println("The original string is "+ word);
        
        //splitting the string in to achar array using blank as token seperator
        String wordArray[]=word.split(" ");
        //Printing length of the array
        System.out.println("The number of words in the array is " + wordArray.length+1);
        // printing the words in the array
        System.out.println("The words in the array is ");
        for(int i = 0; i<wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
    }
    
}
