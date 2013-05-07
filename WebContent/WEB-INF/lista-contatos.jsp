<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="/WEB-INF/cabecalho.jsp"/>
<table border="2">
	<tr>
		<td>Nome</td>
		<td>E-mail</td>
		<td>Endereço</td>
		<td>Data de Nascimento</td>
	</tr>
	<jsp:useBean id="dao" class="br.com.caelum.jdbc.dao.ContatoDAO" />
	<c:forEach var="contato" items="${dao.lista}" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0 ? 'ffcc33' : 'ffffff'}">
		<td>${contato.nome}</td>
		<td>
			<c:if test="${not empty contato.email}"><a href="mailto:${contato.email}">${contato.email}</a></c:if>
			<c:if test="${empty contato.email}">E-mail não informado</c:if>
		</td>
		<td>${contato.endereco}</td>
		<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
		<td><a href="mvc?logica=MostraAltera&id=${contato.id}">Alterar</a>
		<td><a href="mvc?logica=RemoveContato&id=${contato.id}">Remover</a>
	</tr>
	
	
	</c:forEach>
	
</table><br/>

<a href="mailto:${emails}">Enviar e-mail para todos</a> <br/><br/>

<a href="mvc?logica=RedirIndex">Voltar</a>
<c:import url="/WEB-INF/rodape.jsp"/>
</body>
</html>