/*
 * THIS PROGRAM COMPUTES DAILY AND WEEKLY SALES FOR AN ORGANISATION
 */
package salescalc;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import java.util.Scanner;

public class Salescalc {

    public static void main(String[] args) {
        // TODO code application logic here
        double weeklySales=0;
        double dailySales;
        double dptSales=0;
        double overallSales =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of stores in the organization");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of department in store" + i + 1);
            int m = input.nextInt();
            for (int j = 0; j < m; j++) {
                for (int k = 1; k <= 7; k++) {
                    System.out.println("Enter sales for day "+ k);
                 dailySales = input.nextInt();
                 weeklySales +=dailySales;
                }
                System.out.println("TOTAL SALES PER WEEK for Department  "+(j+1) +"is " + weeklySales);
                dptSales += weeklySales;
            }System.out.println("TOTAL SALES PER WEEK for store  "+ (i+1) +"is " + dptSales);
            overallSales += dptSales;
        }
        System.out.println("TOTAL SALES PER WEEK THE COMPANY is " + overallSales);
    }

}
