package br.com.biblioteca.model;

import java.time.LocalDate;
import java.time.Month;

public class BibliotecaApplication {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("George R.R. Martin");
		autor.setCpf("45736283719");
		autor.setEmail("joao@biblioteca.com.br");
		System.out.println("Autor é valido: " + autor.ehValido());

		Obra obra = new Obra();
		obra.addAutor(autor);
		obra.setTitulo("Crônicas de Gelo e Fogo: A Guerra dos Tronos");

		Exemplar exemplar = new Exemplar();
		exemplar.setDataInclusao(LocalDate.of(2013, Month.JANUARY, 15));
		exemplar.setSetor("Fantasia Medieval");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Max Henrique");

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setPessoa(pessoa);
		emprestimo.addExemplar(exemplar);
		emprestimo.finalizar();
		emprestimo.setDataEmprestimo(LocalDate.of(1998, 1, 1));
		System.out.println("Atrasado: " + emprestimo.estaAtrasada());
	}

}
