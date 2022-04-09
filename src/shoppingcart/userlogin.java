
package shoppingcart;

import java.sql.ResultSet;
import java.util.Scanner;


public class userlogin {
    
    private static userlogin ul = new userlogin();
    
    private userlogin(){}
    
    public static userlogin getInstance(){
        return ul;
    }
    Scanner in = new Scanner(System.in);
    dbconnection db,db1;
    AdminPanel ap = new AdminPanel();
    HomePage hp;
    loginpage lp;


    int id=0;

    public boolean signIn(String uname, String pass){
        db = new dbconnection();
        String sql = "select * from users";
        try{
            ResultSet rs = db.st.executeQuery(sql);
            while(rs.next()){
                if(uname.equalsIgnoreCase(rs.getString("username")) && pass.equalsIgnoreCase(rs.getString("password"))){
                    id = rs.getInt("userid");
                    hp = new HomePage(id, uname);
                    hp.setVisible(true);
                    return true;
                }
            }
        }catch(Exception e){System.out.println(e);}
        return false;
    }
    
   
    
    public void registration(String uname, String pass, String email, String contact){
       db = new dbconnection();
       lp = new loginpage();
       String sql = "insert into users(username, password, email, contact ) values('"+uname+"','"+pass+"','"+email+"', '"+contact+"')";
       try{
       db.st.executeUpdate(sql);
//       l.setPanel(false, true, false);
       }catch(Exception e){System.out.println(e);}
    }
    
}
