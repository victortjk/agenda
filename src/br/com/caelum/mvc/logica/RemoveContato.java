package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class RemoveContato implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(id);
		dao.remove(contato);
		
		
		
		return "/WEB-INF/lista-contatos.jsp";
	}
	
}
