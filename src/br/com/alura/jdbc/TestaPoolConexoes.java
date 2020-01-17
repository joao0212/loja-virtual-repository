package br.com.alura.jdbc;

import java.sql.SQLException;
import br.com.alura.jdbc.factory.ConnectionFactory;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		for(int i=0; i<20; i++) {
			factory.recuperarConexao();
			System.out.println("Criada conexao número " + i);
		}
	}
}
