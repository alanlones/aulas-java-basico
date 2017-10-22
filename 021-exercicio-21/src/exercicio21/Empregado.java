package exercicio21;

public class Empregado {
	private String nome;
	private float salario;
	private float bonus;

	public Empregado() {
	}

	public Empregado(String nome, float salario, float bonus) {
		this.nome = nome;
		this.salario = salario;
		this.bonus = bonus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float salarioAnualBruto() {
		return (this.salario * 13) + bonus;
	}

	public float impostos() {
		return this.salarioAnualBruto() * 0.30f;
	}

}
