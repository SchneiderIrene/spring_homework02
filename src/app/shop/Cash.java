package app.shop;

import app.shop.customer.Customer;
import app.shop.product.Product;
import app.shop.seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;

public class Cash {

@Autowired
private Product product;
    @Autowired
    private Seller seller;
    @Autowired
    private Customer customer;


    public void setProduct(Product product) {
        this.product = product;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void cashMany (){
        product.shopping();
        customer.shopping();
        seller.shopping();
        System.out.println("Деньги в кассе");
    }
}
