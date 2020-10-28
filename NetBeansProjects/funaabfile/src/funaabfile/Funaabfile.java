/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funaabfile;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Funaabfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Kindly input the first nine digits of your ISBN");
        int num = input.nextInt();
        int div, rem, sum=0;
        int temp = num;
        for(int i=9; i>0;i--)
        {
        while (temp > 0)
        {
        rem = temp % 10;
        div = rem*i;
        sum += div;
        temp /= 10;
        }
          }
       sum %= 11;
       Integer obj = new Integer(num);
       String isbn = obj.toString();
   if (sum == 10)
   {
       System.out.println("THE ISBN-10 NUMBER IS "+ isbn+ "X");
   }
   else
   {
       System.out.println("THE ISBN-10 NUMBER IS " + isbn + sum);
   }
   }
        }
    
    

