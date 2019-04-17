<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>



<script type="text/javascript">

$(document).ready(function(){
	$("#uemail").change(function(){
		$.ajax({
			url:'check',
			data:{'mail':$("#uemail").val()},
			success:function(resp){
				$("#msg").text(resp);
				if(resp!='')
					{
						$("#uemail").val("");
						$("#uemail").focus();
					}
			}
		});
	});
});

</script>


</head>
<body>

<h2>Welcome to User Registration Page</h2>

<form action="reg" method="post">
<pre>

Name   : <input type="text" name="userName" id="uname" />

Email  : <input type="text" name="userEmail" id="uemail"/>
			<span id="msg" style="color:red"></span>

Password  : <input type="text" name="userPwd" id="upass"/>
Roles   :<input type="checkbox" name="userRoles" value="Admin" />Admin
		 <input type="checkbox" name="userRoles" value="Employee" />Employee
	
	<input type="submit" value="Register" />
</pre>

</form>

<i class="fa fa-car"></i>
<i class="fa fa-car" style="font-size:48px;"></i>
<i class="fa fa-car" style="font-size:60px;color:red;"></i>

${msg}

</body>
</html>