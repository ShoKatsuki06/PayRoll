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
<style>
h3 {
  padding: 1rem 3rem;
  -webkit-transform: skew(-15deg);
  transform: skew(-15deg);
  color: #fff;
  background-image: -webkit-gradient(linear, left top, right top, from(#209cff), to(#68e0cf));
  background-image: -webkit-linear-gradient(left, #209cff 0%, #68e0cf 100%);
  background-image: linear-gradient(to right, #209cff 0%, #68e0cf 100%);
}
body {
    background: #eeeeee;
    font-family: Meiryo;
    width:700px;
    margin-right: auto;
   margin-left : auto;
  font-size:140%
  }

  a{
  padding: 0 10px;
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0) 50%, rgb(49, 170, 226) 50%);
  background-position: 0 0;
  background-size: 200% auto;
  transition: .3s;
  }

  a:hover{
   background-position: -100% 0;
  color: #fff;
  }
</style>
<head>
<meta charset="UTF-8">
<title>日別給料確認</title>
</head>
<body>
<h3>日別給料確認</h3>
<form action = "./DailySalaryConfirmation" method="get">
<p>調べたい月:<br>
<input type="number" value="1" min="01" max="12" step="1"name = "month"></p>
<p>調べたい日:<br>
<input type="number" value="1" min="01" max="31" step="1" name = "day"></p>
<p><input type="submit" value="登録"></p>
</form>
</body>
</html>