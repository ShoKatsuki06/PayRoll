<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="sample_main.Workman" %>

 <% String ab = (String)session.getAttribute("id");
 if(ab == null){
	 	response.sendRedirect( "AdministratorLogin.jsp" );
	 	return;
	 }%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除ID入力画面</title>
</head>
<body>
<h1>削除したいIDを下記に入力してください</h1>
<form action = "http://localhost:8080/PayRoll/WorkManDelete" method="get">
<p>ID:<br>
<input type = "text" name = "ID"></p>
<p><input type="submit" value="削除"></p>
</form>
<br>
</body>
</html>