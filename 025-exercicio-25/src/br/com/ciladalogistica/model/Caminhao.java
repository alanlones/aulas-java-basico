package br.com.ciladalogistica.model;

public class Caminhao {
	private String placa;
	private String fabricante;
	private String modelo;
	private float pesoMaximo;

	public Caminhao() {
	}

	public Caminhao(String placa, String fabricante, String modelo, float pesoMaximo) {
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.pesoMaximo = pesoMaximo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(float pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhao [placa=").append(placa).append(", fabricante=").append(fabricante).append(", modelo=")
				.append(modelo).append(", pesoMaximo=").append(pesoMaximo).append("]");
		return builder.toString();
	}
	
	

}
