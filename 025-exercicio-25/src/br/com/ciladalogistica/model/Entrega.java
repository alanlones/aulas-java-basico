package br.com.ciladalogistica.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Entrega {
	private long numero;
	private LocalDate dataColeta;
	private LocalDate dataEntrega;
	private Caminhao caminhao;
	private Motorista motorista;
	private Endereco enderecoColeta;
	private Destinatario destinatario;
	private List<Carga> cargas = new ArrayList<>();

	public Entrega() {
	}

	public Entrega(long numero, LocalDate dataColeta, LocalDate dataEntrega, Caminhao caminhao, Motorista motorista,
			Endereco enderecoColeta, Destinatario destinatario) {
		this.numero = numero;
		this.dataColeta = dataColeta;
		this.dataEntrega = dataEntrega;
		this.caminhao = caminhao;
		this.motorista = motorista;
		this.enderecoColeta = enderecoColeta;
		this.destinatario = destinatario;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public LocalDate getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(LocalDate dataColeta) {
		this.dataColeta = dataColeta;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Endereco getEnderecoColeta() {
		return enderecoColeta;
	}

	public void setEnderecoColeta(Endereco enderecoColeta) {
		this.enderecoColeta = enderecoColeta;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	public void addCarga(Carga carga) {
		float pesoEstimado = getPesoTotal() + carga.getPesoTotal();
		boolean pesoMaiorQueOPermitido = pesoEstimado > this.caminhao.getPesoMaximo();

		if (pesoMaiorQueOPermitido) {
			float pesoExcedido = pesoEstimado - this.caminhao.getPesoMaximo();
			System.out.println("Erro - Não foi possivel adicionar " + carga.getDescricao()
					+ "!\nPeso maior que o permitido! Excedido em " + pesoExcedido + "Kgs.");
		} else
			this.cargas.add(carga);
	}

	public float getPesoTotal() {
		float pesoAtual = 0;
		for (Carga c : this.cargas)
			pesoAtual += c.getPesoTotal();
		return pesoAtual;
	}

	public void imprimirRelatorio() {
		System.out.println("------- Entrega nº " + this.numero + " -------");
		System.out.println("--- Caminhão: " + this.caminhao.getFabricante() + " - " + this.caminhao.getModelo());
		System.out.println("--- Motorista: " + this.getMotorista().getNome() + " (" + this.motorista.getCnh() + ")");
		System.out.println("------- Coleta -------");
		System.out.println("--- " + this.enderecoColeta.getLogradouro() + ", " + this.enderecoColeta.getNumero());
		System.out.println("--- " + this.enderecoColeta.getBairro() + " - " + this.enderecoColeta.getCidade());
		System.out.println("--- Destinatário: " + this.getDestinatario().getNome());
		System.out.println("------- Entrega -------");
		System.out.println("--- " + this.getDestinatario().getEnderecoEntrega().getLogradouro() + ", "
				+ this.getDestinatario().getEnderecoEntrega().getNumero());
		System.out.println("--- " + this.getDestinatario().getEnderecoEntrega().getBairro() + " - "
				+ this.getDestinatario().getEnderecoEntrega().getCidade());
		System.out.println("--- Peso total: " + getPesoTotal());
		System.out.println("------- Cargas -------");
		for (Carga c : this.cargas) {
			System.out.println(c.getDescricao() + " - " + c.getQuantidade() + " X " + c.getPesoUnitario() + " = "
					+ c.getPesoTotal());
		}
	}

}
