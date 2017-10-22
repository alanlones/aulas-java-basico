package exercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de alunos: ");
		int QUANTIDADE = Integer.parseInt(scanner.nextLine());

		String nomeDoMelhor = "";
		float notaDoMelhor = 0f;

		for (int i = 1; i <= QUANTIDADE; i++) {
			System.out.println("Informe o nome do aluno " + i + ": ");
			String nome = scanner.nextLine();
			System.out.println("Informe a nota do aluno" + i + ": ");
			float nota = Float.parseFloat(scanner.nextLine());

			if (nota > notaDoMelhor) {
				nomeDoMelhor = nome;
				notaDoMelhor = nota;
			}
		}

		System.out.println("----------- Resultado ----------- ");
		System.out.println("Melhor aluno : " + nomeDoMelhor);
		System.out.println("Nota: " + notaDoMelhor);

		scanner.close();
	}

}
