package com.brasilprev.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity (name = "CLIENTES")
@Data
@AllArgsConstructor
public class Clientes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCliente;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String rua;
	
	private String cidade;
	
	private String bairro;
	
	private String cep;
	
	private String estado;
	@OneToMany(mappedBy =  "cliente")
	private List<Pedidos> pedidos = new ArrayList<>();
}
