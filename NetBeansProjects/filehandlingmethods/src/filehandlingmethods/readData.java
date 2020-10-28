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
import java.io.*;
import java.util.*;
import javax.swing.*;

public class readData {
    String surname;
    String firstName;
    String otherName;
    String umeId;
    String [][]personalInfo; 
                //char grade;
                //String admissionStatus
    public readData(String surname, String firstName,String otherName,String umeId){
    try {//try1
            Scanner input = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\filehandlingmethods\\data\\data.dat"));
            int count = 0;
            while (input.hasNext()) {
                count++;
                 surname = input.next();
                 firstName = input.next();
                 otherName = input.next();
                 umeId = input.next();
                //char grade;
                //String admissionStatus;
                //double totalScore = 0;
                //for (int n = 0; n < 10; n++) {
    }
    }
   catch (Exception exception) {//catch 1
            JOptionPane.showMessageDialog(null, "Cannot read from file!!!", "Error", JOptionPane.ERROR_MESSAGE);   
        }
    
}
}
