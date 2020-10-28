/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialgen2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SEQUENTIALGEN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the Nth term to generate the sequence");
  int nthTerm = input.nextInt();
  int firstTerm =1;
  int term = 1;
  int count = 1;
  do {
  term = firstTerm * term;
  firstTerm = firstTerm + 2;
      System.out.println(term);
      count++;
  }
  while (count < nthTerm);
}
    }
    

