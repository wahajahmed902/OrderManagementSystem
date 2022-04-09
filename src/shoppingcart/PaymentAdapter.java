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
public class PaymentAdapter implements Payment{
    dbconnection db;
    
    OnlinePayment onlinepayment;

   
    public PaymentAdapter(String paymentType){
         if(paymentType.equalsIgnoreCase("creditcard")){
             onlinepayment = new CreditCard();
         }
     }

    @Override
    public void confirmPayment(String paymenttype, String address, int id, String creditcardno) {
        if (paymenttype.equalsIgnoreCase("creditcard")){
            onlinepayment.creditcard(creditcardno, id);
        }
    }
}
