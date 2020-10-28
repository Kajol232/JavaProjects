/*
 * TO COMPUTE LOAN REPAYMENT AT MONTH END
 */
package loanrepayment;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN 214888
 */
public class LoanRepayment {
    public static void main(String[] args) {
        // TODO code application logic here
       double p = 3000;
       int month = 12;
       for (int i=0; i<=month+1;i++){
       double a = (p + ((1.5/100)*p))-250;
       p=a;
       if (p>0){
           System.out.println("You still have "+ (month-i)+ "months "+"to repay "+ p);
       }else {
           System.out.println("Congrats you have no loan to repay");}
       }
    
}
}
