<html>
<head>
<title>Hello World</title>
</head>
<body>
<%-- This is how we comment in JSP --%>
<h1>JSP Scriptlet Tags</h1>

<p>These are how we inject multiple lines of Java code into the JSP to do things like if statements, call methods, or whatever you need.</p>

<br><br>

<%
    double principal = 1000;
    double rate = 0.10;
    double interest = principal*rate;
%>
<p>The total interest will be: <%= interest %></p>

<%
    if (1+1 == 2){ %>
        <p>1 + 1 = 2</p> <%
    } else { %>
        <p>This is wrong!</p> <%
    }
%>

<ul>
    <%
    for (int i = 1; i <= 25; i++){ %>
        <li>Listing # <%= i %></li> <%
    }
    %>

</ul>

</body>
</html>