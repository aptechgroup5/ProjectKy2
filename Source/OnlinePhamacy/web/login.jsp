<%-- 
    Document   : login
    Created on : Oct 7, 2013, 11:01:50 AM
    Author     : Chung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="UserBackendAction" method="POST">
            <input type="text" name="Username" value="" />
            <input type="password" name="Password" value="" />
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
