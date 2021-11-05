<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Negative Binomial</title>
</head>
<body>
	<label for="p">Enter the value of p : </label>
	<form action="NegBinomial" method="post">
	<input type="number" id="p" name="p" step="any" min="0" max="1"  />
	
	
	<br><br>
	
	<label for="n">Enter the value of n : </label>
	<br>
	<form action="NegBinomial" method="post">
	<input type="number" id="n" name="n" min="0" />
	
	
	<br>
	<input type="submit" value="Submit">
	</form>

</body>
</html>