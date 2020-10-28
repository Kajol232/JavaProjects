/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuberoots;

/**
 *
 * @author user
 */
import java.util.*;
public class Cuberoots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sq,cb;
        double sqrt,cbrt;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the end point");
        int n = input.nextInt();
        cubic cubes = new cubic (n);
        System.out.print("N\t\tNsq\t\tNSqroot\t\tNcube\t\tNcubeRoot\n\n");
        for (int i=1;i<=n; i++){
         sq = cubes.getSquare(i);
         sqrt= cubes.getSquareRoot(i);
         cb = cubes.getCube(i);
         cbrt = cubes.getCubeRoot(i);
            System.out.printf("%d\t",i);
           System.out.printf("\t%.2f", sq);
           System.out.printf("\t\t%.2f", sqrt);
           System.out.printf("\t\t%.2f", cb);
           System.out.printf("\t\t%.2f", cbrt);
            System.out.println("\n\n");
            //System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n");
                
            //System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", i,sq , sqrt,cb,cbrt );
        }
        //System.out.println("........................................................");
    }
    
}
