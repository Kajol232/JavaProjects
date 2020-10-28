/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.util.*;

/**
 *
 * @author user
 */
public class Database {
    
    public static Random randomGenerator = new Random();
    public static int count = 1000;
    public static int  size = 20;
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO -- add your code here

        List<Integer> birthdayLists = new ArrayList<Integer>();
        boolean test;
        int totalSameBirthdayPair = 0;

        for (int i = 0; i < count; i++) {
            birthdayLists = birthdayGenerator(size, i);

            test = singleSimulation((ArrayList<Integer>) birthdayLists, size);
                if (test)
                    totalSameBirthdayPair++;
        }

        double p =((double)totalSameBirthdayPair / (double) count) * 100.0;
        System.out.println(p);

    }

    // TODO - add your code here

    private static boolean singleSimulation(ArrayList<Integer> birthdayLists, int size) {

        for (int i = 0; i < size; i++) {

            int tempdate = birthdayLists.get(i);

            for (int j = i+1; j < birthdayLists.size(); j++) {
                if (tempdate == birthdayLists.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static ArrayList<Integer> birthdayGenerator(int size, int seed){

        Random birthdayGenerator = new Random();
        int birthday;
        List<Integer> birthdayLists = new ArrayList<Integer>();

        for(int i =0; i < size; i++){

            birthday = birthdayGenerator.nextInt(364) + seed;
            birthdayLists.add(birthday);
        }

        return (ArrayList<Integer>) birthdayLists;
    }
}
    
 

    
    

