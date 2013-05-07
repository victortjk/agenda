<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="css/jquery.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<c:import url="/WEB-INF/cabecalho.jsp"/>

<form action="mvc" method="post">
		Id: <input type="text" name="id" value="${id}" readonly/><br/>
		Nome: <input type="text" name="nome" value="${nome}" /><br/>
		E-mail: <input type="text" name="email" value="${email }" /><br/>
		Endereço: <input type="text" name="endereco" value="${endereco }"/><br/>
		Data de nascimento: <caelum:mostraData id="dataNascimento" /><br/>
		
		<input type="hidden" name="logica" value="AdicionaAlteraContato"/>
		<input type="submit" value="Gravar"/>
	
	</form>





<c:import url="/WEB-INF/rodape.jsp"/>
</body>
</html>