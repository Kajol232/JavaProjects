/*
 *
 */
package quad_eq_main;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Quad_Eq_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER CO-EFFICIENT OF X^2");
        int a = input.nextInt();
        System.out.println("ENTER CO-EFFICIENT OF X");
        int b = input.nextInt();
        System.out.println("ENTER CONSTANT");
        int c = input.nextInt();
        quad_eq quad = new quad_eq(a,b,c);
        System.out.println("A = "+ a +"\t B = "+ b +"\t C = "+c);
        //METHOD TO KNOW WHICH TYPE OF ROOTS THE EQUATION HAS
       if (quad.dis()<0){
           System.out.println("No roots, Equation has complex roots");
   }
   else 
       if(quad.dis()>0){
           System.out.println("Real Roots, Equation has 2 real roots");
           double root1 = quad.r1();
           double root2 = quad.r2();
           System.out.println("ROOT 1 = "+ "\t"+ root1 + "\n ROOT 2 = "+ "\t"+ root2);
   }
       else{
           System.out.println("Real root, Equation has 1 real root");
           double root = quad.cr();
           System.out.println("Root = "+ "\t "+ root);
       }
   } 
    
    
}
