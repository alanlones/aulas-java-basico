package br.com.loja.dados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.loja.dados.FabricaDeConexoes;
import br.com.loja.modelo.Produto;

public class ProdutoDAO {
	private Connection cn = null;

	public ProdutoDAO() {
		try {
			cn = new FabricaDeConexoes().obterConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void salvar(Produto produto) {
		try {
			PreparedStatement ps = cn.prepareStatement("INSERT INTO produto (nome, preco) VALUES (?,?)");
			ps.setString(1, produto.getNome());
			ps.setFloat(2, produto.getPreco());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
