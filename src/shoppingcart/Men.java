
package shoppingcart;


public class Men {
    int price, id;
    String name, image;
    
    public Men(int price, int id, String name, String image){
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
