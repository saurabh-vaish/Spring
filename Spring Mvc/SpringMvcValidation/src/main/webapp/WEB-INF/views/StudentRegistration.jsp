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


<form:form action="save" method="post" modelAttribute="student">
<pre>

Name   		: <form:input path="stdName"/>
				<form:errors path="stdName" />
				
Course 		: <form:select path="stdCourse">
					<form:option value="">--Select--</form:option>
					<form:option value="CJ">Cj</form:option>
					<form:option value="CJ">Aj</form:option>
					<form:option value="SPRING">Spring</form:option>
					<form:option value="HIBERNATE">Hibernate</form:option>
	   		 </form:select>
	   		 <form:errors path="stdCourse" />
	   		 
Email  		: <form:input path="stdEmail"/>
				<form:errors path="stdEmail" />
				
Password   	 : <form:input path="stdPwd"/>
				<form:errors path="stdPwd" />
				
Languages  	 :<form:checkbox path="stdLangs" value="English" />English
			 <form:checkbox path="stdLangs" value="Hindi" />Hindi
			 <form:checkbox path="stdLangs" value="Tamil" />Tamil
			 <form:checkbox path="stdLangs" value="Telugu" />Telugu
			 <form:errors path="stdLangs" />
			 
Address		:<form:textarea path="stdAddr" />
				<form:errors path="stdAddr" />
				
	<input type="submit" value="Register" />
</pre>

</form:form>
${msg}

</body>
</html>