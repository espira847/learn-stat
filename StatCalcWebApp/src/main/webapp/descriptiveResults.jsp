<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div style="text-align:center">
	<h1>
	Results
	</h1>
	
	List results = (List) request.getAttribute("parameters");
	
	
	out.println("<br> Mean : " + results.get(0));
	out.println("<br> Variance : " + results.get(1));
	out.println("<br> Standard Deviation : " + results.get(2));
	out.println("<br> Q0 : " + results.get(3));
	out.println("<br> Q1 : " + results.get(4));
	out.println("<br> Q2 : " + results.get(5));
	out.println("<br> Q3 : " + results.get(6));
	out.println("<br> Q4 : " + results.get(7));
	

</div>

</body>
</html>