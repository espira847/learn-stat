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
	<%
	List results = (List) request.getAttribute("parameters");
	
	
	out.println("<br> a Value : " + results.get(0));
	out.println("<br> b Value : " + results.get(1));
	out.println("<br> Expected Value E(X) : " + results.get(2));
	out.println("<br> Variance : " + results.get(3));
	%>

</div>
</body>
</html>