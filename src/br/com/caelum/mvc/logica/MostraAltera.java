package br.com.caelum.mvc.logica;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;


public class MostraAltera implements Logica {
		
		@Override
		public String executa(HttpServletRequest request,
				HttpServletResponse response) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			ContatoDAO dao = new ContatoDAO();
			Contato contato = dao.getContato(id);
			
			
			request.setAttribute("nome", contato.getNome());
			request.setAttribute("id", id);
			request.setAttribute("email", contato.getEmail());
			request.setAttribute("endereco", contato.getEndereco());
			request.setAttribute("dataNascimento", new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTimeInMillis()));
			
			return "/WEB-INF/mostra-altera-contato.jsp";
			
		
		}
	
	}

