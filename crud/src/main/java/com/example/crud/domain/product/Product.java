package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID) 
    private String id;

    private String name;

    private float price_in_cents;

    private Boolean active;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;

    }
    
}
