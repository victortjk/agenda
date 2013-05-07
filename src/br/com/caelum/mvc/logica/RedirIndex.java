package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirIndex implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {
		
		return "/WEB-INF/index.jsp";
	
	}

}
