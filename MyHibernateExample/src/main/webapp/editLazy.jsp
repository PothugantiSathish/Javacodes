<%@page import="com.uno.Lazyguy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Lazyguy dto=(Lazyguy)session.getAttribute("mdto");
%>

<form action="editLazy" method="post">
<input type="number" value="<%=dto.getId() %>" readonly="readonly" name="id"><br>
<input type="text" value="<%=dto.getName() %>" readonly="readonly" name="name"><br>
<input type="submit" value="update">

</form>

</body>
</html>