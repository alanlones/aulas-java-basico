package br.com.lojadoseuze.model;

public class Produto {
	private String codigo;
	private String nome;
	private String categoria;
	private float preco;
	private String descricao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Produto(String codigo, String nome, String categoria, float preco, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.descricao = descricao;
	}

	public Produto() {
		super();
	}
	
	public void imprimir() {
		String texto = String.format("#%s %s (%s) ------ R$ %.2f", codigo, nome, categoria, preco);
		System.out.println(texto);
	}

}
