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

  <form:form action="saveUser" modelAttribute="bankmodel">
  
  <form:input path="id" /> <br>
  <form:input path="name" /> <br>
  <form:input path="accno" /> <br>
  <form:input path="deposit" /> <br>
  
  <input type="submit">
  
  </form:form>

</body>
</html>