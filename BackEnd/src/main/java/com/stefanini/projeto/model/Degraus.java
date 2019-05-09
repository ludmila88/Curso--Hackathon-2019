package com.stefanini.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Degraus {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "SQ_DE_NU", sequenceName = "SQ_DE_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DE_NU")
	@Column(name = "DE_NU")
	private Long id;

	@Column(name = "DE_NOME")
	private String nome;

	@Column(name = "DE_DEGRAUS")
	private Integer degraus;

	@ManyToOne
	@com.fasterxml.jackson.annotation.JsonIgnore
	@JoinColumn(name = "ES_NU", referencedColumnName = "ES_NU")
	private Escada escada;

	public Degraus() {
		super();
	}

	public Degraus(String nome, Integer degraus) {
		super();
		this.nome = nome;
		this.degraus = degraus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Escada getEscada() {
		return escada;
	}

	public void setEscada(Escada escada) {
		this.escada = escada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}