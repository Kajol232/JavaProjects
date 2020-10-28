/*
 *TO COMPUTE MEAN VALUES OF EXPERIMENT IN THE LABORATORY
 */
package experiment.mean;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN O. 214888
 */
import javax.swing.*;
public class ExperimentMean {
    public static void main(String[] args) {
        // TODO code application logic here
        double sum = 0;
        double mean=0;
        for (int i =0; i<20; i++){
          for (int j= 0; j<4; j++){
          double val = Double.parseDouble(JOptionPane.showInputDialog("Enter values at "+ (j+1)));
          sum += val;
          }mean +=sum/4;
            System.out.println(sum);
          System.out.println(mean);
        }
    }
    
}
