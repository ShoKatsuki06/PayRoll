<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>管理者ログイン失敗</title>
</head>
<body>
<h3>ログインに失敗しました</h3>
<a href = "AdministratorLogin.jsp"><button>ログインページへ</button></a>
</body>
</html>