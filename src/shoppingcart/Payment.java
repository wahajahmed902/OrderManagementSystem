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
public interface Payment {
        public void confirmPayment(String paymenttype, String address, int id, String creditcardno);

}
