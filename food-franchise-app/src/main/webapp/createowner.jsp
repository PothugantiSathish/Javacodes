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
<form:form action="saveOwner" modelAttribute="owner">
  
  <form:input path="id" placeholder="enter id"/> <br>
  <form:input path="name" placeholder="enter name" /> <br>
  <form:input path="email" placeholder="enter email"/> <br>
  <form:input path="password" placeholder="enter password" /> <br>
  
  <input type="submit">
  
  </form:form>

</body>
</html>