<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2>SpringMVC 실행결과 : </h2>

<hr/>
<%=request.getAttribute("gugu") %>
<hr/>
 <% for(int i=1; i<10; i++){%>
	<h4>9 * <%=i %> = <%=9*i %> </h4>
	
<%}%>




</body>
</html>