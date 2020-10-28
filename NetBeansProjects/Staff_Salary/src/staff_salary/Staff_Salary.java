/*
 * A PROGRAM COMPUTING NET PAY FOR STAFF.
 */
package staff_salary;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN 214888
 */
import javax.swing.*;
public class Staff_Salary {
    public static void main(String[] args) {
        // TODO code application logic here
   int n = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Staff on Payroll"));
   for (int i =0; i<n;i++){
   int salary = Integer.parseInt(JOptionPane.showInputDialog("Enter Basic Salary of Staff"));
   double ta = (10/100)*salary;
   double ha = (15.5/100)*salary;
   int m = 500;
   int y = Integer.parseInt(JOptionPane.showInputDialog("Enter Numbers of year of Staff with the organisation"));
   double lsa;
   if (y>10){
   lsa = (2/100)*salary;
   }
   else{
       lsa = 0;}
   double netpay = salary + ta + ha + m+ lsa;
       JOptionPane.showMessageDialog(null,"Staff salary is "+ salary + "with netpay of "+ netpay, "Netpay",JOptionPane.INFORMATION_MESSAGE);
   }
    }
    
}
