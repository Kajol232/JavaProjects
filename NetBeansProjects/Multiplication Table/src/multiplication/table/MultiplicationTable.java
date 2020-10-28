/*
 * A PROGRAM TO COMPUTES MULTIPLICATION TABLE.
 */
package multiplication.table;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN OLUWATOSIN 214888
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        // MULTIPLICATION TABLE 12
        for (int i =1; i<=12; i++){
          for (int j=1; j<=12; j++){
          int times = i*j;
          
              System.out.print("|"+ times + "\t");
          }
          System.out.println("******************************************************************");  
        }
        int[ ][ ] arrayOfInts = { { 32, 87, 3, 589 },
				            { 12, 1076, 2000, 8 },
				            { 622, 127, 77, 955 }
	                                              };

    }
    
}
