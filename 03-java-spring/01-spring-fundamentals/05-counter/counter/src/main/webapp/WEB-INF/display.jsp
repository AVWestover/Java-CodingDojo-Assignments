<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Current visit counter</title>
	<!-- bootstrap link -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container items-align-center">
		<h2> You have visited <a>http://localhost:8080</a> <c:out value="${count}"></c:out> times.</h2>
		<h2> <a href="/" class="pe-auto">Test another visit?</a> </h2>
	</div>
</body>
