package br.unipe.papw.service;

import java.util.List;

import br.unipe.papw.model.Categoria;

public interface CategoriaService {

	void save(Categoria categoria);
	Categoria findByName(String nome);
	List<Categoria> findAll();
	
}
