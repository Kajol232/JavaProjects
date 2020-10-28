/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.io.*;

/**
 *
 * @author user
 */
public class CGPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String out;
         File outputFile;
     PrintWriter output;
         out = "*******Processed Results*********\n\n ";
         out += "Rec No. \tName\tMatric Number\tWGPA\tCGPA\tGrade\n\n ";
        try {
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/cgpa", "root", "");
            String query = "SELECT * FROM student";
            Statement stmt = connect.createStatement();
            ResultSet rset = stmt.executeQuery(query);
            int count = 0;
            while (rset.next()) {
                String name = rset.getString("name");
                int ume_id = rset.getInt("matric num");
                //reading in the compulsory scores and unit into an array
                int compcourse[] = new int[10];
                int unitcomp[] = new int[10];
                for (int i = 0; i < 9; i++) {
                    int score = rset.getInt(i + 3);
                    compcourse[i] = score;
                    if (score >= 70) {
                        unitcomp[i] = 6 * 3;
                    } else if (score <= 69 && score >= 65) {
                        unitcomp[i] = 5 * 3;
                    } else if (score <= 64 && score >= 60) {
                        unitcomp[i] = 4 * 3;
                    } else if (score <= 59 && score >= 55) {
                        unitcomp[i] = 3 * 3;
                    } else if (score <= 54 && score >= 50) {
                        unitcomp[i] = 2 * 3;
                    } else if (score <= 49 && score >= 45) {
                        unitcomp[i] = 1 * 3;
                    } else {
                        unitcomp[i] = 0 * 3;
                    }
                }

                //summing up the compulsory unit collected into an array
                int cwgpa = 0;
                for (int i = 0; i < unitcomp.length; i++) {
                    cwgpa += unitcomp[i]; 

                }
                //reading up required course and unit into array
                int reqcourse[] = new int[10];
                int unitreq[] = new int[10];
                //int unit[] = new int [10]
                for (int i = 0; i < 9; i++) {
                    int score = rset.getInt(i + 11);
                    reqcourse[i] = score;
                    if (score >= 70) {
                        unitreq[i] = 6 * 3;
                    } else if (score <= 69 && score >= 65) {
                        unitreq[i] = 5 * 3;
                    } else if (score <= 64 && score >= 60) {
                        unitreq[i] = 4 * 3;
                    } else if (score <= 59 && score >= 55) {
                        unitreq[i] = 3 * 3;
                    } else if (score <= 54 && score >= 50) {
                        unitreq[i] = 2 * 3;
                    } else if (score <= 49 && score >= 45) {
                        unitreq[i] = 1 * 3;
                    } else {
                        unitreq[i] = 0 * 3;
                    }
                }//summing up required unit
                int rwgpa = 0;
                for (int i = 0; i < unitreq.length; i++) {
                    rwgpa += unitreq[i];

                }
//reading up selective courses
                int selcourse[] = new int[2];
                int unitsel[] = new int[2];
                for (int i = 0; i < 2; i++) {
                    int score = rset.getInt(i + 20);
                    selcourse[i] = score;
                    if (score >= 70) {
                        unitsel[i] = 6 * 2;
                    } else if (score <= 69 && score >= 65) {
                        unitsel[i] = 5 * 2;
                    } else if (score <= 64 && score >= 60) {
                        unitsel[i] = 4 * 2;
                    } else if (score <= 59 && score >= 55) {
                        unitsel[i] = 3 * 2;
                    } else if (score <= 54 && score >= 50) {
                        unitsel[i] = 2 * 2;
                    } else if (score <= 49 && score >= 45) {
                        unitsel[i] = 1 * 2;
                    } else {
                        unitsel[i] = 0 * 2;
                    }
                }
                //summing up selective unit
                int swgpa = 0;
                for (int i = 0; i < unitsel.length; i++) {
                    swgpa += unitsel[i];

                }
                count++;
                //cummulative gp
                String grade;
              double wgpa= rwgpa +swgpa + cwgpa;
              double cgpa= wgpa/59;
              //testing for grade
              if (cgpa >= 6.0) {
                        grade = "FIRST CLASS";
                    } else if (cgpa<=5.9 && cgpa>=4.6) {
                        grade = "SECOND CLASS UPPER";
                    } else if (cgpa <= 4.5 && cgpa >= 2.6) {
                        grade = "SECOND CLASS LOWER";
                    } else if (cgpa <= 2.5 && cgpa >= 1.6) {
                        grade = "THIRD CLASS";
                    } else if (cgpa <= 1.5 && cgpa >= 1.0) {
                        grade ="PASS";
                    } else {
                        grade = "FAIL";
                
            }
    // printing to file.
        out += String.format("%s\t\t%d\t\t%f\t\t%s\n",name,ume_id,wgpa,cgpa,grade,"\n\n");
            System.out.println("\n\n");
            outputFile = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\CGPA\\OutputFile.txt");
                
                    output = new PrintWriter(outputFile);
                    output.write(out);
                    output.close();

            }
        }catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);

        }
    }
}
