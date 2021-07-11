<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>月間給料確認</title>
</head>
<body>
<form action = "http://localhost:8080/PayRoll/MonthlySalaryConfirmation" method="get">
<p>調べたい月:<br>
<input type = "text" name = "month"></p>
<p><input type="submit" value="検索"></p>
</form>
</body>
</html>