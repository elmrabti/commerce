package net.elmrabti.billingservice.controller;

import net.elmrabti.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface ProductServiceClient {
    @GetMapping("/products/{id}")
    Product findProductById(@PathVariable("id") Long id);

    

}
