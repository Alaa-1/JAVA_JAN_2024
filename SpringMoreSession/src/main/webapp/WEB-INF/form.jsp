<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        
    </head>
<body>
    <div class="container">
    <h1>Form 🚗</h1>
    <h1>Form - CARS </h1>
	<h4>${yearError }</h4>
	<form action="/processCar" method="POST">
		make: <br />
		<input name="make" /> <br />
		<br />
		
		model: <br />
		<input name="model" /> <br />
		<br />
		
		year: <br />
		<input type="number" name="year" /> <br />
		<br />
		
		color: <br />
		<input type="color" name="color" />
		
		<button>create car</button>
	</form>
    
    </div>
</body>
</html>
