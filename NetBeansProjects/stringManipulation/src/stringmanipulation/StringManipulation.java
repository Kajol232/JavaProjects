/*
 * TO PERFORM STRING OPERATION ON WORDS
 */
package stringmanipulation;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN OLUWATOSIN 214888
 */
import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE WORD TO MANIPULATE");
        String word = input.nextLine();
        String search = "the";
        if (word.indexOf(search) != -1) {
            System.out.println("FOUND IT");
        } else {
            System.out.println("NOT FOUND");
        }

        StringTokenizer tokens = new StringTokenizer(word);
        String[] words = new String[tokens.countTokens()];
        while (tokens.hasMoreTokens()) {     // Print the tokens
            System.out.println(tokens.nextToken());
        } // end while

        char arrayWord[] = word.toCharArray();
        for (int i = 0; i < arrayWord.length; i++) {
            System.out.println(arrayWord[i]);
        }

        String A[] = {"A", "B", "C", "D"};
        String B[] = {"1", "2", "3", "4"};
        String C[] = new String[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        int b = 0;
        for (int i = A.length; i < C.length; i++) {
            C[i] = B[b];
            b++;
        }
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
        }
        System.out.println("\n\n");
    }

}
