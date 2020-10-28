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
public class Encoding {
    public static void main(String [] args) {
        System.out.println("Enter your message to encode");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int strLength = str.length();
    if (strLength < 10){
            System.out.println("YOUR MESSAGE MUST NOT BE LESS THAN 10 CHARACTER");
    }
        String encoded = encode(str);
        System.out.println(encoded);
        System.out.println(decode(encoded));
    }
    private static String encode (String str){
           int strLength = str.length();    
           int div = strLength/2;
           String ssA = str.substring(0,(div));
           String ssB = str.substring(div);
           String[] returned = exchange(ssA, ssB);
           return returned[1] + returned [0];
    }
    private static String[] exchange(String ssA, String ssB){
       char ssArrA [] = ssA.toCharArray();
       char ssArrB [] = ssB.toCharArray();
         for (int i=1; i<ssArrA.length;i+=2){
             char tmp = ssArrA[i];
             ssArrA[i] = ssArrB[i-1];
             ssArrB[i-1] = tmp;
         }
         String[] result = {new String(ssArrA), new String(ssArrB)};
         return result;
    }

    private static String decode (String str){
       int div = str.length()%2 != 1? str.length()/2:(str.length()/2)+1;
       String ssB = str.substring(0,(div));
       String ssA = str.substring(div);
       String[] returned = exchange (ssA, ssB);
       return returned[0] + returned[1];
       
    }
}
         
    
    
    
    
    
    
    
    

