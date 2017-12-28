<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%request.setCharacterEncoding("utf-8"); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Register.do" method="post">
	username:<input type="text" name="uname"><br>
	password:<input type="text" name="upwd"><br>
	<input type="submit" value="注册">
	</form>
</body>
</html>