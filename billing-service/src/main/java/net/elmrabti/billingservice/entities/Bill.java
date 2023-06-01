package net.elmrabti.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.elmrabti.billingservice.model.Customer;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date billingDate ;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems ;
    private Long customerId ;
    @Transient
    private Customer customer ;
}
