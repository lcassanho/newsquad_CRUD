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
import br.com.fiap.newsquad.dto.FilmeDTO;
import br.com.fiap.newsquad.model.Filme;
import br.com.fiap.newsquad.repositories.FilmesRepository;

@Controller
public class FilmesController {
	
	@Autowired
	private FilmesRepository filmesRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/filmes")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("filmes/index");
		
		List<Filme> filmesFromRepository = filmesRepository.findAll();
		modelView.addObject("listarFilmes", filmesFromRepository);
		
		return modelView;
	}
	
	@GetMapping("/filmes/cadastro")
	public ModelAndView criar(FilmeDTO filme) {
		ModelAndView modelView = new ModelAndView("filmes/cadastro");
		return modelView;
	}
	
	@PostMapping("filmes")
	public ModelAndView salvar(@Valid FilmeDTO filme, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("Temos erros!!!");		
			return new ModelAndView("filmes/cadastro");
		}
		
		Filme filmesEntity = modelMapper.map(filme, Filme.class);
		
		filmesRepository.save(filmesEntity);
		
		return new ModelAndView("redirect:/filmes");
			
	}

}
