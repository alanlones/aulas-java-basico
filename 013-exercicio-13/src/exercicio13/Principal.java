package exercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe o nome " + (i + 1) + ": ");
			nomes[i] = scanner.nextLine();
		}

		System.out.println("----------- Pesquisa -----------");
		System.out.println("Informe o nome que deseja pesquisar: ");
		String nome = scanner.nextLine();

		boolean encontrou = false;

		for (int i = 0; i < nomes.length; i++) {
			if (nome.equals(nomes[i]))
				encontrou = true;
		}

		if (encontrou)
			System.out.println("Nome está na lista");
		else
			System.out.println("Nome não está na lista");

		scanner.close();
	}

}
