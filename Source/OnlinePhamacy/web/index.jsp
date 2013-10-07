<%-- 
    Document   : index
    Created on : Oct 7, 2013, 9:54:49 AM
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
        <title>XYZ Pharmacy</title>
    </head>
    <body>
        <div id="wrapper">
            <jsp:include flush="true" page="Skin/Default/vnkParts/header.jsp" />
            <jsp:include flush="true" page="Skin/Default/vnkParts/slide.jsp" />
            <div class="container">
                <jsp:include flush="true" page="Skin/Default/vnkParts/contain.jsp" />
            </div>
            <div class="footer_container">
                <jsp:include flush="true" page="Skin/Default/vnkParts/footer.jsp" />
            </div>
        </div>
        
    </body>
</html>
