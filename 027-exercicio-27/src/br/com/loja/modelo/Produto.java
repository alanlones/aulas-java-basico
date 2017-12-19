package br.com.loja.modelo;

public class Produto {
	private int id;
	private String nome;
	private float preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=").append(id).append(", nome=").append(nome).append(", preco=").append(preco)
				.append("]");
		return builder.toString();
	}

}
