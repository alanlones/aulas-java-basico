package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Vari�veis
		float vendaDoMes;
		float baseFixa = 800.0f;
		float porcentagemComissao = 0.15f;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o valor vendido no m�s:");
		vendaDoMes = Float.parseFloat(entrada.nextLine());

		// Processamento
		float valorComissao = vendaDoMes * porcentagemComissao;
		float salarioTotal = baseFixa + valorComissao;

		// Sa�da de Dados
		System.out.println("----------- Resultados -----------");
		System.out.println("Sal�rio Base Fixo: R$" + baseFixa);
		System.out.println("Valor da Comiss�o: R$" + valorComissao);
		System.out.println("Sal�rio Total: R$" + salarioTotal);

		entrada.close();
	}

}
