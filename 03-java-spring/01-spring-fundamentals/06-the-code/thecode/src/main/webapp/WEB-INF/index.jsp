<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
	<!-- bootstrap link -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container items-align-center">
		<p class="text-danger"> <c:out value="${errors}"></c:out> </p>
		<h3> What is the code?</h3>
		<form method="POST" action="/trycode">
			<input type="text" name="code">
			<button class="btn btn-secondary">Try Code</button>
		</form>
	</div>
	
</body>
