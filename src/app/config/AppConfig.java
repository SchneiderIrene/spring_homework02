package app.config;

import app.shop.Cash;
import app.shop.Director;
import app.shop.customer.Customer;
import app.shop.product.Product;
import app.shop.seller.Seller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Customer customer(){
        return new Customer();
    }

    @Bean
    public Product product(){
        return new Product();
    }

    @Bean
    public Seller seller(){
        return new Seller();
    }

    @Bean
    public Cash cash(){
        return new Cash();
    }

    @Bean
    public Director director(){
        return new Director();
    }
}
