
package shoppingcart;


public class NullAdmin extends AbstractAdmin{
    
     @Override
    public String getName() {
        return "Invalid username";
    }

    @Override
    public String getPassword() {
        return "Invalid password";
    }

    @Override
    public boolean isNil() {
        return true;
    }
    
}
