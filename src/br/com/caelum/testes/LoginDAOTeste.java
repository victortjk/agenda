package br.com.caelum.testes;

import java.util.List;

import br.com.caelum.jdbc.dao.LoginDAO;
import br.com.caelum.jdbc.modelo.Usuario;

public class LoginDAOTeste {
	public static void main(String[] args) {

		
		LoginDAO dao = new LoginDAO();
		List<Usuario> lista = dao.getLista();
		
		for(Usuario user : lista) {
			System.out.println(user.getSenha());
		}
		
	}
}
