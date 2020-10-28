package practice;
import java.util.Scanner;

public class Encode {

  public static void main(String[] args) {
   try(Scanner sc = new Scanner(System.in);) {
   System.out.print("Enter text to be encoded: ");
   String word = sc.nextLine();
   String encoded = encode(word);
   System.out.println(encoded);
   System.out.println(decode(encoded));
   } catch(Exception e) {
     System.out.println("There was a problem. I'll get better at reporting problems...");
   }
  }
  
  private static String encode(String str) {
    int mid = str.length()/2;
    String strA = str.substring(0, mid);
    String strB = str.substring(mid);
    //System.out.println(strA);
    String[] returned = exchange(strA, strB);
    return returned[1] + returned[0];
  }
  
  private static String[] exchange(String strA, String strB) {
    
    char[] charA = strA.toCharArray();
    char[] charB = strB.toCharArray();
    for(int i=1; i<charA.length; i+=2) {
      char tmp = charA[i];
      charA[i] = charB[i-1];
      charB[i-1] = tmp;
    }
    String[] out = {new String(charA), new String(charB)};
    return out;
  }
  
  private static String decode(String str) {
    int mid = str.length()%2 != 1? str.length()/2 : (str.length()/2)+1;
    String strB = str.substring(0, mid);
    String strA = str.substring(mid);
    //System.out.println(strA);
    String[] returned = exchange(strA, strB);
    returnq returned[0] + returned[1];
  }
}
