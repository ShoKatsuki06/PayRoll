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
<title>時給変更</title>
</head>
<body>
<h1>時給を変更したいIDと変更後の時給を下記に入力してください</h1>
<form action = "http://localhost:8080/PayRoll/SalaryChange" method="get">
<p>ID:<br>
<input type = "text" name = "id"></p>
<p>時給:<br>
<input type = "text" name = "salary"></p>
<p><input type="submit" value="変更"></p>
</form>
<br>
</body>
</html>