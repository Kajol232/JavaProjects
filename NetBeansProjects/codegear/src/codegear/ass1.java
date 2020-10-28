/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegear;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ass1 {
    public static void main(String[] args) {
        // Requesting for Length and Breadth of the rectangle 
        int l = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of the Rectangle"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Breadth of the Rectangle"));
        //Computing Area and Perimeter of the Rectangle
        double areaOfRectangle = l*b;
        double perimeterOfRectangle = 2*(l+b);
        //Requesting for Radius of the circle
        double r = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius of the Circle"));
        //Computing Area and Perimeter of the Circle
        double areaOfCircle = Math.PI*r*r;
        double perimeterOfCircle = 2*Math.PI*r;
        //Requesting for sides of the Square
        int s = Integer.parseInt(JOptionPane.showInputDialog("Enter the sides of the Square"));
        //Computing Perimeter of the Square
        double perimeterOfSqr = 4*s;
        //printing out the area and perimeter
        JOptionPane.showMessageDialog(null,"N\t\t\t\t|AREA\t\t\t\t|PERIMETER\n\n" );
        //JOptionPane.showMessageDialog(null,"The Area is " + areaOfRectangle +"\nThe Perimeter is "+ perimeterOfRectangle+"Output",JOptionPane.PLAIN_MESSAGE);       
    }
    
}

