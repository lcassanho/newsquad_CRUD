package br.com.fiap.newsquad.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FilmeDTO {	
	@NotBlank
	@NotNull
	private String nome;
	@NotBlank
	@NotNull
	private String genero;
	@NotBlank
	@NotNull
	private String classificacao;
	
	private String diretor;
	private String studio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	
}
