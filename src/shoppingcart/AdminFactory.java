
package shoppingcart;

import java.sql.ResultSet;


public class AdminFactory {
        static dbconnection db;
    public static AbstractAdmin getAdmin(String username, String password){
        db = new dbconnection();
        String sql = "select * from admins";
        try{
        ResultSet rs = db.st.executeQuery(sql);
        while(rs.next()){
            if(rs.getString("name").equalsIgnoreCase(username) && rs.getString("password").equalsIgnoreCase(password)){
                return new RealAdmin(username, password);
            }
        }
        }catch(Exception e){System.out.println(e);}
        return new NullAdmin();
    }
}
