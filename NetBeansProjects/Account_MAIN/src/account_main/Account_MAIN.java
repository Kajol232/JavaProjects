/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account_main;

/**
 *
 * @author user
 */
public class Account_MAIN {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc = new Account("KAJOL ADEKUNLE", 500000);
        String name;
        double bal;
        name =acc.getName();
        System.out.println("CUSTOMER NAME IS "+ "\t"+ name);
        bal = acc.getBalance();
        System.out.println("CURRENT BALANCE IS "+"\t"+ bal);
        acc.deposit(5000);
        bal =acc.getBalance();
        System.out.println("DEPOSIT BALANCE IS "+ "\t"+ bal);
        acc.withdrawal(250000);
        bal = acc.getBalance();
        System.out.println("WITHRADWAL BALANCE IS "+"\t "+bal);
    }
    
}
