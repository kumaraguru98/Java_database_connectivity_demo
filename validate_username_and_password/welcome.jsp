<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <%
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
        response.setHeader("Pragma","no-cache"); // for older versions of HTTP 1.0         
        response.setHeader("Expires","0");  //if using Proxies
        if(session.getAttribute("username")==null)
             {
            	 response.sendRedirect("login.jsp");
             }
         
         %>

    WELCOME ${username}
    <a href = "videos.jsp">Videos here </a>
    <form action="Logout">
    <input type="submit" value="Logout">
    </form>
    <a href = "aboutus.jsp">AboutUs </a>



</body>
</html>
