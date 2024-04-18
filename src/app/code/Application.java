package app.code;

import app.shop.Cash;
import app.shop.Director;
import app.shop.customer.Customer;
import app.shop.product.Product;
import app.shop.seller.Seller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

//        Product product = new Product();
//        Customer customer = new Customer();
//        Seller seller = new Seller();
//        Cash cash = new Cash();
//        cash.setCustomer(customer);
//        cash.setProduct(product);
//        cash.setSeller(seller);
//        Director director = new Director();
//        director.setCash(cash);
//
//        director.directorCash();
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.directorCash();
    }
}
