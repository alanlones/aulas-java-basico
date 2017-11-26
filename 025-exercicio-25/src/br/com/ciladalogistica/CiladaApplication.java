package br.com.ciladalogistica;

import java.time.LocalDate;

import br.com.ciladalogistica.model.Caminhao;
import br.com.ciladalogistica.model.Carga;
import br.com.ciladalogistica.model.Destinatario;
import br.com.ciladalogistica.model.Endereco;
import br.com.ciladalogistica.model.Entrega;
import br.com.ciladalogistica.model.Motorista;

public class CiladaApplication {

	// private static MotoristaRepository motoristas = new MotoristaRepository();

	public static void main(String[] args) {
		Motorista bino = new Motorista("116633", "Bino", 4500f);
		// Motorista cino = new Motorista("126734", "Cino", 2000f);

		/*
		 * motoristas.addMotorista(bino); motoristas.addMotorista(cino);
		 * 
		 * System.out.println(motoristas.buscaPorNome("c"));
		 * System.out.println(motoristas.buscaPorSalarioMaiorQue(3000));
		 */

		Caminhao caminhao = new Caminhao("LKC-1896", "Volvo", "V57", 18000);
		Destinatario max = new Destinatario("Max", "127927366-77",
				new Endereco("Rua Humaita", "S/N", "25576-130", "Vila São João", "São João de Meriti", "RJ"));
		Endereco enderecoColeta = new Endereco("Praça 22 de abril", "36", "20021-370", "Castelo", "Rio de Janeiro",
				"RJ");
		Carga cargaDePCs = new Carga("Computadores", 3000f, "unidade", 2f);
		Carga cargaDeMesas = new Carga("Mesas", 500f, "unidade", 8f);
		Carga cargaDeFitas = new Carga("Fitas LTO6", 200, "unidade", 0.05f);
		Carga cargaDeQuintinos = new Carga("Quintinos", 50, "unidade", 300);
		Entrega entrega = new Entrega(1, LocalDate.now(), null, caminhao, bino, enderecoColeta, max);
		entrega.addCarga(cargaDePCs);
		entrega.addCarga(cargaDeFitas);
		entrega.addCarga(cargaDeMesas);
		entrega.addCarga(cargaDeQuintinos);
		entrega.imprimirRelatorio();
	}

}
