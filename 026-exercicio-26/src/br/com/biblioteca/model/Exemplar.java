package br.com.biblioteca.model;

import java.time.LocalDate;

public class Exemplar {
	private LocalDate dataInclusao;
	private StatusExemplar status;
	private String setor;
	private int estante;
	private int prateleira;
	private Obra obra;

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public StatusExemplar getStatus() {
		return status;
	}

	public void setStatus(StatusExemplar status) {
		this.status = status;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	public void devolver() {
		status = StatusExemplar.DISPONIVEL;
	}

}
