package com.senai.Caua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.Caua.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
