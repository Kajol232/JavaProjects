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
public class MatricesComputation {
 public static void main(String[] args){
    class Matrices{
     private int a[][], b[][], c[][], m,n,r,d,x,y;
     //public Matrices (int x[], int y[], int z[]){
      //this.a = x[][];}
     public int sumMatrices(int a[][], int b[][], int c[][], int m, int n){
       int sum = 0;
       for (int i=0,j=0; i <m && j< n ; i++, j++){  
               sum =  a[m][n] + b[r][d] + c[x][y];}
         System.out.println(sum);
       return sum;
    }
     /*public int productMatrices (int a[], int b[]){
     
     }
     
     public int diagonalMatrices(int a[], int b[], int c []){
     
     }*/
     
     
     
   }   
     int m,n,r,d,x,y,e,f;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter number of rows and columns for  matrices A");
     m = input.nextInt();
     n = input.nextInt();
     int a[][] = new int[m][n];
     System.out.println("Enter elements for Array A");
       for (int i = 0; i < m; i++){
           for (int j=0; j < n; j++){
               a[i][j] = input.nextInt();
               System.out.println(a[][]);
           } 
       }
       System.out.println("Original array .....\n");
		for (int l = 0, p=0; l < m && p < n; l++, p++);
		  System.out.print(a[l][p]);    
     System.out.println("Enter number of rows and columns for  matrices B");
     r = input.nextInt();
     d = input.nextInt();
     int b[][] = new int[r][d];
     System.out.println("Enter elements for Array B");
       for (int i = 0; i < r; i++)
           for (int j=0; j < d; j++)
               b[i][j] = input.nextInt();
     System.out.println("Original array .....\n");
		for (int l = 0; l < r; l++ )
		      System.out.print(b[l] + "\t");	
		System.out.println("\n");
     System.out.println("Enter number of rows and columns for  matrices C");
     x = input.nextInt();
     y = input.nextInt();
     int c[][] = new int[x][y];
     System.out.println("Enter elements for Array C");
       for (int i = 0; i < x; i++)
           for (int j=0; j < y; j++)
               a[i][j] = input.nextInt();
       System.out.println("Original array .....\n");
		for (int l = 0; l < x; l++ )
		      System.out.print(c[x] + "\t");	
		System.out.println("\n");
                System.out.println("sum of three matrices is " +sumMatrices());
   
    }
}
