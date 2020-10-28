/*
 *
 */
package abc_supermarket;

/**
 *
 * @MUHAMMAD AMOTULRAHAMAN OLUWATOSIN 214888
 */
import java.io.*;
import java.time.LocalDate;
import java.sql.*;

public class orderSupermarket {

    private int milo, milk, sugar, lipton, bournvita;
    private ResultSet rset;
    private String invoice, name, report;
    private double discount, tdiscount, pay, grosspay;
    private static Connection connect;
    private int [] ordqty;

    public orderSupermarket(int mk, int ml, int s, int l, int b) {
        milo = ml;
        milk = mk;
        sugar = s;
        lipton = l;
        bournvita = b;
    }
    
    public static Connection getConnection(){
        try{
            Connection connect = DriverManager.getConnection("jdbc:mySql://localhost:3306/abc_supermart", "root", "");
                        Statement stmt = connect.createStatement();
        
return null;
}

}
