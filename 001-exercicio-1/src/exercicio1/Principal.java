package exercicio1;

import java.util.Scanner;

public class Principal {
	/*
	 * Ler o nome de uma pessoa, a sua idade e o seu salário, e mostrar estas
	 * informações.
	 */
	public static void main(String[] args) {
		// Variáveis
		String nome;
		int idade;
		float salario;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o nome:");
		nome = entrada.nextLine();

		System.out.println("Informe a idade:");
		idade = Integer.parseInt(entrada.nextLine());

		System.out.println("Infore o salário:");
		salario = Float.parseFloat(entrada.nextLine());

		// Saída de Dados
		System.out.println(nome + " tem " + idade + " anos e ganha R$" + salario);

		entrada.close();
	}

}
