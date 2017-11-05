package br.com.ciladalogistica.model;

public class Carga {
	private String descricao;
	private float quantidade;
	private String unidade;
	private float pesoUnitario;

	public Carga() {
	}

	public Carga(String descricao, float quantidade, String unidade, float pesoUnitario) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.pesoUnitario = pesoUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public float getPesoUnitario() {
		return pesoUnitario;
	}

	public void setPesoUnitario(float pesoUnitario) {
		this.pesoUnitario = pesoUnitario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carga [descricao=").append(descricao).append(", quantidade=").append(quantidade)
				.append(", unidade=").append(unidade).append(", pesoUnitario=").append(pesoUnitario).append("]");
		return builder.toString();
	}

	public float getPesoTotal() {
		return this.getQuantidade() * this.getPesoUnitario();
	}

}
