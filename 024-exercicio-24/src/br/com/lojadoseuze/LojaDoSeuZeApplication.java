package br.com.lojadoseuze;

import br.com.lojadoseuze.model.Cliente;
import br.com.lojadoseuze.model.Compra;
import br.com.lojadoseuze.model.Produto;
import br.com.lojadoseuze.model.Vendedor;

public class LojaDoSeuZeApplication {

	public static void main(String[] args) {
		Produto p1 = new Produto("P001", "Caderno 200fl", "Papelaria", 17.80f, "");
		Produto p2 = new Produto("P002", "Lápis Preto Nº2", "Papelaria", 0.80f, "");
		Produto p3 = new Produto("P003", "Roteador Wireless", "Eletrônicos", 64.90f, "");
		Produto p4 = new Produto("P001", "Pen Drive 32GB", "Eletrônicos", 59.90f, "");

		Vendedor v1 = new Vendedor("José Lima", "121.262.773-30", 1800.0f);

		Cliente c1 = new Cliente("Julia Marques", "941.348.797-95");

		Compra compra = new Compra();
		compra.setCliente(c1);
		compra.setVendedor(v1);
		compra.addProduto(p1, 2);
		compra.addProduto(p2, 15);
		compra.addProduto(p3, 1);
		compra.addProduto(p4, 1);
		compra.imprimirRelatorio();

	}

}
