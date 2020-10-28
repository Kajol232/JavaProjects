/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmatricescomputation;

/**
 *
 * @author user
 */
public class invertedSeries {
    public static void main(String [] args){
     char chara = '*';
     String space = " ";
        for (int i= 1; i<=6; i++ ){
            for (int j=0; j<i ; j++ ){
                System.out.print(" ");
                System.out.print(chara );
            }
         System.out.println("\n");    
     }
        System.out.println("\n");
        
        for (int i= 1; i<=6; i++ ){
            for (int j=6; j>=i ;j-- ){
                System.out.print(" ");
                System.out.print(chara );
            }
         System.out.println("\n");
            
    }
        for (int i = 1; i <= 5; i++) {
   for (int j = 1; j <= i-1; j++) {
      System.out.print(" ");
   }
   for (int j = 1; j <= 11-2*i; j++) {
      System.out.print("*");
   }
   System.out.println();
    
}
    }}
