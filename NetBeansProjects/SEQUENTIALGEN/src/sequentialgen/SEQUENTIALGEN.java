/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialgen;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SEQUENTIALGEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    System.out.println("********This Program calculates an Nth Term for an Arithmetic Progression Sequence********");
    System.out.println("Enter the Nth term to generate the sequence");
  int nthTerm = input.nextInt();
  int firstTerm = 1;
  int term = 1;
  for (int i = 1; i <= nthTerm; i++){
  firstTerm = firstTerm * term;
  term = term + 2;
      System.out.println(firstTerm);
  }
    }
    
}
