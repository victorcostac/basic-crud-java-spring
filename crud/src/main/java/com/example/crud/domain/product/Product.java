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
    private Number price_in_cents;
    
}
