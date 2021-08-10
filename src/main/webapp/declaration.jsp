<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Declaration</title>
</head>
<body>
<h1>JSP Declaration</h1>

<p>As compared to Scriptlet, Scriptlet does not recognize method.</p>
<p>The differences of writing declaration is to add exclaimation mark after the opening % sign</p>
<br>

<%!
    int add(int a, int b){
        return a+b;
    }

    int subtract(int a, int b){
        return a-b;
    }
%>
<p>The method add and subtract are declared in the JSP file, and the following shows the results.</p>
<p>The result of 80 + 8: <%= add(80, 8) %></p>
<p>The result of 129 - 1: <%= subtract(129, 1) %></p>

<br>
<%!
    String name = "Chen Le";
    int age = 24;

    String nameAge(){
        return "I am " + name + " and I am " + age + " years old";
    }
%>
<p>The method nameAge is called, and it returns the following line.</p>
<%= nameAge() %>


</body>
</html>