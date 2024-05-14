<%-- 
    Document   : list
    Created on : Jan 23, 2024, 4:06:26 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
        <style>
            a{
                text-decoration: none;
                
            }
            button{
                display: flex;
                justify-content: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <h1>List!</h1>
        
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Age</th>
                        <th>FullName</th>
                        <th>Update</th>
                        <th>Delete</th>
                        
                    </tr>
                </thead>
                <tbody><c:forEach items="${list}" var="person">
                    <tr>
                        <td>${person.id}</td>
                        <td>${person.age}</td>
                        <td>${person.first} ${person.last}</td>
                        <td><form action="edit" method="get">
                                <input type="hidden" name="id" value="${person.id}">
                                <input type="submit" value="Edit">
                            </form></td>
                        <td><form action="delete" method="get">
                                <input type="hidden" name="id" value="${person.id}">
                                <input type="submit" value="Delete">
                            </form></td>
                        
                    </tr></c:forEach>
                </tbody>
            </table>

    </body>
</html>
