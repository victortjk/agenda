package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Usuario;

public class LoginDAO {

	private Connection connection;

	public LoginDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public LoginDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Usuario> getLista() {
		try {
			String sql = "select * from login";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			List<Usuario> users = new ArrayList<Usuario>();

			while (rs.next()) {
				Usuario user = new Usuario();
				user.setUsuario(rs.getString("usuario"));
				user.setSenha(rs.getString("senha"));
				users.add(user);
			}

			return users;

		} catch (SQLException e) {
			throw new RuntimeException("erro ao criar lista de usuários", e);
		}

	}
	
	
	public boolean valida(String usuario, String senha) {
		
		List<Usuario> lista = getLista();
		Iterator<Usuario> it = lista.iterator();
		boolean validado = false;
		
		while(it.hasNext()) {
			
			Usuario user = new Usuario();
			user = it.next();

			while(user.getUsuario().equals(usuario) && user.getSenha().equals(senha)) {
				validado = true;
				break;
			}
			
			
		}
		
		return validado;
		
	}
	
	
	
	
	
	
	
	
}
