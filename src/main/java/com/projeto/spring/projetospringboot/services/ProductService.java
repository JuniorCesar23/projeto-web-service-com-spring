package com.projeto.spring.projetospringboot.services;

import java.util.List;
import java.util.Optional;

import com.projeto.spring.projetospringboot.entities.Product;
import com.projeto.spring.projetospringboot.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findbyId(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
    
}
