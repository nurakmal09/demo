package store;
public class Cart {
    private Product [] listOfProduct;

    public Product[] getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(Product[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public Boolean checkOut(){
        return true;
    }

    public Cart(Product[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    public Cart(){
    }
}
