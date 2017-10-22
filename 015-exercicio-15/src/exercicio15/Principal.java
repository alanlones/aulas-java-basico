package exercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int DIAS = 5;
		float[] temperaturas = new float[DIAS];
		float menorTemperatura = 9999;
		float maiorTemperatura = 0;
		float soma = 0;
		float media = 0;
		int diasAcimaDaMedia = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Informe a temperatura do dia: " + (i + 1) + ": ");
			float temperatura = Float.parseFloat(scanner.nextLine());

			temperaturas[i] = temperatura;

			soma += temperatura;

			if (temperatura < menorTemperatura)
				menorTemperatura = temperatura;

			if (temperatura > maiorTemperatura)
				maiorTemperatura = temperatura;
		}

		media = soma / temperaturas.length;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > media)
				diasAcimaDaMedia++;
		}

		System.out.println("Menor temperatura: " + menorTemperatura);
		System.out.println("Maior temperatura: " + maiorTemperatura);
		System.out.println("Média: " + media);
		System.out.println("Dias acima da média: " + diasAcimaDaMedia);

		scanner.close();
	}

}
