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
public class deposit extends Accountinfo {
    double dep;
    public deposit(String accName,int accNum, double bal,double deposits){
    super (accName, accNum, bal);
    dep =deposits;
    }
   public double deposits(double dep){
       double newbal = bal+dep;
     return newbal;  
   }
    @Override
   public double getBal(double newbal){
   super.getBal(newbal);
   return newbal;
   }
}
