package exercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int NUMERO_ALUNOS = 10;
		float soma = 0;

		for (int i = 0; i < NUMERO_ALUNOS; i++) {
			System.out.println("Informe a " + (i + 1) + "a nota:");
			soma += Float.parseFloat(scanner.nextLine());
		}

		float media = soma / NUMERO_ALUNOS;
		System.out.println("Média: " + media);

		scanner.close();
	}

}
