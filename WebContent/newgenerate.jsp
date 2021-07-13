<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="sample_main.AccountBeans" %>
<%@ page import="java.util.Iterator" %>
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


<head><meta http-equiv="content-type" charset="UTF-8"><title>新規登録</title></head>
<h3>情報の登録を行います</h3>
<form action = "./regist" method="get">
<p>名前:<br>
<input type = "text" name = "aaa"></p>
<p>パスワード:<br>
<input type = "text" name = "bbb"></p>
<p>勤務先:<br>
<input type = "text" name = "ccc"></p>
<p>時給：<br>
<input type = "text" name = "ddd"></p>
<p><input type="submit" value="登録"></p>
</form>

<p><a href="Login.jsp">ログインはこちら</a>




</html>