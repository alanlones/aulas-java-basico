package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variáveis
		float vendaDoMes;
		float baseFixa = 800.0f;
		float porcentagemComissao = 0.15f;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o valor vendido no mês:");
		vendaDoMes = Float.parseFloat(entrada.nextLine());

		// Processamento
		float valorComissao = vendaDoMes * porcentagemComissao;
		float salarioTotal = baseFixa + valorComissao;

		// Saída de Dados
		System.out.println("----------- Resultados -----------");
		System.out.println("Salário Base Fixo: R$" + baseFixa);
		System.out.println("Valor da Comissão: R$" + valorComissao);
		System.out.println("Salário Total: R$" + salarioTotal);

		entrada.close();
	}

}
