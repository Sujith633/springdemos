<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reguest</title>
</head>
<body>
	<form action="products" method="post">
		<pre>
<h1>Manage Products</h1>
Name:<input type="text" name="name">
Description:<input type="text" name="des">
Price:<input type="text" name="price">
Status:<input type="text" name="status">
<input type="submit" name="Add product">

</pre>
	</form>

	<p>${message}</p>
	<ul>
		<c:forEach items="${products}" var="product">
			<li>${product.id}| ${product.name} | ${product.des} | ${product.price} | | ${product.status}</li>
		</c:forEach>
	</ul>
</body>
</html>