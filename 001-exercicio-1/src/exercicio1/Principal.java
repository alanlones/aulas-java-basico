package exercicio1;

import java.util.Scanner;

public class Principal {
	/*
	 * Ler o nome de uma pessoa, a sua idade e o seu sal�rio, e mostrar estas
	 * informa��es.
	 */
	public static void main(String[] args) {
		// Vari�veis
		String nome;
		int idade;
		float salario;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o nome:");
		nome = entrada.nextLine();

		System.out.println("Informe a idade:");
		idade = Integer.parseInt(entrada.nextLine());

		System.out.println("Infore o sal�rio:");
		salario = Float.parseFloat(entrada.nextLine());

		// Sa�da de Dados
		System.out.println(nome + " tem " + idade + " anos e ganha R$" + salario);

		entrada.close();
	}

}
