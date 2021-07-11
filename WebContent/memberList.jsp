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
<head>
<meta charset="UTF-8">
<title>一覧</title>
</head>
<body>
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