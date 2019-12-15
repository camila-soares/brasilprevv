package com.brasilprev.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "CATEGORIA")
@Data
@AllArgsConstructor
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategoria;
	
	private String categoria;
	
	@ManyToMany(mappedBy = "categoria")
	private List<Produto> produtos = new ArrayList<>();

}
