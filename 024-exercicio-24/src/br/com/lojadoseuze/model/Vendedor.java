package br.com.lojadoseuze.model;

public class Vendedor extends Pessoa {

	private float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Vendedor(String nome, String documento, float salario) {
		super(nome, documento);
		this.salario = salario;
	}

	public Vendedor() {
		super();
	}

}
