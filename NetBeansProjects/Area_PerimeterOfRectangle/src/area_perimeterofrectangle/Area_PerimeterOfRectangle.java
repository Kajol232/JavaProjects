/*
 * TO CALCULATE THE AREA AND PERIMETER OF A RECTANGLE
 */
package area_perimeterofrectangle;

/**
 *
 * @MUHAMMAD AMOTULRAHMAN OLUWATOSIN 214888
 */
import javax.swing.*;
public class Area_PerimeterOfRectangle {
    public static void main(String[] args) {
        // Requesting for Length and Breadth of the rectangle 
        int l = Integer.parseInt(JOptionPane.showInputDialog("Enter Length of the Rectangle"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Breadth of the Rectangle"));
        //Computing Area and Perimeter of the Rectangle
        double area = l*b;
        double perimeter = 2*(l+b);
        //printing out the area and perimeter
        JOptionPane.showMessageDialog(null,"The Area is " + area +"\nThe Perimete is "+ perimeter,"Output",JOptionPane.PLAIN_MESSAGE);        
    }
    
}
