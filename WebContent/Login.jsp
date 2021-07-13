<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/a.css">
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
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
<h3>ログイン画面
</h3>
<form action = "./login" method="post">
<p>ID:<br>
<input type = "text" name = "AAA"></p>
<p>パスワード<br>
<input type = "password" name = "BBB"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<br>


<a href="newgenerate.jsp">新規登録はこちら</a>
<a href="AdministratorLogin.jsp">管理ページ</a>
</body>
</html>