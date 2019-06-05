<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
//
<%@page import="com.axelor.service.ContactServiceImpl,com.axelor.domains.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<%

ContactServiceImpl service=new ContactServiceImpl();

	List<ContactDetails> contactList=service.getAllcontacts();
	
	request.setAttribute("list",contactList);  

	
%>
<a href="index.jsp">Add Contact</a>

<h2>Contact List</h2>

<table>
  <tr>
    <th>No.</th>
    <th>Name</th>
    <th>Mobile No</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  
  <c:forEach items="${list}" var="u"> 
  
  
  <tr>
    <td>${u.getCid()}</td>
    <td>${u.getFullName()}</td>
    <td>${u.getMobileNo()}</td>
   <td><a href="contactbook?id=${u.getCid()}">Edit</a></td> 
   <td><a href="contactbook?id=${u.getCid()}">Delete</a></td> 
  </tr>
  
  </c:forEach>
  
</table>



</body>
</html>
