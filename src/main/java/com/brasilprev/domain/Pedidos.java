package com.brasilprev.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "PEDIDOS")
@Data
@AllArgsConstructor
public class Pedidos {
	
	@Id
	private Long idPedidos;

	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "idClientes")
	private Clientes cliente;
	
	private String status;
	
	private String sessao;
}
