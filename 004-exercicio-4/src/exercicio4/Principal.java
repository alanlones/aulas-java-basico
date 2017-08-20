package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Vari�veis
		float custoDeFabrica;
		float porcentagemDoRevendedor = 0.25f;
		float porcentagemDosImpostos = 0.45f;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o custo de f�brica:");
		custoDeFabrica = Float.parseFloat(entrada.nextLine());

		// Processamento
		float custoDoRevendedor = custoDeFabrica * porcentagemDoRevendedor;
		float custoDosImpostos = custoDeFabrica * porcentagemDosImpostos;
		float precoFinal = custoDeFabrica + custoDoRevendedor + custoDosImpostos;

		// Sa�da de Dados
		System.out.println("--------- Resultados ---------");
		System.out.println("Custo de F�brica: R$" + custoDeFabrica);
		System.out.println("Custo do Revendedor: R$" + custoDoRevendedor);
		System.out.println("Custo dos Impostos: R$" + custoDosImpostos);
		System.out.println("\nPre�o Final: R$" + precoFinal);

		entrada.close();
	}

}
