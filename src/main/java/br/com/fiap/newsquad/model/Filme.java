package br.com.fiap.newsquad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 	
	@Column(nullable = false)
	private String nome;
	private String genero;
	private String classificacao;
	private String diretor;
	private String studio;
	
	public Filme(Long id, String nome, String diretor, String studio, String genero, String classificacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.diretor = diretor;
		this.studio = studio;
		this.genero = genero;
		this.classificacao = classificacao;
	}
	
	public Filme() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	
}
