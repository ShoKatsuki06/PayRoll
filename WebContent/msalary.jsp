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
<title>Insert title here</title>
</head>
<body>
<form action = "http://localhost:8080/PayRoll/MonthlySalaryConfirmation" method="get">
<p>調べたい月:<br>
<input type = "text" name = "month"></p>
<p><input type="submit" value="検索"></p>
</form>
</body>
</html>