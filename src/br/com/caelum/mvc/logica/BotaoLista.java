package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BotaoLista implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {
		return "/WEB-INF/lista-contatos.jsp";
	}
	
}
