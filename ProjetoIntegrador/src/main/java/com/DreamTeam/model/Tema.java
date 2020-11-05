package com.DreamTeam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tema;
	
	@Column
	@NotNull
	@Size(max = 40)
	private String nome;
	
	@Column	
	private Integer numero;
	
	@Column
	@NotNull
	@Size(max = 300)
	private String descricao_tema;

	public Long getId_tema() {
		return id_tema;
	}

	public void setId_tema(Long id_tema) {
		this.id_tema = id_tema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDescricao_tema() {
		return descricao_tema;
	}

	public void setDescricao_tema(String descricao_tema) {
		this.descricao_tema = descricao_tema;
	}
	
	
	
	
	

}
