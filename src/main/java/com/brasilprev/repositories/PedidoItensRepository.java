package com.brasilprev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brasilprev.domain.PedidoItens;

@Repository
public interface PedidoItensRepository extends JpaRepository<PedidoItens, Long>{

}
