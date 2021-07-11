<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
</head>
<body>
<form action = "http://localhost:8080/PayRoll/AsLogin" method="get">
<p>ID:<br>
<input type = "text" name = "id"></p>
<p>パスワード<br>
<input type = "text" name = "pass"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<br>
</body>
</html>