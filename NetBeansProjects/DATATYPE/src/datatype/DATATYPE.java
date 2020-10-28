/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;
    import java.util.*;

/**
 *
 * @author user
 */
public class DATATYPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 20;
        int count = 10000;
        int match=0;
        //generate birthday
        for(int i=0; i<count; i++){
            ArrayList<Integer> birthdayList = new ArrayList<Integer>();
            for(int j=0; j<10;j++){
                Random r = new Random(10);
                int i1 = r.nextInt(364) + 0;
                birthdayList.add(i1);
                System.out.println(il);
            }
            boolean foundDupe=false;
            for(int z: birthdayList){
                if(arrayCount(birthdayList,z)>1){
                    foundDupe=true;
                }
            }
            if(foundDupe==true){
                match = match+ 1;
            }
        }

        double prob = (double)match/(double)count;
        System.out.println(prob);
    }
    public static int arrayCount(ArrayList<Integer> birthdaycount, int item) {
        int amt = 0;
        for (int i = 0; i < birthdaycount.size(); i++) {
            if (birthdaycount.get(i) == item) {
                amt++;
            }
            else {
                amt = amt;
            }
        }
        return amt;
    }}
    
    

