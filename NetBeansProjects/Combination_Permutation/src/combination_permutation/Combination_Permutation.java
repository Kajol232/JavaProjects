/*
 * THIS PROGRAM AOMPUTES THE FACTORIAL OF A NUMBER,AND ALSO SOLVES COMBINATION AND 
 * PERMUTATION OF A GIVEN NUMBER 
 */
package combination_permutation;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import javax.swing.*;
public class Combination_Permutation {
    public static void main(String[] args) {
        //MAIN METHOD THAT CALLS OTHER METHOD
        //COLLECTING N,R 
        int n =Integer.parseInt(JOptionPane.showInputDialog("ENTER N"));
        int r =Integer.parseInt(JOptionPane.showInputDialog("ENTER R"));
        int d = n-r;
        // CALLING THE METHODS;
        System.out.println("The factorial of n and r is "+ factorial(n) +"\t"+ factorial(r));
        System.out.println("The computed combination of n and r is "+ combination(n,r,d));
        System.out.println("The computed Permutation of n and r is "+ permutation(n,d));      
    }
    
    //METHOD TO COMPUTES FACTORIAL OF A NUMBER
    static long factorial(int a){
        long fac =1;
    for (int i=a; i>=2; i--){
       fac *=i;
    }
    return fac;
    }
    
    //METHOD TO CALCULATES COMBINATION OF A NUMBER
    static long combination(int a, int b, int c){
     long nfac = factorial(a);
     long rfac = factorial(b);
     long dfac = factorial(c);
     long comb = nfac/(rfac*dfac);
     return comb;     
    }
    
    //METHOD TO COMPUTES PERMUTATION OF A NUMBER
   static long permutation(int a, int c){
   long nfac = factorial(a);
   long dfac = factorial(c);
   long perm = nfac/dfac;
   return perm;
   }
}
