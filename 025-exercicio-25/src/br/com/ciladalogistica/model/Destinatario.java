package br.com.ciladalogistica.model;

public class Destinatario {
	private String nome;
	private String documento;
	private Endereco enderecoEntrega;

	public Destinatario() {
		super();
	}

	public Destinatario(String nome, String documento, Endereco enderecoEntrega) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.enderecoEntrega = enderecoEntrega;
	}

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

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Destinatario [nome=").append(nome).append(", documento=").append(documento)
				.append(", enderecoEntrega=").append(enderecoEntrega).append("]");
		return builder.toString();
	}

}
