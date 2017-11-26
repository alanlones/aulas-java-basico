package br.com.biblioteca.model;

public class Autor {

	// Obrigatório
	private String nome;
	// 11 Dígitos
	private String cpf;
	// Possuir @
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean nomeEhValido() {
		boolean nomeNulo = nome == null;
		if (nomeNulo)
			return false;
		else {
			boolean nomeEmBranco = nome.isEmpty();
			if (nomeEmBranco)
				return false;
			else
				return true;
		}
	}

	public boolean cpfEhValido() {
		boolean cpfNulo = cpf == null;
		if (cpfNulo)
			return true;
		else {
			boolean cpfTem11Digitos = cpf.length() == 11;
			if (!cpfTem11Digitos)
				return false;
			else
				return true;
		}
	}

	public boolean emailEhValido() {
		boolean emailNulo = email == null;
		if (emailNulo)
			return true;
		else {
			boolean emailContemArroba = email.contains("@");
			if (!emailContemArroba)
				return false;
			else
				return true;
		}
	}

	public boolean ehValido() {
		return nomeEhValido() && cpfEhValido() && emailEhValido();
	}

}
