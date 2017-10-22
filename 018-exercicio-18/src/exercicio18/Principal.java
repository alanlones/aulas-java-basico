package exercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome do produto: ");
		String nome = scanner.nextLine();

		System.out.println("Informe o valor de custo: ");
		float valorDeCusto = Float.parseFloat(scanner.nextLine());

		System.out.println("Informe o valor de venda: ");
		float valorDeVenda = Float.parseFloat(scanner.nextLine());

		System.out.println("Informe a quantidade: ");
		int quantidade = Integer.parseInt(scanner.nextLine());

		float lucro = calcularLucro(valorDeCusto, valorDeVenda, quantidade);

		System.out.println("Produto: " + nome);
		System.out.println("Lucro total: R$ " + lucro);

		scanner.close();
	}

	public static float calcularLucro(float valorDeCusto, float valorDeVenda, int quantidade) {
		float totalDeCusto = totalPelaQuantidade(valorDeCusto, quantidade);
		float totalDeVenda = totalPelaQuantidade(valorDeVenda, quantidade);

		return totalDeVenda - totalDeCusto;
	}

	public static float totalPelaQuantidade(float valor, int quantidade) {
		return valor * quantidade;
	}

}
