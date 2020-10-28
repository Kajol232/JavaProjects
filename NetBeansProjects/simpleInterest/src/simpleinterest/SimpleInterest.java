/*To calculate the Simple interest of a loan
 */
package simpleinterest;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN OLUWATOSIN 214888
 */
import javax.swing.*;
public class SimpleInterest {
    public static void main(String[] args) {
        // Collects in Rate,Year and Principal;
        double t = Double.parseDouble(JOptionPane.showInputDialog("Input the range of years"));
        double p = Double.parseDouble(JOptionPane.showInputDialog("Input the principal amount"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Input the rate of the loan"));
        //converting rate to pecentage
        r= r/100;
        //Comoputing the Interest
        double i = (p*r*t)/100;
        //Printing out the Interest
        JOptionPane.showMessageDialog(null,"The Interest Acquired is "+ i);
    }
    
    
}
