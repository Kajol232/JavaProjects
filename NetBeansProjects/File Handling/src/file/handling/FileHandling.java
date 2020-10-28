/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.handling;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {//try1
            Scanner input = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\File Handling\\data.dat"));
            int count = 0;
            String out = "Processed Results\n\n ";
            out += "Rec No. \tSurname\tFirstName\tOther Names\tUme Id\tTotal Score\t"
                    + "Mean Score\tGrade\tAdmission Status\n\n ";
            while (input.hasNext()) {
                count++;
                String surname = input.next();
                String firstName = input.next();
                String otherName = input.next();
                String umeId = input.next();
                char grade;
                String admissionStatus;
                double totalScore = 0;
                for (int n = 0; n < 10; n++) {
                    int score = input.nextInt();
                    totalScore += score;
                }
                double meanScore = totalScore / 10;
                if (meanScore >= 50) {
                    grade = 'A';
                    admissionStatus = "Congratulations,You have been admitted successfully. ";
                } else if (meanScore > 40 && meanScore <= 49) {
                    if (meanScore > 47 && meanScore <= 49) {
                        grade = 'B';
                        admissionStatus = "You are yet to be admitted, Kindly follow up on the portal for neccasary information";
                    } else {
                        grade = 'B';
                        admissionStatus = "No admission given, Pls rewrite next year";
                    }
                } else if (meanScore > 20 && meanScore <= 40) {
                    grade = 'C';
                    admissionStatus = "No admission given, Pls rewrite next year";
                } else {
                    grade = 'D';
                    admissionStatus = "No admission given, Pls rewrite next year";
                }
                out += count + "\t\t" + surname + "\t\t" + firstName + "\t\t" + otherName + "\t\t" + umeId + "\t\t"
                        + totalScore + "\t\t" + meanScore + "\t\t" + grade + "\t\t" + admissionStatus + "\n\n";
                
                try {//try 2
                    File outputFile = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\File Handling\\OutputFile.txt");
                    PrintWriter output = new PrintWriter(outputFile);
                    output.write(out);
                    output.close();

                } catch (Exception exception) {//catch 2
                    JOptionPane.showMessageDialog(null, "Cannot write to file!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception exception) {//catch 1
            JOptionPane.showMessageDialog(null, "Cannot read from file!!!", "Error", JOptionPane.ERROR_MESSAGE);   
        }
        
        JOptionPane.showMessageDialog(null, "Data saved sucessfully", "Writing Complete", JOptionPane.INFORMATION_MESSAGE);
    }

}
