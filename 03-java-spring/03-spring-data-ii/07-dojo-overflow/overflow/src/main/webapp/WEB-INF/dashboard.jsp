<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!--  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Dashboard</title>
	<!-- bootstrap link -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<!-- My CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!--  -->
</head>
<body>
<!-- nav bar -->
<nav class="navbar navbar-expand-xl navbar-dark bg-dark" id="nav-bar">
	<div class="collapse navbar-collapse show" id="navbarDark">
		<ul class="navbar-nav me-auto mb-2 mb-xl-0">
			<li class="nav-item">
				<a class="nav-link active" aria-current="page" href="/questions">Home</a>
			</li>
		</ul>
	</div>
</nav>
<!--  -->
<div id="outside-all">
<div id="dashboard-outside-cont">
	<div>
		<h2>Questions Dashboard</h2>
	</div>
	<!-- Table -->
	<table class="table table-sm table-bordered table-striped" id = "dashboard-table">
    <thead>
        <tr>
            <th  scope="col">Question</th>
            <th  scope="col">Tags</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${questions}" var="question">
        <tr>
            <td><a href="/questions/${question.id}"><c:out value="${question.questionText}"/></a></td>
            <td>  
            	<c:forEach items="${ question.tags }" var="tag">
                	<c:out value="${ tag.subject },"/>
                </c:forEach>
            </td>
		</tr>
        </c:forEach>
    </tbody>
	</table> 
	<!-- New Question Box -->
	<div id="new-q-cont">
		<a href="/questions/new">New Question</a>
	</div>
</div>
</div>
</body>
