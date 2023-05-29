package net.elmrabti.inventoryservice;

import net.elmrabti.inventoryservice.entities.Product;
import net.elmrabti.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository ;

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Computer", 8000));
        productRepository.save(new Product(null, "Printer", 2000)) ;
        productRepository.save(new Product(null, "Keyboard", 600));
     }
}
