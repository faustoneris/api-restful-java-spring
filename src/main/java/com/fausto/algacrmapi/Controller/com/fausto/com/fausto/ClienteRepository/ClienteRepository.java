package com.fausto.algacrmapi.Controller.com.fausto.com.fausto.ClienteRepository;

import com.fausto.algacrmapi.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
