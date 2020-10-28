/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;
public class StudentReg {

    int MatricNum, Level;
    String Password, Name, Dpt, course[];
    Connection con;
Scanner input = new Scanner(System.in);
    public StudentReg(int MatricNum) {
        this.MatricNum = MatricNum;
    }

    public Connection getCon() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/studentrecordmanagement", "root", "");
        } catch (Exception exception) {
            System.out.println("Unable to Create Connection");
        }
        return con;
    }

    public int getLevel(int MatricNum) {
       try{
        con = getCon();
        String query = "SELECT LEVEL FROM biodata where Matric_Num = 214888";
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery(query);
            Level = rset.getInt ("LEVEL");
       }
       catch (Exception exception) {
            System.out.println("Unable to get Level");

        }
        return Level;
    }

    public String getName(int MatricNum) {
        try{
        con = getCon();
        String query = "SELECT NAME FROM biodata where Matric_Num = MatricNum";
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery(query);
            Level = rset.getInt ("NAME");
       }
       catch (Exception exception) {
            System.out.println("Unable to get Name");

        }
        return Name;
    }

    public String getDpt(int MatricNum) {
        try{
        con = getCon();
        String query = "SELECT DEPARTMENT FROM biodata where Matric_Num = MatricNum";
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery(query);
            while (rset.next()){
            Dpt = rset.getString ("DEPARTMENT");}
       }
       catch (Exception exception) {
            System.out.println("Unable to get DEPARTMENT");

        }
        return Dpt;
    }

    public String getPassword() {
        System.out.println(
                "1. A password must have at least eight characters.\\n\" +\n"
                + "2. A password consists of only letters and digits.\\n\" +\n"
                + "3. A password must contain at least two digits \\n\" +\n"
                + "Input a password (You are agreeing to the above Terms and Conditions.): \");");
        Password = input.nextLine();
        int charCount = 0;
        int numCount = 0;
        int specialXter = 0;
        if (Password.length() < 10) {
            System.out.println("According to the terms of agreement, password length can not be less than 10");
        } else {
            for (int i = 0; i < Password.length(); i++) {

                if (Password.charAt(i) >= 'A' && Password.charAt(i) <= 'Z' || (Password.charAt(i) >= 'a' && Password.charAt(i) <= 'z')) {
                    charCount++;
                } else if (Password.charAt(i) >= '0' && Password.charAt(i) <= '9') {
                    numCount++;
                } else {
                    specialXter++;
                    System.out.println("inavlid");
                    System.out.println("According to T & C, other characters are not allowed");
                    System.out.println("Only numbers and digits are allowed");
                    break;
                }
            }
            if (numCount >= 2 && charCount >= 8) {
                if (specialXter >= 1) {
                    System.out.println("Password Invalid, special character not allowed");
                    System.out.println("Only numbers and digits are allowed");
                } else {

                    System.out.println("Password Valid");
                }
            } else {
                System.out.println("Password Invalid");
                System.out.println("According to T & C, password must have at least eight characters and at least 2 digits");
            }
        }
        return Password;
    }
    public String[] getCourse(int MatricNum,String Password) {
        System.out.println(" Kindly enter the number of course you wanted to register for ");
        int num = input.nextInt();
        for (int i =0; i<num;i++){
            System.out.println("Kinldy enter course code");
            course[i] = input.next();
        }
        return course;
    }

}
