package exercicio17;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Soma: " + soma(8, 3));
		System.out.println("Subtra��o: " + subtracao(8, 3));
		System.out.println("Multilica��o: " + multiplicacao(8, 3));
		System.out.println("Divis�o: " + divisao(8, 3));
		System.out.println("Sucessor: " + sucessor(8));
		System.out.println("Antecessor: " + antecessor(8));
		System.out.println("� par: " + ehPar(8));
		System.out.println("� impar: " + ehImpar(8));
	}

	public static float soma(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}

	public static float divisao(float num1, float num2) {
		return num1 / num2;
	}

	public static float sucessor(float num) {
		return num + 1;
	}

	public static float antecessor(float num) {
		return num - 1;
	}

	public static boolean ehPar(float num) {
		return num % 2 == 0;
	}

	public static boolean ehImpar(float num) {
		return !(num % 2 == 0);
	}

}
