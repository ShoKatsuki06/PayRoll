<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sample_main.Workman" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List"%>
<%@ page import="sample_main.Workman" %>
 <% String ab = (String)session.getAttribute("id");
 if(ab == null){
	 	response.sendRedirect( "AdministratorLogin.jsp" );
	 	return;
	 }%>
<%
 List<Workman> nlist = (List<Workman>)session.getAttribute("nlist");
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
<title>一覧</title>
</head>
<body>
<h3>従業員一覧</h3>
<table>
   <%for(int i = 0; i < nlist.size(); i++){%>
        <%Workman wm = (Workman)nlist.get(i);%>
        <tr>
            <td><%=wm.getId()%></td>
            <td><%=wm.getName()%></td>
            <td><%=wm.getWorkplace()%></td>
            <td><%=wm.getWorksalary()%></td>
        </tr>
    <% } %>

    <a href="Administrator.jsp">メインメニュー</a>

</table>
</body>
</html>