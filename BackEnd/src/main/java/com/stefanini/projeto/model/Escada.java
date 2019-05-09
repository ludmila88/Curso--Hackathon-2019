package com.stefanini.projeto.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Escada {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "SQ_ES_NU", sequenceName = "SQ_ES_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ES_NU")
		
	@Column(name = "ES_NU")	private Long id;
	@Column(name = "ES_NO")	private String nome;
	
	@OneToMany(mappedBy = "escada")		
	private List<Degraus> degraus;
	
	public Escada(){		
		super();
	}
	
	public Escada(Long id, String nome) {		
		super();				
		this.id = id;				
		this.nome = nome;							
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

	public List<Degraus> getDegraus() {
		return degraus;
	}

	public void setDegraus(List<Degraus> degraus) {
		this.degraus = degraus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((degraus == null) ? 0 : degraus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escada other = (Escada) obj;
		if (degraus == null) {
			if (other.degraus != null)
				return false;
		} else if (!degraus.equals(other.degraus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
