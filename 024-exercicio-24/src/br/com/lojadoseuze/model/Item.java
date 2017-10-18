package br.com.lojadoseuze.model;

public class Item {
	private Produto produto;
	private int quantidade;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorTotal() {
		return quantidade * produto.getPreco();
	}

	public Item(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Item() {
		super();
	}

}
