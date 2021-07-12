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
<title>勤怠登録<%out.print(id); %>></title>
</head>
<body>
<form action = "http://localhost:8080/PayRoll/Time" method="get">
<p>日付:<br>
<input type = "text" name = "day"></p>
<p>出勤時間:<br>
<input type = "text" name = "start"></p>
<p>退勤時間:<br>
<input type = "text" name = "end"></p>
<p>休憩時間:<br>
<input type = "text" name = "rest"></p>
<p><input type="submit" value="登録"></p>
</form>
<br>
</body>
</html>