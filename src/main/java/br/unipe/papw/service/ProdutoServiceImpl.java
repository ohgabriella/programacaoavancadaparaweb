package br.unipe.papw.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.unipe.papw.model.Produto;
import br.unipe.papw.repository.ProductRepository;

public class ProdutoServiceImpl 
             implements ProdutoService {

	@Autowired
	private ProductRepository productRepository;
	
	public void save(Produto produto) {		
		productRepository.save(produto);		
	}

	public Produto findByNome(String nome) {
		return productRepository.findByNome(nome);		
	}

	/**
	 * @return the productRepository
	 */
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	/**
	 * @param productRepository the productRepository to set
	 */
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	
}
