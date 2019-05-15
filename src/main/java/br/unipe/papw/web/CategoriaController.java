package br.unipe.papw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.unipe.papw.model.Categoria;
import br.unipe.papw.model.Product;
import br.unipe.papw.service.CategoriaService;


@Controller
public class CategoriaController {
	
	
	@Autowired
	private CategoriaService categoriaService;

	
	/**
	 */
	@GetMapping("/categoria")
	public String listCategoria(Model model) {
				
		List<Categoria> listCategoria = categoriaService.findAll();
		System.out.println(listCategoria.get(0).getName());
		model.addAttribute("listCategoria",listCategoria);
		
		return "module/categoria/index";
	}

	
	@GetMapping("/categoria/form")
	public String prepareCategoriaForm(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoriaForm",categoria);		
		return "module/categoria/formCategoria";
	}
	
	@PostMapping("/categoria")
	public String save(@ModelAttribute("categoriaForm") Categoria categoria, BindingResult bindingResult) {
		 if (bindingResult.hasErrors()) {
	            return "module/categoria/productForm";
	        }
		 categoriaService.save(categoria);

		 
		return "module/categoria/index";
	}

}
