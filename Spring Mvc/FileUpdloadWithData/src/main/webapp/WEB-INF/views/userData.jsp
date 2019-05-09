<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to user Registration page</h2>

<pre>

<div >
	<img src=" ${user.userFileData }" width="100" height=100 />
</div>

<div>

Name   : ${user.userName }
Email  : ${user.userEmail }
FileName : ${user.userFileName }
File    :  ${user.userFileData }

</div>

</pre>

${msg}

</body>
</html>