<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false" %>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Getting data from Model From Controller</h2>
 
 Primitive type :${eid} <hr/>
 Object type : ${emp} <hr/>
 Object type but individual : ${emp.empId } ,${emp.empName } , ${emp.empSal }
 <hr/>
 Collection type :  ${emplist} <br/>
 or :
 <c:forEach items="${emplist}" var="e">
 	${e.empId},
 	${e.empName},
 	${e.empSal} 
 	<br/>
 </c:forEach>
 
</body>
</html>