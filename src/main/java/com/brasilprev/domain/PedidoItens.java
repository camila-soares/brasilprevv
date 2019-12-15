package com.brasilprev.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "PEDIDO_ITENS")
@Data
@AllArgsConstructor
public class PedidoItens {

				
	@EmbeddedId
	private ItemPedidoPK idIteem =  new ItemPedidoPK();

	
	private String produto;
	
	private Integer quantidade;
	
	private Double valor;
	
	private Double subTotal;
	
}
