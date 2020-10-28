/*
 * REVERSING ELEMENTS IN AN ARRAY
 */
package array_reversed;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import java.util.Scanner;

public class Array_Reversed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of your Array");
        int n = input.nextInt();
        int[] num = new int[n];
// COLLECTING ARRAY DATA
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data at index " + (i + 1));
            num[i] = input.nextInt();
        }
// PRINTING THE ORIGINAL ARRAY
        System.out.println("**********ORIGINAL ARRAY************");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ "\t");
        }
        System.out.println("\n");
//REVERSING THE ARRAY
      int temp;
      int i = 0, j=n-1;
      while (i!=j){
        temp = num[i];
        num[i]= num[j];
        num[j]= temp;
        i++; j--;
        if (j<1)
            break;
      }
//PRINTING REVERSED ARRAY
      System.out.println("**********REVERSED ARRAY***************");
        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k]+ "\t");
        }
        System.out.println("\n");
        System.exit(0);
    }

}
