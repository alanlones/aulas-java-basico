package execicio7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variáveis
		String nome;
		float valorDaCompra;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o nome do cliente:");
		nome = entrada.nextLine();

		System.out.println("Informe o valor da compra: ");
		valorDaCompra = Float.parseFloat(entrada.nextLine());

		// Processamento
		float porcentagemDeDesconto = 0;

		boolean descontoDezPorCento = valorDaCompra <= 200;
		boolean descontoQuinzePorCento = valorDaCompra > 200 && valorDaCompra < 500;
		boolean descontoVintePorCento = valorDaCompra >= 500;

		if (descontoDezPorCento)
			porcentagemDeDesconto = 0.1f;
		else if (descontoQuinzePorCento)
			porcentagemDeDesconto = 0.15f;
		else if (descontoVintePorCento)
			porcentagemDeDesconto = 0.2f;

		float valorDoDesconto = valorDaCompra * porcentagemDeDesconto;
		float valorFinal = valorDaCompra - valorDoDesconto;

		// Saída de Dados
		System.out.println("----------- Resultados -----------");
		System.out.println("Cliente: " + nome);
		System.out.println("Valor da Compra: R$" + valorDaCompra);
		System.out.println("Desconto: " + porcentagemDeDesconto * 100 + "%");
		System.out.println("Valor do Desconto: R$" + valorDoDesconto);
		System.out.println("Valor Final: R$" + valorFinal);

		entrada.close();
	}

}
