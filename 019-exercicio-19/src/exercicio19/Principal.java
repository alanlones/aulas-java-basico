package exercicio19;

public class Principal {

	public static void main(String[] args) {
		System.out.println(classificacao(8));
		System.out.println(classificacao(22));
		System.out.println(classificacao(4));
		System.out.println(classificacao(15));
	}

	public static String classificacao(int idade) {
		if (idade < 5)
			return "Fora da idade";

		if (idade >= 5 && idade <= 7)
			return "Infantil A";

		if (idade >= 8 && idade <= 10)
			return "Infantil B";

		if (idade >= 11 && idade <= 13)
			return "Juvenil A";

		if (idade >= 14 && idade <= 17)
			return "Juvenil B";

		if (idade >= 18)
			return "Adulto";

		return "";
	}

}
