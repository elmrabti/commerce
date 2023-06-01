package net.elmrabti.billingservice.controller;

import net.elmrabti.billingservice.entities.Bill;
import net.elmrabti.billingservice.model.Customer;
import net.elmrabti.billingservice.repository.BillRepository;
import net.elmrabti.billingservice.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRestController {
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private CustomerServiceClient customerServiceClient ;

    @Autowired
    private ProductServiceClient productServiceClient ;

    @GetMapping("/bills/full/{id}")
    Bill getBill(@PathVariable Long id){
        Bill bill = billRepository.findById(id).get() ;
        bill.setCustomer(customerServiceClient.findCustomerById(bill.getCustomerId()));
        bill.getProductItems().forEach(pi->{
            pi.setProduct(productServiceClient.findProductById(pi.getProductId()));
            } );
        return bill;
    }




}
