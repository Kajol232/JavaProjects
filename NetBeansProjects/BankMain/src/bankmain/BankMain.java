/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String accName;
        int accnum;
        double bal = 0;
        System.out.println("*****This Program Allows a customer to Perform Banking Transactions******");
        System.out.println("*******ACCOUNT OPENING KYC*********");
        System.out.println("Kindly input your full name in blocks");
        accName = input.nextLine();
        accnum = (int) Math.random() * 50;
        Accountinfo acc = new Accountinfo(accName, accnum, bal);
        System.out.println(" WELCOME " + accName + " , YOUR ACCOUNT NUMBER IS " + acc.getAccNum()
                + " AND YOUR CURRENT BAL IS " + bal);
        System.out.println("Kindly select any of the below options to perform other transaction");
        System.out.println("-- Menu --");
        System.out.println("0      QUIT");
        System.out.println("1      Get Account Details");
        System.out.println("2      Deposits");
        System.out.println("3      Withdrawal");
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("Kindly select the transaction to perform between 1-3 ; Press 0 to quit");
            int ops = input.nextInt();
            switch (ops) {
                case 1:
                    System.out.println(" WELCOME " + acc.getName() + " , YOUR ACCOUNT NUMBER IS " + acc.getAccNum()
                            + " AND YOUR CURRENT BAL IS " + acc.getBal(bal));
                    break;
                case 2:
                    System.out.println("Kindly input the amount to deposit");
                    double dep = input.nextDouble();
                    deposit depo = new deposit(accName, accnum, bal, dep);
                    bal = depo.deposits(dep);
                    System.out.println("Dear " + acc.getName() + " Your New Account Balance is " + depo.getBal(bal));
                    break;
                case 3:
                    System.out.println("Kindly input amount to withdraw");
                    double with = input.nextDouble();
                    withdrawal wid = new withdrawal(accName, accnum, bal,with);
                    bal = wid.withdraw(with);
                    System.out.println("Dear "+ acc.getName()+ " Your new Account Balance is "+ wid.getBal(bal));
                    break;
                case 0:
                    System.out.println("Goodbye, Thank you for banking with us");
                    continueInput = false;
                    break;
                default:
                    System.out.println("Option selected out of range; Please select an option between 1 - 3 ; Press 0 to quit");
                    break;
            }
        }
        System.out.println("Thank you for banking with us");
    }
}
