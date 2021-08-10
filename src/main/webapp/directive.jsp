<%@ page import = "main.servlet.MathMethod" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Declaration</title>
</head>
<body>
<%@ include file="header.jsp" %>

<h1>JSP Directive</h1>

<p>As compared to Declaration, Directive tag allows us to import classes. The method can be declared in java file and use in jsp file.</p>
<br>

<p>The method add and subtract are declared in the MathMethod class, and it is imported in the JSP file.</p>
<p>The result of 80 + 8: <%= MathMethod.add(80, 8) %></p>
<p>The result of 129 - 1: <%= MathMethod.subtract(129, 1) %></p>

<br>

<%@ include file="footer.jsp" %>

</body>
</html>