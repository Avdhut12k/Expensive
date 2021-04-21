<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter all Details</title>
</head>
<body>

	<div align="center">
		<table>
			<form:form action="processExpense" method="POST"
				commandName="expense">

				<tr>
					<td>Enter Id</td>
					<form:input path="expenseId" />
				</tr>

				<tr>
					<td>Enter product name</td>
					<form:input path="productname" />
				</tr>


				<tr>
					<td>Enter Category</td>
					<form:input path="category" />
				</tr>

				<tr>
					<td>Enter Price</td>
					<form:input path="price" />
				</tr>

				<tr>
					<td><input type="submit" name="action" value="Add"> <input
						type="submit" name="action" value="edit"> <input
						type="submit" name="action" value="delete"> <input
						type="submit" name="action" value="upate"></td>
				</tr>

			</form:form>
		</table>

	</div>



	<table border="1">

		<th>Id</th>
		<th>ProductName</th>
		<th>Category</th>
		<th>Price</th>

		<c:forEach items="${expenseList}" var="expenseItem">
			<tr>
				<td>${expenseItem.expenseId}</td>
				<td>${expenseItem.productname}</td>

				<td>${expenseItem.category}</td>

				<td>${expenseItem.price}</td>

			</tr>
		</c:forEach>




	</table>



</body>
</html>