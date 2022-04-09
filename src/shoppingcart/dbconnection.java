
package shoppingcart;

import java.sql.*;

public class dbconnection {
    Connection con;
    Statement st;
    
    public dbconnection(){
        try{
        String url = "jdbc:sqlserver://localhost\\DESKTOP-8FQ55NB:1433;databaseName=shoppingcart;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url);
        st = con.createStatement();
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
