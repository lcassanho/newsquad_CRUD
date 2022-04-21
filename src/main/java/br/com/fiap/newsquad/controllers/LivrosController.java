package br.com.fiap.newsquad.controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.newsquad.dto.LivroDTO;
import br.com.fiap.newsquad.model.Livro;
import br.com.fiap.newsquad.repositories.LivroRepository;


@Controller
public class LivrosController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/livros")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("livros/index");
		
		List<Livro> livrosFromRepository = livroRepository.findAll();
		modelView.addObject("listarLivros", livrosFromRepository);
		
		return modelView;
	}
	
	@GetMapping("/livros/cadastro")
	public ModelAndView criar(LivroDTO livro) {
		ModelAndView modelView = new ModelAndView("livros/cadastro");
		return modelView;
	}
	
	@PostMapping("livros")
	public ModelAndView salvar(@Valid LivroDTO livro, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("Temos erros!!!");		
			return new ModelAndView("livros/cadastro");
		}
		
		Livro livroEntity = modelMapper.map(livro, Livro.class);
		
		livroRepository.save(livroEntity);
		
		return new ModelAndView("redirect:/livros");
			
	}
	
	
}
