package exercicio22;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta("Carina", 200.00f);
		conta.sacar(300);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.depositar(300);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.sacar(150);
		System.out.println("Saldo: " + conta.getSaldo());
		
	}

}
