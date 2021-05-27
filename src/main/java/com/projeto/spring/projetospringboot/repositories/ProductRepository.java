package com.projeto.spring.projetospringboot.repositories;

import com.projeto.spring.projetospringboot.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    

}
