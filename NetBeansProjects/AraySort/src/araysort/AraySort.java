/*
 * TO SORT AN ARRAY
 */
package araysort;

/**
 *
 * @MUHAMMAD AMOTULRAHAMN O.21488
 */
import java.util.*;
public class AraySort {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of array to sort ");
       int r = input.nextInt();
       int num[]= new int [r];
// collecting data 
int sumEven = 0;
   for (int i=0; i<r; i++){
          System.out.println("ENTER DATA AT ROW "+ (i+1));
          int a = input.nextInt();
          num[i]= a;
        if (i%2==0)
        
        sumEven+=num[i];
      }
   
        System.out.println("Sum of Even indexes is "+ sumEven);
// PRINTING ARRAY 
     for (int j=0;j<r; j++){
           System.out.print(num[j]+ "\t");
       }
         System.out.println("\n");
     
// Sorting an Array
  Arrays.sort(num);
        System.out.println("Enter num to search");
        int x =input.nextInt();
      if (Arrays.binarySearch(num,x)==1){
          System.out.println("data found");
      }else{System.out.println("data not found"); 
      }
   System.out.println("Sorted array data ..\n");
 for (int i = 0; i < num.length; i++){ 
  System.out.print("\t" + num[i]);
 }
    }
    
}
