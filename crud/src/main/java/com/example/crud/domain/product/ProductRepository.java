package com.example.crud.domain.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//Com essa interface eu uso métodos padrões para acessar ou manipular dados do banco de dados
//Caso eu queira usar métodos mais avançados eu devo criálos abaixo
public interface ProductRepository extends JpaRepository<Product, String>{

    List<Product> findAllByActiveTrue();

} 
    

