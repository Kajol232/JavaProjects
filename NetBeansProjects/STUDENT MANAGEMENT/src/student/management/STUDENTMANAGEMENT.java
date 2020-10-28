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
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class STUDENTMANAGEMENT {

    public static void main(String[] args) {
        String Name, Sex, Faculty, Department;
        int Matric_Num, Level, DateOfBirth;
        Scanner input = new Scanner(System.in);
        System.out.println("*****This is a Student Record Management Program******");
        System.out.println("*******Main Page*********");
        System.out.println("0      QUIT");
        System.out.println("1      STUDENT PAGE");
        System.out.println("2      ADMIN PAGE");
        System.out.println("3      CONTACT US");
        System.out.println("4      ABOUT US");
        boolean continueInput = true;

        System.out.println("KINDLY SELECT ANY OPTION BETWEEN 1-4 LISTED ABOVE; SELECT 0 T0 QUIT ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("1      REGISTER");
                System.out.println("2      GENERATE TRANSCRIPT");
                System.out.println("0      MAIN PAGE");
                boolean continueStudent = true;
                System.out.println("KINDLY SELECT ANY OPTION ABOVE; SELECT 0 TO GO BACK TO MAIN PAGE");
                int ops = input.nextInt();
                switch (ops) {
                    case 1:
                        System.out.println("KINDLY INPUT YOUR MATRIC NUMBER");
                        Matric_Num = input.nextInt();
                        StudentReg reg = new StudentReg(Matric_Num);
                        String password = reg.getPassword();
                        Level = reg.getLevel(Matric_Num);
                        Department = reg.getDpt(Matric_Num);
                        Name = reg.getName(Matric_Num);
                        String course[] = reg.getCourse(Matric_Num, password);
                        System.out.println(
                                "Name: " + Name + " \n"
                                + "Matric Number: " + Matric_Num + "\n" +
                        "Department: " + Department + " \n"+
                                        "Level: "+ Level + "\n"+
                                        "*****Course registered***** ");
                        for (int i=0; i< course.length;i++ ){
                            System.out.println(course[i]);}

                }
        }

    }

}
