<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <h1>Login</h1>
    <form action="/processForm" method="POST">
    <label>Email:</label>
    <input name="email" >
    
    <label>Password:</label>
    <input name="password" type="password" >
    <button>submit</button>
    </form>
</body>
</html>
