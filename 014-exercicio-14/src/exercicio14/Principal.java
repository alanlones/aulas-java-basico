package exercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float[] notas = new float[20];
		float soma = 0;
		int alunosAcimaDaMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			float nota = Float.parseFloat(scanner.nextLine());
			notas[i] = nota;
			soma += nota;
		}

		float media = soma / notas.length;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media)
				alunosAcimaDaMedia++;
		}

		System.out.println("Média: " + media);
		System.out.println("Alunos acima da média: " + alunosAcimaDaMedia);

		scanner.close();

	}

}
