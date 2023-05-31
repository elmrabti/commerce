package net.elmrabti.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.elmrabti.billingservice.model.Product;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Long productId ;
    private double price ;
    private double quantity ;
    @ManyToOne
    private Bill bill ;
    @Transient
    private Product product ;

}
