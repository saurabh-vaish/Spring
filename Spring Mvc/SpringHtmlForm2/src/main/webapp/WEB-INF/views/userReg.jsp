<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to User Registration Page</h2>

<form action="reg" method="post">
<pre>

Name   : <input type="text" name="userName"/>
Email  : <input type="text" name="userEmail"/>
Password  : <input type="text" name="userPwd"/>
Roles   :<input type="checkbox" name="userRoles" value="Admin" />Admin
		 <input type="checkbox" name="userRoles" value="Employee" />Employee
	
	<input type="submit" value="Register" />
</pre>

</form>

${msg}

</body>
</html>