package br.unipe.papw.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.unipe.papw.model.Produto;


@Controller
public class ProdutoController {
	
	@GetMapping("/produto")
	public String carregarProduto(Model model) {
		Produto produto = new Produto();
		produto.setDescricao("Produto Aula");
		produto.setNome("Aula");
		produto.setId(1);
		
		model.addAttribute("produto",produto);
		
		return "/modulo/produto/index";
	}

}
