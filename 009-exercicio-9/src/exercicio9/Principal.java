package exercicio9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número: ");
		int numero = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i <= 10; i++) {
			int multiplicacao = numero * i;
			System.out.println(numero + " X " + i + " = " + multiplicacao);
		}

		scanner.close();
	}

}
