/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class Discount {
    public static void main (String [] args){
    class MyDisc{
      private double p,q;
        public MyDisc (double a, double b){
        p = a;
        q = b;
        }
        public double GrossPay(){
           double GrossPay = p*q;
           return GrossPay;
    }
       public double disc(){
           double disc;
       if (q > 20)
         disc = 0.1 * GrossPay();
       else if (q >= 10)
         disc =  0.07 * GrossPay();
       else if (q >= 5)
           disc = 0.05 * GrossPay();
       else if (q >= 1)
           disc = 0.02 * GrossPay();
       else
           disc = 0.00;
       return disc;
    }
       public double NetPay(){
           double NetPay = GrossPay() -  disc();
         return NetPay;
       }
    }
    double p = Float.parseFloat(JOptionPane.showInputDialog ("ENTER THE UNIT PRICE OF GOODS BOUGHT"));
    double q = Float.parseFloat(JOptionPane.showInputDialog("ENTER THE QUANTITY OF GOODS BOUGHT"));
    
    MyDisc mydisc = new MyDisc(p,q);
        String out = "*******TRANSACTION DETAIL********\n";
        out += "YOU BOUGHT " + q + "QUANTITY OF GOODS WITH " + p + "UNIT PRICES\n";
        out += "GROSS PAY = " + mydisc.GrossPay() +"\n";
        out += "DISCOUNTED AMOUNT = " + mydisc.disc()+ "\n";
        out += "NET PAY = " + mydisc.NetPay()+ "\n";
        JOptionPane.showMessageDialog(null,out, "KAJOL SUPERMARKET AND STORES",JOptionPane.INFORMATION_MESSAGE);
    }
}
