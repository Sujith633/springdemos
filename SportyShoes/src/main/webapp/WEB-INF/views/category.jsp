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
	<form action="category" method="post">
		<table border="1"
		style="border: 1px solid black; margin-left: auto; margin-right: auto;">
		<tr>
			<th>Id</th>
			<th>ProductName</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>

				<td>${product.name}</td>

				<td>${product.des}</td>

				<td>${product.price}
				<td>
			</tr>
		</c:forEach>
	</table>
		
	</form>

	<table border="1"
		style="border: 1px solid black; margin-left: auto; margin-right: auto;">
		<tr>
			<th>Id</th>
			<th>ProductName</th>
			<th>Category</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>

				<td>${product.name}</td>

				<td>${product.des}</td>

				<td>${product.price}
				<td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>