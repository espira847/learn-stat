<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div style="text-align:center">
	<form action="descriptiveResults.jsp" method="post">
	<label for="data">Enter your data : </label>
	<input type="number" id="data" name="data" step="any" min="0"/>
	<input type="reset" name="add" value="add" onclick="add">
	<br> <br>
	<input type="submit" value="Submit">
	</form>

</div>

</body>
</html>