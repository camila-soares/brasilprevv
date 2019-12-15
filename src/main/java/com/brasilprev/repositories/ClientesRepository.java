package com.brasilprev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brasilprev.domain.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
