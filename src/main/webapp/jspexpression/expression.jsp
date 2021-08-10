<!DOCTYPE html>
<%@ page import="java.util.Date" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1>JSP Expression</h1>


<p>Calling a method - Math.addExact(2,3): <%= Math.addExact(2,3)%></p>

<p>Calling a boolean if the length of ADA is less than 5: <%= ("ada").length() < 5 %></p>

<p>Math Expression using add and multiply: <%= (33*2+22) %></p>

<p>Java Object calling new Date(): <%= new Date() %> </p>

<br><br>

<p>The results are all implicitly converted into String after the calling.</p>
</body>
</html>
