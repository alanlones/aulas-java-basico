package exercicio2;

import java.util.Scanner;

public class Principal {
	/*
	 * Ler dois n�meros, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
	 */
	public static void main(String[] args) {
		// Vari�veis
		int numero1;
		int numero2;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o primeiro n�mero:");
		numero1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Informe o segundo n�mero:");
		numero2 = Integer.parseInt(entrada.nextLine());

		// Processamento
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;

		// Sa�da de Dados
		System.out.println("------------ Resultados ------------");

		System.out.println(numero1 + " + " + numero2 + " = " + soma);
		System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
		System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
		System.out.println(numero1 + " / " + numero2 + " = " + divisao);

		entrada.close();
	}

}
