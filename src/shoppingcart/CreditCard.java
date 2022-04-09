/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Computers-way
 */
public class CreditCard implements OnlinePayment{
     dbconnection db;

    @Override
    public void creditcard(String creditcardno, int id) {
        String sql = "update users set creditcard = '" + creditcardno + "' where userID = "+id;
        db = new dbconnection();
        try{
            db.st.executeUpdate(sql);
        }catch(Exception e){System.out.println(e);}
    }
}
