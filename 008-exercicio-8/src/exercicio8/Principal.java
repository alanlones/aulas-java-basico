package exercicio8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Vari�veis
		int numeroDoMes;

		Scanner entrada = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Informe o n�mero do m�s:");
		numeroDoMes = Integer.parseInt(entrada.nextLine());

		// Sa�da de Dados
		System.out.println("---------- Resultados ----------");
		switch (numeroDoMes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("N�mero inv�lido");
			break;
		}

		entrada.close();
	}

}
