package br.com.lonesapps.aulaweb.model;

public class Time {
	private Integer posicao;
	private String nome;
	private Integer pontuacao;

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Time() {
		super();
	}

	public Time(Integer posicao, String nome, Integer pontuacao) {
		super();
		this.posicao = posicao;
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

}
