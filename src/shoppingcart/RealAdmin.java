
package shoppingcart;


public class RealAdmin extends AbstractAdmin{
    
    public RealAdmin(String username, String password){
        this.username = username;
        this.password = password;
    }   

    @Override
    public String getName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;  
    }

    @Override
    public boolean isNil() {
        return false;
    }

    
}
