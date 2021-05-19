package com.projeto.spring.projetospringboot.repositories;

import com.projeto.spring.projetospringboot.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

    
    
}
