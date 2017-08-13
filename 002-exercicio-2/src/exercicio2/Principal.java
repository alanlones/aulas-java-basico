package exercicio2;

import java.util.Scanner;

public class Principal {
	/*
	 * Ler dois números, efetuar as 4 operações matemáticas e mostrar os resultados.
	 */
	public static void main(String[] args) {
		// Variáveis
		int numero1;
		int numero2;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o primeiro número:");
		numero1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Informe o segundo número:");
		numero2 = Integer.parseInt(entrada.nextLine());

		// Processamento
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;

		// Saída de Dados
		System.out.println("------------ Resultados ------------");

		System.out.println(numero1 + " + " + numero2 + " = " + soma);
		System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
		System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
		System.out.println(numero1 + " / " + numero2 + " = " + divisao);

		entrada.close();
	}

}
