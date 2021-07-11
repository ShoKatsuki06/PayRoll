<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sample_main.AccountBeans" %>
<%@ page import="java.util.Iterator" %>
 <% AccountBeans ab = (AccountBeans)session.getAttribute("account");
   if(ab == null){
 	response.sendRedirect( "Login.jsp" );
 	return;
 } String id = ab.getId();

 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<h3>"ようこそ！
<%out.print(id);%>
さん</h3>
<p><a href="AttendanceRegistration.jsp">勤怠登録</a></p>
<p><a href="SalaryConfirmation.jsp">給料確認</a>
<p><a href="http://localhost:8080/PayRoll/Logout">ログアウトはこちら</a>

</body>
</html>