<%-- 
    Document   : login
    Created on : Apr 26, 2025, 8:58:20 AM
    Author     : Computing Fundamental - HCM Campus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <!--your code here-->
        <form action="MainController" method="POST">
            User ID<input type="text" name="userID"/></br>
            Password<input type="password" name="password"/></br>
            <input type="submit" name="action" value="Login"/>

        </form>
        
        <%
            String error = (String) request.getAttribute("MESSAGE");
            if (error == null)
                error = "";
        %>
        <h1><%= error%></h1>
    </body>
</html>
