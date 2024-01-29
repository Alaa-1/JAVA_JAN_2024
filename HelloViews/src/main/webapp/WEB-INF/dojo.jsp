<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Dojos List</h1>
<ul>
<c:forEach items="${dojoList }" var="oneDojo">
<c:if test="${oneDojo.name  == 'Ghazala'}">
<h4>Welcome to Tunisia !</h4>
</c:if> 	
<li> <c:out value="${oneDojo.name }"/> </li>
</c:forEach>


</ul>
</body>
</html>