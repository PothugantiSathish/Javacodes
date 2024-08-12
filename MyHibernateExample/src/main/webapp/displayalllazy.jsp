<%@page import="com.uno.Lazyguy"%>
<%@page import="com.uno.LazyDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>All lazy data</h1>
<%
LazyDao dao=new LazyDao();

ArrayList<Lazyguy> al=(ArrayList<Lazyguy>)dao.getAll();
%>

<table border="5">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th colspan="2">
        </th>
    </tr>
    <%for(Lazyguy l:al){%>
    
    <tr>
        <td><%=l.getId() %></td>
        <td><%=l.getName() %></td>
        <td>
        <a href="deleteLazy?id=<%= l.getId()%>">
           <input type="submit" value="DELETE">
        </a>
        </td>
        
        <td>
        <a href="editLazy?id=<%= l.getId()%>">
           <input type="submit" value="EDIT">
        </a>
        </td>
    </tr>
    <%}%>

</table>

<br>  <br>
<h2>
    <a href="lazy">
      Create Lazyguy
    
    </a>
</h2>

</body>
</html>