package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class AdicionaAlteraContato implements Logica {
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {
		
		 String numero = request.getParameter("id");
		 String nome = request.getParameter("nome");
		 String endereco = request.getParameter("endereco");
		 String email = request.getParameter("email");
		 String dataEmTexto = request.getParameter("dataNascimento");
		 Calendar dataNascimento = null;
		 
		 try{
			 Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			 dataNascimento = Calendar.getInstance();
			 dataNascimento.setTime(date);
		 } catch(ParseException e) {
			 System.out.println("Erro na conversão de data");
			 //return;		// como a exception foi "pega" volta para o fluxo(exibir a msg acima), senão o thread morre.
		 }
	 
		 Contato contato = new Contato();
		 contato.setNome(nome);
		 contato.setEndereco(endereco);
		 contato.setEmail(email);
		 contato.setDataNascimento(dataNascimento);
		 
		 Connection connection = (Connection) request.getAttribute("conexao");
		 ContatoDAO dao = new ContatoDAO(connection);
		 
		 if(numero.equals("")) {
			 dao.adiciona(contato);
			 return "/WEB-INF/contato-adicionado.jsp";
		 } else {
			 Long id = Long.parseLong(numero);
			 contato.setId(id);
			 dao.altera(contato);
			 return "/WEB-INF/lista-contatos.jsp";
		 }
	
	
	}

}
