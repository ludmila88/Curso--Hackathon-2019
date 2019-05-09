package com.stefanini.projeto.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Escada;
import com.stefanini.projeto.repository.EscadaRepositor;

@Service
public class EscadaService {
	@SuppressWarnings("unused")
	private static final Escada EscadaService = null;
	@Autowired
	private EscadaRepositor repository;
	
	//criando lista 
	public List<Escada> findAll() throws TreinaException {
		return (List<Escada>) repository.findAll();
	}
	//método de negocio para salvar POST
	public Escada salvarEscada(Escada escada) {
	 	return repository.save(escada);
	}
	//método de negocio para excluir Delete
	public void excluir(Long id) {
		repository.deleteById(id);
	}
	public Escada buscar(Long id) {
		return repository.findById(id).get();
	}
	public void salvar(Escada escada) throws Exception{
		if(escada.getNome().length()>20) {
			throw new Exception("Tamanho do campo maior que o permitido");
		}
		if(escada.getDegraus().size()>5) {
			
		}
		repository.save(escada);
	}
}
