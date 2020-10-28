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
public class Accountinfo {
    String accName;
    int accNum;
    double bal;
    public Accountinfo(String Name, int AccountNumber, double balance){
    accName = Name;
    accNum = AccountNumber;
    bal = balance;
    }
    
    public String getName(){
    return accName;
    }
    public int getAccNum(){
    return accNum;
    }
   public double getBal(double bal){
   return bal;
   }
}
