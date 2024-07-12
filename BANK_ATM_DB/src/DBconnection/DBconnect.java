/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconnection;

import static java.awt.PageAttributes.MediaType.C;
import java.sql.*;

/**
 *
 * @author DEEPAK RANE
 */
public class DBconnect {
    public static Connection ConnectionDB(){
        try{
            String url="jdbc:sqlite:C:\\Users\\HP\\OneDrive\\Desktop\\BANK_ATM_DB\\Databases\\Database.db";
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(url);
            System.out.println("Connection succeeded");
            return con;
        }
        catch(Exception e){
            System.out.println("Connection failed \n"+e);
            return null;
        }
    }
}
