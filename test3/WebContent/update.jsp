<%@page import="com.test3.Entity.User"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% int uid = Integer.parseInt(request.getParameter("uid"));
 Session sess = new Configuration().configure().buildSessionFactory().openSession();
 User user = (User)sess.get(User.class, uid);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Update.do" method="post">
  <input type="hidden" name="uid" value="<%=uid %>">
  username:<input type="text" name="uname" value="<%=user.getUname() %>"><br>
  password:<input type="password" name="upwd" value="<%=user.getUpwd() %>"><br>
  <input type="submit" value="修改">
  </form>
</body>
</html>