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

</style>
<head>
<meta charset="UTF-8">
<title>削除ID入力画面</title>
</head>
<body>
<h1>削除したいIDを下記に入力してください</h1>
<form action = "./WorkManDelete" method="get">
<p>ID:<br>
<input type = "text" name = "ID"></p>
<p><input type="submit" value="削除"></p>
</form>
<br>
</body>
</html>