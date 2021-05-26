package com.projeto.spring.projetospringboot.repositories;

import com.projeto.spring.projetospringboot.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
