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
	<style type="text/css">
		.boldu{
			font-weight: bold;
			text-decoration: underline;
		}
	</style>
</head>
<body>
	<div class="container items-align-center">
		<h3 class="boldu">Submitted info</h3>
		<p>Name: 				<c:out value="${name}"></c:out></p>
		<p>Dojo Location: 		<c:out value="${location}"></c:out></p>
		<p>Favorite Language:   <c:out value="${language}"></c:out><p>
		<p>Comment: 			<c:out value="${comment}"></c:out></p>
	</div>
	<form method="POST" action="/back">
		<button class="btn btn-secondary">Back</button>
	</form>
</body>
