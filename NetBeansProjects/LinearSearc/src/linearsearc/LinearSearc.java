/*
 *LINEAR SEARCH OF AN ARRAY
 */
package linearsearc;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import java.util.*;
public class LinearSearc {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        System.out.println("enter length of array");
        int l= input.nextInt();
        System.out.println("input the number to search for");
        int x=input.nextInt();
        int y[]=new int [l];
        search src = new search(x, y);
        for (int i=0;i<l;i++){
            System.out.println("enter data @ row "+ i+1);
            int a = input.nextInt();
            y[i]=a;
        }
     int location = src.linse(x,y);
     if (location ==0 ){
         System.out.println("ELEMENTS X CANNOT BE FOUND IN ARRAY");
     }
     else{
         System.out.println("THE LOCATION OF X IS "+ " \t " + location);
     }
     
        
    
}
}
