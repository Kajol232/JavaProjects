/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_supermarket;

/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ABC_SUPERMARKET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gross_pay;
        double disc;
        double NetPay;
        try{
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/abc_supermart", "root", "");
                        Statement stmt = connect.createStatement();
                        ResultSet rset = stmt.executeQuery("SELECT Goods_Name, Unit_price,QTY FROM goods");
                        while (rset.next()) {
                        String name = rset.getString("Goods_Name");
                        double u_price = rset.getDouble("Unit_Price");
                        int qty = rset.getInt("QTY");
                        
        Scanner in = new Scanner(System.in);
        System.out.println("0      QUIT");
        System.out.println("1      ORDER");
        System.out.println("2      UPDATE");
        System.out.println("Kindly select an option between 1-2 as shown above; Press 0 to quit");
        boolean continueinput = true;
        while (continueinput) {
            System.out.println("ENTER transaction to perform");
        int order = in.nextInt();
            switch (order) {
                case 1:
                        //Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/abc_supermart", "root", "");
                        System.out.println("Enter the name of the goods");
                        //String n = JOptionPane.showInputDialog("ENTER CODE NAME OF GOODS BOUGHT");
                        String n = in.nextLine();
                        //Statement stmt = connect.createStatement();
                        //rset = stmt.executeQuery("SELECT Unit_Price, QTY FROM goods WHERE Goods_Name= " + n);
                        //System.out.println("This is from the database " + rset);
                        //double q = Float.parseFloat(JOptionPane.showInputDialog("ENTER THE QUANTITY OF GOODS BOUGHT"));
                        System.out.println("Enter the quantity of goods");
                        int q = in.nextInt();
                        //while (rset.next()) {
                        //String name = rset.getString("Goods_Name");
                        //double u_price = rset.getDouble("Unit_Price");
                        //int qty = rset.getInt("QTY");
                        //System.out.println("\t\t" + name + "\t\t" + q + "\t\t" + u_price + "\n\n");
                        gross_pay = u_price * q;
                        if (q >= 5) {
                            disc = 0.05 * gross_pay;
                        } else {
                            disc = 0.00;
                        }
                        NetPay = gross_pay - disc;
                        qty -= q;
                        if (qty >= 5) {
                            System.out.println("You have less than 5 quantity of " + n + ",Please re-order");
                        }
                        PreparedStatement prpd = null;
                        prpd = connect.prepareStatement("UPDATE goods SET Qty=?" + " WHERE Goods_Name = ?");
                        prpd.setDouble(1, q);
                        prpd.setString(2, n);
                        prpd.executeUpdate();

                        System.out.println(name + "\t\t" + q + "\t\t" + u_price + "\t\t" + gross_pay + "\t\t" + disc + "\t\t"
                                + NetPay + "\n\n");
                        
                       break;
    

                 case 2:
                    //Connection connecte = DriverManager.getConnection("jdbc:mySql://localhost:3306/abc_supermart", "root", "");
                    String x = JOptionPane.showInputDialog("ENTER CODE NAME OF GOODS YOU WANTS TO UPDATE");
                    System.out.println("ENTER QUANTITY TO UPDATE");
                    int quantity = in.nextInt();
                    //String query = "SELECT QTY FROM goods WHERE Goods_Name= n";
                    //Statement stmt = connect.createStatement();
                    //ResultSet rset = stmt.executeQuery(query);
                    //int qty = rset.getInt("QTY");
                    PreparedStatement prpde = null;
                    prpde = connect.prepareStatement("UPDATE goods SET Qty=?" + " WHERE Goods_Name = ?");
                    prpde.setDouble(1, quantity);
                    prpde.setString(2, x);
                    prpde.executeUpdate();
                    //connecte.close();
                    break;
                
            case 0:
            System.out.println("Goodbye, Thank you for patronizing with us");
            continueinput = false;
            break;
       default:
            System.out.println("Number selected out of range; Please select an option between 1 - 2 ; Press 0 to quit");
            break; 

            }}}
}
        catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception);
                }
}
}
