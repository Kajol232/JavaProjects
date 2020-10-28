/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingmethods;

/**
 *
 * @author user
 */
import static filehandlingmethods.Filehandlingmethods.input;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Filehandlingmethods {

    static String recNo;
    static String surname;
    static String firstName;
    static String otherName;
    static String umeId;
    static String[] personalInfo;
    static int count;
    static int score;
    static char grade;
    static Scanner input;
    static String out;
    static String info;
    static String fullInfo;
    static String admittable;
    static String fGen;
    static String bGen;
    static String admissionStatus;
    static double totalScore;
    static double meanScore;
    static File outputFile;
    static PrintWriter output;

    public static void main(String[] args) {
        readWData();

    }

    static void readWData() {
        try {//try1
            input = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\filehandlingmethods\\data\\data.dat"));
            count = 0;
            out = "*******Processed Results*********\n\n ";
            info = "*******Total Candidates*********\n\n ";
            admittable = "********Data of Student Admitable*******\n\n";
            fGen ="************Data of Students That Fails******\n\n";
            bGen = "***********Students for Batch 2***********\n\n";
            out += "Rec No. \tSurname\tFirstName\tOther Names\tUme Id\tTotal Score\t"
                    + "Mean Score\tGrade\tAdmission Status\n\n ";
            info += "THE TOTAL OF STUDENT THAT SAT FOR THE EXAM IS :\n\n ";
            admittable +="Rec No. \tfullName\tUme Id\n\n " ;
            fGen += "Rec No. \tSurname\tFirstName\tOther Names\tUme Id\n\n ";
            bGen += "Rec No. \tSurname\tFirstName\tOther Names\tUme Id\n\n ";
            while (input.hasNext()) {
                count++;
                recNo = input.next();
                surname = input.next();
                firstName = input.next();
                otherName = input.next();
                umeId = input.next();
                totalScore = 0;
                fullInfo = surname+" "+ firstName+" "+otherName;
                for (int n = 0; n < 10; n++) {
                    score = input.nextInt();
                    totalScore += score;
                }
                meanScore = totalScore / 10;
                if (meanScore >= 50) {
                    grade = 'A';
                    admissionStatus = "Congratulations,You have been admitted successfully. ";
                    admittable +=count+"\t\t"+fullInfo+"\t\t"+umeId+"\n\n " ;
                } else if (meanScore > 40 && meanScore <= 49) {
                    fGen +=count+"\t\t"+fullInfo+"\t\t"+umeId+"\n\n " ;
                    if (meanScore > 47 && meanScore <= 49) {
                        grade = 'B';
                        admissionStatus = "You are yet to be admitted, Kindly follow up on the portal for neccasary information";
                        admittable +=count+"\t\t"+fullInfo+"\t\t"+umeId+"\n\n " ;
                    } else {
                        grade = 'B';
                        admissionStatus = "No admission given, Pls rewrite next year";
                    }
                    
                } else if (meanScore > 20 && meanScore <= 40) {
                    grade = 'C';
                    admissionStatus = "No admission given, Pls rewrite next year";
                     fGen +=count+"\t\t"+fullInfo+"\t\t"+umeId+"\n\n " ;
                } else {
                    grade = 'D';
                    admissionStatus = "No admission given, Pls rewrite next year";
                     fGen +=count+"\t\t"+fullInfo+"\t\t"+umeId+"\n\n " ;
                }
                out += count + "\t\t" + surname + "\t\t" + firstName + "\t\t" + otherName + "\t\t" + umeId + "\t\t"
                        + totalScore + "\t\t" + meanScore + "\t\t" + grade + "\t\t" + admissionStatus + "\n\n";
                info += count+"\t\t"+surname+"\t\t"+firstName+"\t\t"+otherName+"\t\t"+umeId+"\n\n ";
                try {//try 2
                    outputFile = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\filehandlingmethods\\data\\OutputFile.txt");
                    
                    output = new PrintWriter(outputFile);
                    output.write(out);
                    output.write(info);
                    output.write(admittable);
                    output.write(fGen);
                    output.write(bGen);
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
//}
