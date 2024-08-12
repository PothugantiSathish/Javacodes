<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <table border="5">
      
        <tr>
           <td>Id</td>
           <td>Name</td>
           <td>Acc No</td>
           <td>Deposit</td>
           <td>PenaltyStatus</td>
           <td>Penalty</td>
           <td>Total Balance</td>
           
          <c:forEach var="user" items="${allusers}">
          
             <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.accno}</td>
                <td>${user.deposit}</td>
                <td>${user.penaltystatus}</td>
                <td>${user.penalty}</td>
                <td>${user.totalBalance}</td>
                <td>
                   <a href="delateuser?id=${user.id}">
                      <input type="submit" value="DELETE">
                   </a>
                </td>
                <td>
                  <a href="edituser?id=${user.id}">
                      <input type="submit" value="EDIT">
                   </a>
                </td>
             </tr>
          
          </c:forEach>
           
        </tr>
      </table>
      
      <br>
      
      <a href="createUser">CreatePerson</a>

</body>
</html>