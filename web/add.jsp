<%-- 
    Document   : add
    Created on : Jan 23, 2024, 4:06:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add!</h1>
        <form method="post" action="add">
            Age:<input type="number" name="age"><br>
            First_name:<input type="text" name="first"><br/>
            Last_name:<input type="text" name="last"><br/>
            <input type="submit" name="Add">
        </form>
    </body>
</html>
