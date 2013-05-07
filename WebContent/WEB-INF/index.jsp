<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<c:import url="/WEB-INF/cabecalho.jsp"/>


<h3>Selecione a função desejada:</h3>

<form action="mvc" method="post">
<input type="hidden" name="logica" value="BotaoLista"/>
<input type="submit" value="Lista de contatos"/>
</form>

<form action="mvc" method="post">
<input type="hidden" name="logica" value="BotaoAdicionar"/>
<input type="submit" value="Adicionar contatos"/>
</form>


<!-- <a href="/WEB-INF/lista-contatos.jsp">- Ver lista de contatos</a>  pq nao rola, se o import rola com web-inf? -->






<c:import url="/WEB-INF/rodape.jsp"/>
</body>
</html>