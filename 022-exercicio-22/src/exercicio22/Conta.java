package exercicio22;

public class Conta {
	private String nomeTitular;
	private float saldo;

	public Conta() {
	}

	public Conta(String nomeTitular, float saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		if (valor <= 0) {
			System.out.println("Erro - Valor inválido!");
			return;
		} else {
			this.saldo += valor;
		}
	}

	public void sacar(float valor) {
		if (valor > this.saldo) {
			System.out.println("Erro - Saldo insuficiente");
			return;
		} else {
			this.saldo -= valor;
		}
	}

}
