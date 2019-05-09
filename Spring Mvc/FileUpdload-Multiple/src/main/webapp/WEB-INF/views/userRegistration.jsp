<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to user Registration page</h2>


	<form:form action="save" method="post" modelAttribute="user"
		enctype="multipart/form-data">
		<pre>

Name   : <form:input path="userName" />
Email  : <form:input path="userEmail" />
Password  : <form:input path="userPwd" />
Image     :<input type="file" name="uImage" />
Sign    :<input type="file" name="uSign" />

	<input type="submit" value="Register" />
</pre>

	</form:form>
	${msg}


<a href="all" >View All</a>

</body>
</html>