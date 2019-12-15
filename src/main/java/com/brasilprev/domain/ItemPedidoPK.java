package com.brasilprev.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Embeddable
@Data
@AllArgsConstructor
public class ItemPedidoPK implements  Serializable {
	private static final long serialVersionUID = 1L;
	
	public ItemPedidoPK() {}
	
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedidos pedidos;

	@ManyToOne
	@JoinColumn(name = "idProduto")
	private Produto produto;
}
