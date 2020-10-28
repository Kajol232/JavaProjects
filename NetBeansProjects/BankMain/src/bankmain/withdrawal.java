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
public class withdrawal extends Accountinfo {
    double withdrawal;
    
    public withdrawal(String accName, int accNum, double bal, double withdraw){
    super (accName, accNum, bal);
    withdrawal = withdraw;   
    }
    
    public double withdraw(double withdraw){
        double newbal = bal - withdraw;
    return newbal;
    }
      @Override
   public double getBal(double newbal){
   super.getBal(newbal);
   return newbal;
   }
}
