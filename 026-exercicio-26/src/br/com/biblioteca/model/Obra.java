package br.com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Obra {
	private String isbn;
	private String titulo;
	private String assunto;
	private String edicao;
	private List<Autor> autores = new ArrayList<>();

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public void addAutor(Autor autor) {
		this.autores.add(autor);
	}

}
