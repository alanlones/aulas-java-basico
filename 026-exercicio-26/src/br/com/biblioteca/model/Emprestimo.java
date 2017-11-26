package br.com.biblioteca.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Só podem ser pegos emprestados 2 (dois) exemplares por vez.
 * 
 * @author alanl
 *
 */
public class Emprestimo {
	private int numero;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucaoEsperada;
	private LocalDate dataDevolucaoEfetiva;
	private StatusEmprestimo status;
	public static final int PRAZO_EM_DIAS = 7;
	public static final int LIMITE_DE_EXEMPLARES = 2;
	private List<Exemplar> exemplares = new ArrayList<>();
	private Pessoa pessoa;

	public Emprestimo() {
		dataEmprestimo = LocalDate.now();
		defineDataDevolucaoEsperada();
		status = StatusEmprestimo.PENDENTE;
		numero = ((Double)(Math.random()  * 1000)).intValue();
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
		defineDataDevolucaoEsperada();
	}

	public LocalDate getDataDevolucaoEsperada() {
		return dataDevolucaoEsperada;
	}

	public void setDataDevolucaoEsperada(LocalDate dataDevolucaoEsperada) {
		this.dataDevolucaoEsperada = dataDevolucaoEsperada;
	}

	public LocalDate getDataDevolucaoEfetiva() {
		return dataDevolucaoEfetiva;
	}

	public void setDataDevolucaoEfetiva(LocalDate dataDevolucaoEfetiva) {
		this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
	}

	public StatusEmprestimo getStatus() {
		return status;
	}

	public void setStatus(StatusEmprestimo status) {
		this.status = status;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void addExemplar(Exemplar exemplar) {
		boolean numeroMaximoDeExemplaresAlcancado = exemplares.size() == LIMITE_DE_EXEMPLARES;
		if (!numeroMaximoDeExemplaresAlcancado)
			exemplares.add(exemplar);
		else
			System.out.println("Número máximo de exemplares alcançado!");
	}

	public int getQuantidadeDeExamplares() {
		return exemplares.size();
	}

	private void defineDataDevolucaoEsperada() {
		dataDevolucaoEsperada = dataEmprestimo.plusDays(PRAZO_EM_DIAS);
	}

	public void finalizar() {
		dataDevolucaoEfetiva = LocalDate.now();
		status = StatusEmprestimo.FINALIZADO;
		for (Exemplar exemplar : exemplares)
			exemplar.devolver();
	}

	public boolean estaAtrasada() {
		boolean naoFoiDevolvido = status == StatusEmprestimo.PENDENTE;
		boolean passouDoPrazo = LocalDate.now().isAfter(dataDevolucaoEsperada);
		return naoFoiDevolvido && passouDoPrazo;
	}

}
