package br.unipe.papw.service;

import br.unipe.papw.model.Produto;

public interface ProdutoService {


	void save(Produto produto);
	Produto findByNome(String nome);
	
}
