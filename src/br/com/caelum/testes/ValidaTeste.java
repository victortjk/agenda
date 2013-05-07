package br.com.caelum.testes;

import br.com.caelum.jdbc.dao.LoginDAO;

public class ValidaTeste {
	public static void main(String[] args) {
		LoginDAO dao = new LoginDAO();
		System.out.println(dao.valida("user", "admin1"));
	}
}
