<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <%
    
    String id=request.getParameter("id");
    out.print("Record Id : "+id);
    %>
<!DOCTYPE html>
<html>
<body>

<h2>Add Contact</h2>

<form action="contactbook" method="post">
  Full name:<br>
  <input type="text" name="fullname" >
  <br>
  Mobile No:<br>
  <input type="text" name="mobileno" >
  <br><br>
  <input type="submit" value="Add">
</form> 

<a href="contactlist.jsp">View Contact List</a>




</body>
</html>
