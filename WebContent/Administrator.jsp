<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Iterator" %>
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
<title>管理者ページ</title>
</head>
<body>
<a href="http://localhost:8080/PayRoll/List">一覧閲覧</a>
<a href="change.jsp">時給変更</a>
<a href="Delete.jsp">従業員情報削除</a>
<p><a href="http://localhost:8080/PayRoll/Logout">ログアウトはこちら</a>
</body>
</html>