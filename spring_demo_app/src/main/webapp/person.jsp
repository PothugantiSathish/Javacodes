<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveperson" modelAttribute="personmodel">
Id <form:input path="id" /> <br>
Name <form:input path="name" /> <br>
<input type="submit">
</form:form>

</body>
</html>