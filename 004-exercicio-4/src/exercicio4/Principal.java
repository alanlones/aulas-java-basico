package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variáveis
		float custoDeFabrica;
		float porcentagemDoRevendedor = 0.25f;
		float porcentagemDosImpostos = 0.45f;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o custo de fábrica:");
		custoDeFabrica = Float.parseFloat(entrada.nextLine());

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

		entrada.close();
	}

}
