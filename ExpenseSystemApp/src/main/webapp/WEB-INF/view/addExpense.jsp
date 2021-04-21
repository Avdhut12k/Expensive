<%@include file="includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter all Details</title>
</head>
<body>

	<div align="center">
		<form:form action="processExpense" method="POST" commandName="expense">

			<table>

				<tr>
					<td>Enter Id</td>
					<td><form:input path="expenseId" /></td>
				</tr>

				<tr>
					<td>Enter product name</td>
					<td><form:input path="productname" /></td>
				</tr>


				<tr>
					<td>Enter Category</td>
					<td><form:input path="category" /></td>
				</tr>

				<tr>
					<td>Enter Price</td>
					<td><form:input path="price" /></td>
				</tr>

				<tr>
					<td><input type="submit" name="action" value="Add"> <input
						type="submit" name="action" value="edit"> <input
						type="submit" name="action" value="delete"> <input
						type="submit" name="action" value="upate"></td>
				</tr>


			</table>
		</form:form>
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