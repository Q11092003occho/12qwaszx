<%-- 
    Document   : edit
    Created on : Jan 24, 2024, 3:47:29 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <h1>Edit!</h1>
        <form method="post" action="edit">
            Update where ID:<input type="number" value="${person.id}" name="id" readonly ><br>
            Age:<input type="number" name="age" value="${person.age}" required><br>
            First_name:<input type="text" name="first" value="${person.first}" required><br/>
            Last_name:<input type="text" name="last" value="${person.last}" required><br/>
            <input type="submit" name="Edit">
        </form>
    </body>
</html>
<a href="../src/java/dal/PersonDao.java"></a>