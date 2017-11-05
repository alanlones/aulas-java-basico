package br.com.ciladalogistica.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ciladalogistica.model.Motorista;

public class MotoristaRepository {
	private List<Motorista> motoristas = new ArrayList<>();

	public void addMotorista(Motorista motorista) {
		this.motoristas.add(motorista);
	}

	public void removeMotorista(Motorista motorista) {
		this.motoristas.remove(motorista);
	}

	public List<Motorista> buscaPorNome(String nome) {
		List<Motorista> resultado = new ArrayList<>();

		for(Motorista m : this.motoristas) {
			if(m.getNome().toLowerCase().contains(nome.toLowerCase()))
				resultado.add(m);
		}
		
		return resultado;
	}
	
	public List<Motorista> buscaPorSalarioMaiorQue(float salario) {
		List<Motorista> resultado = new ArrayList<>();

		for(Motorista m : this.motoristas) {
			if(m.getSalario() > salario)
				resultado.add(m);
		}
		
		return resultado;
	}
}
