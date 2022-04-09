
package shoppingcart;


public class ProductFactory {
    
    public Products getProducts(String section){
        if(section == null){
            return null;
        }else if(section.equalsIgnoreCase("men")){
            return new MenProducts();
        }else if(section.equalsIgnoreCase("women")){
            return new WomenProducts();
        }else if(section.equalsIgnoreCase("kids")){
            return new KidsProducts();
        }else if(section.equalsIgnoreCase("jewellery")){
            return new JewelleryProducts();
        }
        return null;
    }
}
