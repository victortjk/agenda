package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.LoginDAO;

public class Valida implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {

		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Connection connection = (Connection) request.getAttribute("conexao");
		LoginDAO dao = new LoginDAO(connection);
		
		if(dao.valida(usuario, senha)) {
			return "/WEB-INF/index.jsp";
		} else {
			return "/WEB-INF/usuario-senha-incorreta.jsp";
		}
	
	}
	
}
