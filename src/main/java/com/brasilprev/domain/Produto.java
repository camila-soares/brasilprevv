package com.brasilprev.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "PRODUTO")
@Data
@AllArgsConstructor
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduto;

	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA",
		joinColumns = @JoinColumn(name = "idProdutto"),
		inverseJoinColumns = @JoinColumn(name = "idCategoria")
	)
	private List<Categoria> categoria =  new ArrayList<>();
	
	private  String produto;
	
	private double preco;
	
	private Integer quantidade;
	
	private String descricao;
	
	private String foto;
	
}
