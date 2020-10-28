/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.computation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MATRICESCOMPUTATION {

    public static void main(String[] args) {
        int m, n, r, d, x, y;
        Scanner input = new Scanner(System.in);
 //Collecting Array Data for A,B,C{
        System.out.println("Enter number of rows and columns for  matrices A");
        m = input.nextInt();
        n = input.nextInt();
        CollectsData matData = new CollectsData(m,n);
        int a[][] = matData.collectsMatrices(m,n);
 
        System.out.println("Enter number of rows and columns for  matrices B");
        r = input.nextInt();
        d = input.nextInt();
        int b[][] = matData.collectsMatrices(r,d);;
        
        System.out.println("Enter number of rows and columns for  matrices C");
        x = input.nextInt();
        y = input.nextInt();
        int c[][] = matData.collectsMatrices(x,y);;
 matricesClass matclass = new matricesClass(a, b, c, m, n);
//Printing Array Elements A,B,C.{
        System.out.println("Original array A .....\n");
        matclass.printMatrices(a);
        System.out.println("Original array B.....\n");
        matclass.printMatrices(b);
        System.out.println("Original array C .....\n");
        matclass.printMatrices(c);

//Sum of Matrices and Printing Sum Elements.
        int sum[][] = new int[m][n];
        if (m == n && n == d) {
            sum = matclass.sumAllMatrices();
            System.out.println("*******THE SUM OF MATRICES A ,B AND C********");
            matclass.printMatrices(sum);
        } else {
            System.out.println("MATRICES NOT SUMMABLE");
        }

//Product of Matrices and printing products
        int product[][] = new int[m][d];
        if (n == r) {
            product = matclass.multiplyAllMatrices(a, b, n, r);
            System.out.println("*******THE SUM OF MATRICES A AND B********");
            matclass.printMatrices(product);
        } else if (n == x) {
            product = matclass.multiplyAllMatrices(a, c, n, x);
            System.out.println("*******THE SUM OF MATRICES A AND C********");
            matclass.printMatrices(product);
        }else if (d == x) {
            product = matclass.multiplyAllMatrices(b, c, d, x);
            System.out.println("*******THE SUM OF MATRICES B AND C********");
            matclass.printMatrices(product); 
        
        }else {
            System.out.println("Matrices cannot be multiplied");
        }
     //DIAGONAL AND PRINTING SUM
     int diag =0;
     if (m==n && r==d){
     diag = matclass.sumDiagonal(a,b);
         System.out.println("SUM OF DIAGONAL IS "+ diag);
     }else if (r==d && x==y){
     diag = matclass.sumDiagonal(b,c);
         System.out.println("SUM OF DIAGONAL IS "+ diag);

     }else{
         System.out.println("Diagonal not Summable");}
        }
    }


