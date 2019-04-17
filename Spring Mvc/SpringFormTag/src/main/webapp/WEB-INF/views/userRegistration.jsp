<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to user Registration page</h2>


<form:form action="save" method="post" modelAttribute="user">
<pre>

Name   : <form:input path="userName"/>
Email  : <form:input path="userEmail"/>
Password  : <form:input path="userPwd"/>
Roles   :<form:checkbox path="userRoles" value="Admin" />Admin
		<form:checkbox path="userRoles" value="Employee" />Employee
	
	<input type="submit" value="Register" />
</pre>

</form:form>
${msg}

</body>
</html>