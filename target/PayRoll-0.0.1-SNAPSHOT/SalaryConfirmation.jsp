<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="sample_main.AccountBeans" %>
 <% AccountBeans ab = (AccountBeans)session.getAttribute("account");
 if(ab == null){
	 	response.sendRedirect( "Login.jsp" );
	 	return;
	 }
    int salary = ab.getSalary();
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>給料確認選択</title>
</head>
<body>
<p><a href="msalary.jsp">月間確認</a></p>
<p><a href="dailySalaryConfirmation.jsp">日別確認</a>
</body>
</html>