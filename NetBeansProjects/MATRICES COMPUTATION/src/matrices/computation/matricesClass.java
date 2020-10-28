/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.computation;

/**
 *
 * @author user
 */
public class matricesClass {
    int a[][],b[][],c[][];
    int m,n;
 
    public matricesClass(int x[][], int y[][], int z[][], int g, int h){
    a = x;
    b=y;
    c=z;
    m=g;
    n=h;
    }
    
   //METHOD TO ADD
    public int[][] sumAllMatrices(){
    int sum[][]= new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum [i][j]= a[i][j] + b[i][j] + c[i][j];
            }
        }
   return sum; 
}
 //Method to Multiply
    public int [][] multiplyAllMatrices(int x[][], int y[][], int r, int d){
        //Product of Matrices
        int product[][] = new int[r][d];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < d; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < d; k++) {
                        product[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return product;
    }
   //Method to add right and left diagonal of two matrices
    public int sumDiagonal(int a[][], int b[][]){
    int sumd =0;
    int suma =0;
    int sumb=0;
      for (int i =0;i<a.length;i++){
         for (int j = 0; j<a.length; j++)
             if (i==j){
             suma +=a[i][j]; 
                     }
             else{continue;
             }
      }
        for (int i=0; i<b.length; i++) {
            for (int j=b.length-1; j>0; j--){
            sumb +=b[i][j]; 
            }
      }
    return sumd=suma+sumb;
    }
    public void printMatrices(int a[][]){
     for (int[] al : a) {
            for (int p = 0; p < al.length; p++) {
                System.out.printf("%d ", al[p]);
            }
            System.out.println("\n");
        }
    }
}
