package exercicio21;

public class Principal {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Juliana", 8650.00f, 12500.00f);
		System.out.println("Salário anual bruto: R$ " + empregado.salarioAnualBruto());
		System.out.println("Total impostos: R$ " + empregado.impostos());
	}

}
