<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Student</title>
</head>
<body>
<h2> <spring:message code="title"/> </h2>


<a href=?lang=en>English</a> &nbsp; | &nbsp;<a href=?lang=hi>Hindi</a> &nbsp; | &nbsp;<a href=?lang=te >Telugu</a>

<form:form action="save" method="post" modelAttribute="student">
<pre>

<spring:message code="name"/>  		: <form:input path="stdName"/>
				<form:errors path="stdName" />
				
<spring:message code="course"/> 		: <form:select path="stdCourse">
					<form:option value="">--Select--</form:option>
					<form:option value="CJ">Cj</form:option>
					<form:option value="CJ">Aj</form:option>
					<form:option value="SPRING">Spring</form:option>
					<form:option value="HIBERNATE">Hibernate</form:option>
	   		 </form:select>
	   		 <form:errors path="stdCourse" />
	   		 
<spring:message code="email"/>  		: <form:input path="stdEmail"/>
				<form:errors path="stdEmail" />
				
<spring:message code="password"/>  	 : <form:input path="stdPwd"/>
				<form:errors path="stdPwd" />
				
<spring:message code="lang"/>  	 :<form:checkbox path="stdLangs" value="English" />English
			 <form:checkbox path="stdLangs" value="Hindi" />Hindi
			 <form:checkbox path="stdLangs" value="Tamil" />Tamil
			 <form:checkbox path="stdLangs" value="Telugu" />Telugu
<form:errors path="stdLangs" />
			 
<spring:message code="add"/>		:<form:textarea path="stdAddr" />
				<form:errors path="stdAddr" />
				
	<input type="submit" value="Register" />
</pre>

</form:form>
${msg}

</body>
</html>