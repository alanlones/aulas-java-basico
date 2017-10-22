package exercicio20;

public class Aluno {
	String matricula;
	String nome;
	int idade;
	float notaUm;
	float notaDois;

	float media() {
		return (notaUm + notaDois) / 2;
	}

	boolean estaAprovado() {
		return media() > 7f;
	}
}
