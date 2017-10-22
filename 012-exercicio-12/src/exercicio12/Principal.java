package exercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Variáveis
		float custoDeFabrica;
		float porcentagemDoRevendedor = 0.25f;
		float porcentagemDosImpostos = 0.45f;
		String resposta = "";
		do {
			// Entrada de Dados
			System.out.println("Informe o custo de fábrica:");
			custoDeFabrica = Float.parseFloat(scanner.nextLine());

			// Processamento
			float custoDoRevendedor = custoDeFabrica * porcentagemDoRevendedor;
			float custoDosImpostos = custoDeFabrica * porcentagemDosImpostos;
			float precoFinal = custoDeFabrica + custoDoRevendedor + custoDosImpostos;

			// Saída de Dados
			System.out.println("--------- Resultados ---------");
			System.out.println("Custo de Fábrica: R$" + custoDeFabrica);
			System.out.println("Custo do Revendedor: R$" + custoDoRevendedor);
			System.out.println("Custo dos Impostos: R$" + custoDosImpostos);
			System.out.println("\nPreço Final: R$" + precoFinal);

			System.out.println("Deseja continuar? (S/N)");
			resposta = scanner.nextLine();
		} while (resposta.equalsIgnoreCase("s"));

		System.out.println("Saindo......");
		scanner.close();
	}

}
