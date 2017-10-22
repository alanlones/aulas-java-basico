package exercicio23;

public class Carro {
	private String modelo;
	private String marca;
	private float velocidadeAtual;
	private String status;

	public Carro() {
		this.status = "Desligado";
		this.velocidadeAtual = 0;
	}

	public Carro(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
		this.status = "Desligado";
		this.velocidadeAtual = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void imprimirStatus() {
		System.out.println("Status: " + this.status);
		System.out.println("Velocidade: " + this.velocidadeAtual);
	}

	public void ligar() {
		this.status = "Ligado";
		imprimirStatus();
	}

	public void desligar() {
		this.status = "Desligado";
		this.velocidadeAtual = 0;
		imprimirStatus();
	}

	public void acelerar() {
		if (this.status.equals("Desligado")) {
			System.out.println("Carro desligado");
			return;
		} else {
			this.velocidadeAtual += 10f;
			imprimirStatus();
		}
	}

	public void frear() {
		if (this.status.equals("Desligado")) {
			System.out.println("Carro desligado");
			return;
		} else {
			this.velocidadeAtual -= 10f;
			imprimirStatus();
		}
	}

	public void parar() {
		if (this.status.equals("Desligado")) {
			System.out.println("Carro desligado");
			return;
		} else {
			this.velocidadeAtual = 0f;
			imprimirStatus();
		}
	}

}
