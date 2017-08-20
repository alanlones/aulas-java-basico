package exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variáveis
		float nota1;
		float nota2;
		float nota3;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe a primeira nota:");
		nota1 = Float.parseFloat(entrada.nextLine());

		System.out.println("Informe a primeira nota:");
		nota2 = Float.parseFloat(entrada.nextLine());

		System.out.println("Informe a primeira nota:");
		nota3 = Float.parseFloat(entrada.nextLine());

		// Processamento
		float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		boolean alunoAprovado = media >= 6;

		// Saída de Dados
		System.out.println("----------- Resultados -----------");
		System.out.println("Média: " + media);
		if (alunoAprovado)
			System.out.println("Situação: APROVADO");
		else
			System.out.println("Situação: REPROVADO");

		entrada.close();
	}

}
