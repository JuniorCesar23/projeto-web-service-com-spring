package com.projeto.spring.projetospringboot.repositories;

import com.projeto.spring.projetospringboot.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    
    
}
