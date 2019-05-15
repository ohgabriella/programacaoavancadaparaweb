package br.unipe.papw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unipe.papw.model.Categoria;
import br.unipe.papw.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public void save(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public Categoria findByName(String nome) {
		return categoriaRepository.findByName(nome);
	}
	
	
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}

}
