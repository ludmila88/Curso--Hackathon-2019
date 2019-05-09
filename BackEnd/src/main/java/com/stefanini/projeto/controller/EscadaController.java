package com.stefanini.projeto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Escada;
import com.stefanini.projeto.service.EscadaService;


@CrossOrigin
@Controller
@RequestMapping(value = "/escada")
public class EscadaController {

	@Autowired
	private EscadaService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Escada> findAll() throws TreinaException {
		return service.findAll();
	}	
	
	@PostMapping("/salvar")
	 public @ResponseBody Escada salvaEscada(@Valid @RequestBody Escada escada) {
		 return service.salvarEscada(escada);
	 }
	
	@DeleteMapping("excluir/{id}")
	public void delete(@PathVariable("id") Long id){
		System.out.println("id " + id);
		service.excluir(id);
	 }

	@GetMapping("/buscar/{id}")
	public Escada get(@PathVariable("id") Long id) throws TreinaException {
		return service.buscar(id);
	}
	@GetMapping("/lista/id")
	public List<Escada> consultar() throws TreinaException {
		return (List<Escada>) service.findAll();
	}
	
}