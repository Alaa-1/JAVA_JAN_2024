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
<span class="badge bg-success">${success }</span>


    <h1>Show CAR</h1>
    
    make: ${keyMake } <br>
    model: ${keyModel } <br>
    number: ${keyYear } <br>
    
    <p style="background-color: ${keyColor}"> color: ${keyColor }</p>
    
    <hr>
    <c:if test="${ keyYear < 2022}">
    <p>car is too old</p>
    </c:if>
</body>
</html>
