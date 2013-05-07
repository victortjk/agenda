<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<c:import url="/WEB-INF/cabecalho.jsp" />

<h2>Login</h2>

<form action="mvc" method="post">
	Usuário: <input type="text" name="usuario" /><br/>
	Senha:   <input type="password" name="senha" /><br/><br/>
	
	<input type="hidden" name="logica" value="Valida" />
	<input type="submit" value="Validar" />




</form>








<c:import url="/WEB-INF/rodape.jsp" />
</body>
</html>