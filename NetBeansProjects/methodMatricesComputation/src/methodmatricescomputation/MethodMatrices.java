/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmatricescomputation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MethodMatrices {
    static int m, n, r, d, x, y;
    static int a[][];
    static int b[][];
    static int c[][];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("Enter number of rows and columns for  matrices A B and C");
        //Dimensions for matrix A
        m = input.nextInt();
        n = input.nextInt();
        //Dimensions for matrix B
        r = input.nextInt();
        d = input.nextInt();
        //Dimensions for matrix C
        x = input.nextInt();
        y = input.nextInt();
        assignMatrices();
        sumAllMatrices();
        multiplyAllMatrices();

        
        
        
        
        //}
//Printing Array Elements A,B,C.{
        System.out.println("Original array A .....\n");
        for (int[] a1 : a) {
            for (int p = 0; p < a1.length; p++) {
                System.out.printf("%d ", a1[p]);
            }
            System.out.println("\n");
        }

        System.out.println("Original array B.....\n");
        for (int[] bl : b) {
            for (int p = 0; p < bl.length; p++) {
                System.out.printf("%d ", bl[p]);
            }
            System.out.println("\n");
        }
        System.out.println("Original array C .....\n");
        for (int[] cl : c) {
            for (int p = 0; p < cl.length; p++) {
                System.out.printf("%d ", cl[p]);
            }

            System.out.println("\n");
        }
        //}


    }
    
    //Assigning the matrices
    static void assignMatrices(){
        a = new int[m][n];
        System.out.println("Enter elements for Array A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Enter number of rows and columns for  matrices B");
        b = new int[r][d];
        System.out.println("Enter elements for Array B");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < d; j++) {
                b[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Enter number of rows and columns for  matrices C");
        x = input.nextInt();
        y = input.nextInt();
        c = new int[x][y];
        System.out.println("Enter elements for Array C");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = input.nextInt();
            }
        }
    }
    
    //Summing all matrices and printing it
    static void sumAllMatrices(){
        int sum[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j] + c[i][j];
            }
        }

        System.out.println("Sum Result .....\n");
        for (int[] suml : sum) {
            for (int p = 0; p < suml.length; p++) {
                System.out.printf("%d ", suml[p]);
            }
            System.out.println("\n");
        }
    }
    
    
    //Multiplying all matrices and pinting them
    static void multiplyAllMatrices(){
        //Product of Matrices
        int product[][] = new int[m][d];
        if (n == r) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < d; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < d; k++) {
                        product[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        } else if (n == x) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < y; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < y; k++) {
                        product[i][j] += a[i][k] * c[k][j];
                    }
                }
            }
        } else {
            System.out.println("Matrices cannot be multiplied");
        }

//Printing Products Elements.
        System.out.println("Products Result .....\n");
        for (int[] productl : product) {
            for (int p = 0; p < productl.length; p++) {
                System.out.printf("%d ", productl[p]);
            }

            System.out.println("\n");
        }

    }
}
