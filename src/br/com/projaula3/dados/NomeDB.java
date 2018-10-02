package br.com.projaula3.dados;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projaula3.util.Conexao;
import br.com.projaula3.entidade.Nome;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NomeDB {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public NomeDB() {
		connection = Conexao.getConnection();
	}

	public boolean insert(Nome nome) throws SQLException {
		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("insert into nome (nome) values (?)");

			stmt.setString(1, nome.getNome());
		
		stmt.execute();
		return true;
    } catch (SQLException e) {
		System.err.println(e.toString());
	} finally {
		connection.close();
	}
	return false;
		}
	}	
