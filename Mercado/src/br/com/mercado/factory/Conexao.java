package br.com.mercado.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("");
			System.out.println("ConectadoConexao com sucesso!");
		} catch (SQLException ex) {
			System.out.println("Falha na conexão!");
		}
		return conn;
	}

	public static void main(String[] args) {

		Conexao.getConexao();
	}

}
