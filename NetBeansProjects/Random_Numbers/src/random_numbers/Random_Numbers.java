/*
 * To generate and prints random numbers in 5's
 */
package random_numbers;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O.214888
 */
import javax.swing.*;
public class Random_Numbers {
    public static void main(String[] args) {
        // TODO code application logic here
        String output = " ";
        for (int i =1; i<=20; i++){
         int val = 1 + (int)(Math.random()*6);
          output +=val +" ";
          if (i%5==0){
           output += "\n";
          }              
        }
        JOptionPane.showMessageDialog(null,output,"RANDOM NUMBERS", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
