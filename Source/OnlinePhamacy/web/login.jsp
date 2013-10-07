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
        <script src="vnkResource/js/Dynamic.js" type="text/javascript"></script>
        <link href="vnkResource/css/Dynamic.css" rel="stylesheet" type="text/css" />
        <link href="Skin/Default/css/reset.css" rel="stylesheet" type="text/css">
        <link href="Skin/Default/css/style.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <jsp:include flush="true" page="Skin/Default/vnkParts/header.jsp" />
            <div class="container">
                <form action="UserBackendAction" method="POST" class="form">
                    <li class="k-alt">
                        <div>
                            <input type="text" name="Username" width="100" maxlength="255" value="" class="field text requi"/>
                        </div>
                    </li>
                    <li class="k-alt">
                        <div>
                            <input type="password" name="Password" width="100" maxlength="255" value="" class="field text requi"/>
                        </div>
                    </li>
                    <input type="submit" value="Login" onClick="return checksubmit();" language="javascript" class="positive"/>
                </form>
            </div>
            <div class="footer_container">
                <jsp:include flush="true" page="Skin/Default/vnkParts/footer.jsp" />
            </div>
        </div>
    </body>
</html>
