<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "http://localhost:8080/PayRoll/Login" method="get">
<p>ID:<br>
<input type = "text" name = "AAA"></p>
<p>パスワード<br>
<input type = "text" name = "BBB"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<br>

<a href="http://localhost:8080/PayRoll/html/newgenerate.html">新規登録はこちら</a>
<a href="AdministratorLogin.jsp">管理ページ</a>
</body>
</html>