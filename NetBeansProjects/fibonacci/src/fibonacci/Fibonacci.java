/*
 * To COMPUTES AND GENERATES FIBONACCI SEQUENCES
 */
package fibonacci;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O.214888
 */
import javax.swing.*;
public class Fibonacci {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("ENTER TERMINATING POINT"));
        fibo(n);
    }
    static void fibo(int a){
    int fibo[]= new int[a];
    for(int i=2;i<a;i++){
    fibo[0]=0;
    fibo[1]=1;
    fibo[i]=fibo[i-1]+fibo[i-2];
    }
    for (int i=0; i<fibo.length;i++){
        System.out.println("Fibo["+ i +"] "+" = " +fibo[i]);
    }
    }
    
}
