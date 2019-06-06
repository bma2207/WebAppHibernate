<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
   
<!DOCTYPE html>
<html>
<body>

<h2>Contact Detail</h2>

<form action="contactbook" method="post">
  Contact Id:<br>
  <input type="text" name="contactid"  readonly="readonly"
  value='<c:out value="${ContactDetailObj.getCid()}"></c:out>'
  >
  <br>
  Full name:<br>
  <input type="text" name="fullname" 
  value='<c:out value="${ContactDetailObj.getFullName()}"></c:out>'
  >
  <br>
  Mobile No:<br>
  <input type="text" name="mobileno" 
  value='<c:out value="${ContactDetailObj.getMobileNo()}"></c:out>'
  >
  <br><br>
  <input type="submit" value="Add">
</form> 

<a href="contactbook?action=listContact">View Contact List</a>




</body>
</html>
