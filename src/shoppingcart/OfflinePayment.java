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
public class OfflinePayment implements Payment{
    PaymentAdapter adapter;
    dbconnection db;

    @Override
    public void confirmPayment(String paymenttype, String address, int id, String creditcardno) {
        if(paymenttype.equalsIgnoreCase("cash")){
            db = new dbconnection();
            String sql = "update users set address = '" + address + "' where userID = "+id;
            try{
                db.st.executeUpdate(sql);
            }catch(Exception e){System.out.println(e);}
        }
        else if(paymenttype.equalsIgnoreCase("creditcard")){
            adapter = new PaymentAdapter(paymenttype);
            adapter.confirmPayment(paymenttype, address, id, creditcardno);
        }
    }
}
