package br.com.fiap.newsquad.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LivroDTO {
	@NotNull
	@NotBlank
	private String titulo;
	@NotNull
	@NotBlank
	private String genero;
	@NotNull
	@NotBlank
	private String indicacao;
	
	private String autor;
	private String editora;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}


}
