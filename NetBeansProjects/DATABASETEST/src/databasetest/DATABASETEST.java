/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DATABASETEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/school_ume", "root", "");
            String query = "SELECT * FROM biodata";
            Statement stmt = connect.createStatement();
            ResultSet rset = stmt.executeQuery(query);
            int count = 0;
            while (rset.next()) {
                String name = rset.getString("Name");
                String sex = rset.getString("SEX");
                String ume_id = rset.getString("UME_ID");
                System.out.println(count + "\t\t" + name + "\t\t" + sex + "\t\t" + ume_id + "\n\n");
                count++;
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);

        }
    }

}
