<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div style="text-align:center">
	<h1>
		Select which distribution
	</h1>
	<form method="post" action="SelectDistribution">
	<br>
	<select name="disType" size="1">
	
		<option>Bernoulli</option>
		<option>Binomial</option>
		<option>Geometric</option>
		<option>Negative Binomial</option>
		<option>Poisson</option>
		<option>Uniform</option>
		<option>Exponential</option>
	
	
	</select>
	<br><br>
	<input type="submit">
 </form>
</div>
</body>
</html>