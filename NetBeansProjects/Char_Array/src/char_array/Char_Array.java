/*
 * TO TEST CHAR ARRAY
 */
package char_array;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
public class Char_Array {
    public static void main(String[] args) {
        String str = "ABCDEFGH";
        char[] ch = str.toCharArray();
 System.out.println("Str = "+  str +" \t ch =" + ch+ "\' " );
    System.out.println("str.length( )=" + str.length( )+"\t ch.length = " + ch.length );
    for (int i = 0; i < str.length(); i++)
    System.out.println("Str. charAt("+i +") = " + str.charAt(i)  + "\t ch [ " + i + "] =" 
            + ch[i]);
        System.out.println("\n");
        
       for (int i = 1; i <= 5; i++) {
   for (int j = 1; j < i; j++) {
      System.out.println("Hello world!");
   }
}
}
    }
    

