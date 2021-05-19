package com.projeto.spring.projetospringboot.services;

import com.projeto.spring.projetospringboot.repositories.OrderRepository;
import com.projeto.spring.projetospringboot.entities.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findbyId(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
    
}
