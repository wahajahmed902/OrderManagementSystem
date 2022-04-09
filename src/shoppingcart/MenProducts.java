
package shoppingcart;

import javax.swing.JOptionPane;


public class MenProducts implements Products{

    @Override
    public void addproducts(String name, int price, String image) {
        
        dbconnection db = new dbconnection();
        String sql = "insert into men (productname, price, productimage) values ('"+name+"', "+price+", '"+image+"')";
        try{
            
            int z = db.st.executeUpdate(sql);
            if(z > 0){
                JOptionPane.showMessageDialog(null, "Products Added Successfully !!");
            }else{
                JOptionPane.showMessageDialog(null, "Try Again.");
            }
        }catch(Exception e){System.out.println(e);}
    }
    
}
