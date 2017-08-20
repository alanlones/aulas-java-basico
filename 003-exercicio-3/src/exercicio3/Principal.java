package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variáveis
		float nota1;
		float nota2;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe a primeira nota:");
		nota1 = Float.parseFloat(entrada.nextLine());

		System.out.println("Informe a segunda nota:");
		nota2 = Float.parseFloat(entrada.nextLine());

		// Processamento
		float media = (nota1 + nota2) / 2;

		// Saída de Dados
		System.out.println("Média: " + media);

		entrada.close();
	}

}
