package br.com.loja;

import br.com.loja.dados.dao.ProdutoDAO;
import br.com.loja.modelo.Produto;

public class LojaApplication {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Memória RAM 4GB 2644MHz");
		produto.setPreco(198.00f);

		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(produto);
	}
}