package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.papw.model.Categoria;

@Repository
public interface CategoriaRepository
      extends JpaRepository<Categoria, Long>{
	
	Categoria findByName(String nome);
	
}




