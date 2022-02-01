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
		<h3> What is the code?</h3>
		<form method="POST" action="/login">
			<label>Your Name: <input type="text" name="name"></label>
			<label for="location">Dojo Location</label>
			<select name="location">
				<option>San Jose<option>
				<option>Chicago</option>
				<option>Other</option>
			</select>
			<label for="language">Favorite Language:</label>
			<select name="language">
				<option>Python</option>
				<option>HTML</option>
				<option>Java</option>
				<option>CSS</option>
				<option>MERN</option>
			</select>
			<p> Comment (optional):</p>
			<textarea name="comment" rows="40" cols="4">-</textarea>
			<button class="btn btn-secondary">Submit</button>
		</form>
	</div>
	
</body>
