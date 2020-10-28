/*
 * TO TEST FOR THE VERSATILE MANIPULATION OF STRING
 */
package string_test;

/**
 *
 * @MUHAMMAAD AMOTULRAHMAN O. 214888
 */
import java.util.*;
public class String_Test {
    public static void main(String[] args) {
        String univer = "My School is very good";
        String uni ="my school is very Good";
        int univerLength = univer.length();//computes length of univer
        System.out.println("Univer is of Length "+ univerLength);//prints out length of univer
        if (univer.equalsIgnoreCase(uni)){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Strings not equal");
        }
        
        //Replacing school with university in univer
       String replcUniver = univer.replace("School","University");
        
        String subUniver =replcUniver.substring(3,13);//getting university from univer and printing it
        System.out.println(subUniver);
        
        for(int i = uni.length()-1; i>=0;i--){//Reversing uni and printing it
            System.out.print(uni.charAt(i));
        }
        System.out.println("\n");
        int j = uni.lastIndexOf('s');
        System.out.println("The Last Index of 's' in uni is "+ j);
    }
    
}
