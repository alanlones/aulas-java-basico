package br.com.lojadoseuze.model;

import java.util.List;
import java.util.Map;

public class Pessoa {
	private String nome;
	private String documento;
	private List<String> enderecos;
	private Map<String, String> telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<String> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<String> enderecos) {
		this.enderecos = enderecos;
	}

	public Map<String, String> getTelefone() {
		return telefone;
	}

	public void setTelefone(Map<String, String> telefone) {
		this.telefone = telefone;
	}

	public Pessoa(String nome, String documento) {
		super();
		this.nome = nome;
		this.documento = documento;
	}

	public Pessoa() {
		super();
	}

}
