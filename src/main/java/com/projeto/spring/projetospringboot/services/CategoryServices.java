package com.projeto.spring.projetospringboot.services;

import com.projeto.spring.projetospringboot.repositories.CategoryRepository;
import com.projeto.spring.projetospringboot.entities.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findbyId(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
    
}
