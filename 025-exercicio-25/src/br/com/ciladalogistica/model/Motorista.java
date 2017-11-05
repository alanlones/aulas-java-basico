package br.com.ciladalogistica.model;

public class Motorista {
	private String cnh;
	private String nome;
	private float salario;

	public Motorista() {
	}

	public Motorista(String cnh, String nome, float salario) {
		this.cnh = cnh;
		this.nome = nome;
		this.salario = salario;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motorista [cnh=").append(cnh).append(", nome=").append(nome).append(", salario=")
				.append(salario).append("]");
		return builder.toString();
	}

}
