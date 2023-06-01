package net.elmrabti.billingservice;

import net.elmrabti.billingservice.entities.Bill;
import net.elmrabti.billingservice.entities.ProductItem;
import net.elmrabti.billingservice.repository.BillRepository;
import net.elmrabti.billingservice.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication implements CommandLineRunner {

    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository ;

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Bill bill = billRepository.save(new Bill(null, new Date(), null ,1L, null)) ;


        productItemRepository.save(new ProductItem(null,1L,8000.0,3.0, bill, null)) ;
//        productItemRepository.save(new ProductItem(null,1L,8000.0,3.0, null, null)) ;
//        productItemRepository.save(new ProductItem(null,2L,2000.0,3.0, bill, null)) ;
//        productItemRepository.save(new ProductItem(null,2L,2000.0,3.0, null, null)) ;
//        productItemRepository.save(new ProductItem(null,3L,600.0,3.0, bill, null)) ;
//        productItemRepository.save(new ProductItem(null,3L,600.0,3.0, null, null)) ;

//        List<ProductItem> liste = new ArrayList<>() ;
//        liste.add(productItemRepository.findById(1l).get()) ;
//        liste.add(productItemRepository.findById(3l).get()) ;
//        liste.add(productItemRepository.findById(5l).get()) ;





    }
}
