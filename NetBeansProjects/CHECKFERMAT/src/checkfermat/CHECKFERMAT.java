/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkfermat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CHECKFERMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
System.out.println("*****This Program Calculates to confirm Fermat Last Theorem******");
   System.out.println("Enter value for variable A");
    int a  = input.nextInt();
   System.out.println("Enter value for variable B");
   int b = input.nextInt();
   System.out.println("Enter value for variable C");
   int c = input.nextInt();
   System.out.println("Enter value for variable N");
   int n = input.nextInt();
   double x= Math.pow(c,n);
   double y = Math.pow(a,n);
   double z= Math.pow(b, n);
       System.out.println("The computed value for X is: " + x);
       System.out.println("The computed value for Y is: " + y);
       System.out.println("The computed value for Z is: " + z);
   if (n>2){
   double d=y+z;
   if (d==x){
       System.out.println("HOLY SMOKES, FERMAT WAS WRONG!");
   }
   else
   {
       System.out.println("no that doesnt work");
           }
   }
   else {
       System.out.println("Fermat Theorem is correct");
   }
    }
    
}
