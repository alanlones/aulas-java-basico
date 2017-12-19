package br.com.loja.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	private final String URL = "jdbc:mysql://devtools:3306/loja?useSSL=false";
	private final String USUARIO = "admin";
	private final String SENHA = "admin";

	public Connection obterConexao() throws SQLException {
		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}
}
