/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import DBconnection.DBconnect;
import Functions.RandomNum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author DEEPAK RANE
 */
public class Repetition {
    Connection  c;
    
    PreparedStatement p;
    
    ResultSet r ;
    public int Repetition(){
        int num,a = 0;
        RandomNum d = new RandomNum();
        try{
         do{
          a = d.RandomNum();
          c = DBconnect.ConnectionDB();
          String sql = "SELECT LOGIN FROM BANK WHERE LOGIN = ?";
          p = c.prepareStatement(sql);
            p.setInt(1, a);
            r = p.executeQuery();
         }while(r.next());
        }
        catch(Exception e){
          System.out.println(e);
        }
        num = a;
        return num;
    }
}
