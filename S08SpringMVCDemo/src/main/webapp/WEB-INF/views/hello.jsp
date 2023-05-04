<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the spring MVC</h1>

<%
out.println("Id: "+request.getAttribute("id")+"<br/>");
out.println("name: "+request.getAttribute("name")+"<br/>");
out.println("Salary: "+request.getAttribute("salary")+"<br/>");

%>
<p>ID:<b>${id}</b></p>
<p>Name:<b>${name}</b></p>
<p>Salary:<b>${salary}</b></p>


<p>Salary:<b>${employee}</b></p>
</body>
</html>