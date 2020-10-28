/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square.computation;

/**
 *
 * @author user
 */
public class SQUARECOMPUTATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxcount = 10;
			System.out.println("number\t" + "square\t" + "cubes\t");
	for  (int num=0; num<=maxcount;num++){
		int square = num*num;
		int cubes = square*num;
		System.out.println(num + "\t\t" + square + "\t\t" + cubes + "\t\t");
	}
    }
    
}
