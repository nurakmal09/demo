package users;
import store.Cart;
public class Customer extends SystemUser {
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
    public void setContactNo(String contact){
        this.contact = contact;
    }
    public String getContactNo(){
        return contact;
    }
    public Customer(Cart cart) {
        this.cart = cart;
    }
    public Customer(String userId, String password, String contact) {
        super(userId, password);
        this.contact = contact;
    }
    public Customer(String contact) {
        this.contact = contact;
    }
    public Customer(){
    }
}