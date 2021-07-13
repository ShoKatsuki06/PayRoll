<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="sample_main.AccountBeans" %>
<%@ page import="java.util.Iterator" %>
    <% AccountBeans ab = (AccountBeans)session.getAttribute("account");
 if(ab == null){
	 	response.sendRedirect( "Login.jsp" );
	 	return;
	 }
 String id = ab.getId();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>