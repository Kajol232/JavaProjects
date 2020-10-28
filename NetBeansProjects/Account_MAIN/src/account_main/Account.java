/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account_main;
import java.io.*;
/**
 *
 * @author user
 */
 class Account implements Serializable {
     String cust_Name;
     double bal;
     
   public Account(String name, double balance){
        cust_Name = name;
        bal = balance;
   }
   public void deposit(int dep){
   bal+=dep;
   }
   public void withdrawal(int withdraw){
   bal-=withdraw;
   }
   public String getName(){
   return cust_Name;
   }
   public double getBalance(){
   return bal;
   }
    
}
