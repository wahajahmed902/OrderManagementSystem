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
public class Women {
    
    int price, id;
    String name, image;
    
    public Women(int price, int id, String name, String image){
        this.price = price;
        this.id = id;
        this.name = name;
        this.image = image;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getImage(){
        return image;
    }
    
}
