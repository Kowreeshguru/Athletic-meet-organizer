/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtform;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author chandrag
 */
public class test {
    static Connection con=null;
   static Statement ps1=null;
        public static void ConnectDB(String tme,String col,int x){
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kowreesh","kowree3801");
          String sql1 = "update relay set relay1="+x+",timing1='"+tme+"' where name='"+col+"'";
          ps1= con.createStatement();
          ps1.executeUpdate(sql1);
          System.out.println(sql1);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);         
        }      
        finally {
                try
                {
                    if(con!=null)
                        con.close();
                    if(ps1!=null)
                        ps1.close();
                }catch (Exception ex){}
        }
        }
        
        public  static void Connectted(String tme,String col,int x){
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kowreesh","kowree3801");
          String sql1 = "update relay set relay2="+x+",timing2='"+tme+"' where name='"+col+"'";
          ps1= con.createStatement();
          ps1.executeUpdate(sql1);
          System.out.println(sql1);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);         
        }      
        finally {
                try
                {
                    if(con!=null)
                        con.close();
                    if(ps1!=null)
                        ps1.close();
                }catch (SQLException ex){}
        }
        }
}
