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
import java.util.Scanner;
public class CollectsData {
    int m;
    int n;
    Scanner input = new Scanner(System.in);
    
    public CollectsData(int x, int y){
    m=x;
    n=y;
    }
    public int [][]collectsMatrices(int m, int n){
        int r[][] = new int[m][n];
        System.out.println("Enter elements for Array ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               r[i][j] = input.nextInt();
            }
        }
        return r;
       }
}
       

       
    
    
    
                  


