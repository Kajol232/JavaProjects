package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Kindly enter the length ");
        double l = in.nextDouble();

        System.out.println("Kindly enter the base ");
        double b = in.nextDouble();

        System.out.println("Kindly enter the height ");
        double h = in.nextDouble();

        System.out.println("Kindly enter color ");
        String c = in.next();

        System.out.println("Kindly enter filled status");
        boolean s = in.nextBoolean();

        GeometricObject triangle = new Triangle(l,b,h);
        triangle.setColor(c);
        triangle.setFilled(s);

        System.out.println(triangle.toString());


    }
}
