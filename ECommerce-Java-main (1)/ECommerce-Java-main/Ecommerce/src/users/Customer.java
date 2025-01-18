package users;
import store.Cart;
public class Customer extends User {
    private Cart cart;
    private String contact;
    @Override
    public Boolean verifyUser(){
        return true;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
   
    public Customer(Cart cart) {
        this.cart = cart;
    }
    public Customer(String userId, String password, String loginStatus, String contact) {
        super(userId, password, loginStatus);
        this.contact = contact;
    }

    public Customer(){
    }
}
