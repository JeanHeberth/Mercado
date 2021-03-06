package br.com.mercado.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "";

	public static Connection conectar() throws SQLException {
		DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	public static void main(String[] args) {
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("Conex�oFactory realizado com sucesso!");
		} catch (SQLException ex) {
			System.out.println("ErroFactory na conex�o!");
		}
	}

}
