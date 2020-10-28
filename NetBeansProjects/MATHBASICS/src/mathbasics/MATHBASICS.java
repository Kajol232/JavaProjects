/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbasics;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MATHBASICS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Arith = new Scanner(System.in);
        System.out.println("Enter A");
        int a = Arith.nextInt();
        System.out.println("Enter B");
        int b = Arith.nextInt();
        int SumNum = a+b;
        System.out.println("Sum of A and B is"+ SumNum);
        int SubNum = a-b;
        System.out.println("Subtraction of A and B is "+ SubNum);
        int MulNum = a*b;
        System.out.println("Multiplication of A and B is "+ MulNum);
        float DivNum = a/b;
        System.out.println("The Division of A and B is "+ DivNum);
        
    }
    
}
