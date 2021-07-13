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
<style>
body {
    background: #eeeeee;
    font-family: Meiryo;
    width:700px;
    margin-right: auto;
   margin-left : auto;
  font-size:140%
  }
  p {
  line-height: 28px;
  margin-bottom: 25px;
   margin-right: auto;
   margin-left : auto;
}
h3 {
  padding: 1rem 3rem;
  -webkit-transform: skew(-15deg);
  transform: skew(-15deg);
  color: #fff;
  background-image: -webkit-gradient(linear, left top, right top, from(#209cff), to(#68e0cf));
  background-image: -webkit-linear-gradient(left, #209cff 0%, #68e0cf 100%);
  background-image: linear-gradient(to right, #209cff 0%, #68e0cf 100%);
}
</style>
<head>
<meta charset="UTF-8">
<title>勤怠登録<%out.print(id); %>></title>
</head>
<body>
<form action = "./Time" method="get">
<p>日付:<br>
<input type = "text" name = "day"></p>
<p>出勤時間:<br>
<input type = "time" name = "start"></p>
<p>退勤時間:<br>
<input type = "time" name = "end"></p>
<p>休憩時間:<br>
<input type = "text" name = "rest"></p>
<p><input type="submit" value="登録"></p>
</form>
<br>
</body>
</html>