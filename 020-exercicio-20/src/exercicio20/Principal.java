package exercicio20;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.matricula = "201708113";
		aluno.nome = "João";
		aluno.idade = 15;
		aluno.notaUm = 7.6f;
		aluno.notaDois = 8.5f;

		System.out.println("Média: " + aluno.media());
		System.out.println("Aprovado: " + aluno.estaAprovado());

	}

}
