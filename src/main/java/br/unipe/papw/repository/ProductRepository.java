package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.papw.model.Produto;

@Repository
public interface ProductRepository
      extends JpaRepository<Produto, Long>{
	
	Produto findByNome(String nome);
	
}




