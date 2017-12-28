<%@page import="java.util.List"%>
<%@page import="com.test3.Entity.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("UTF-8");
Session sess = new Configuration().configure().buildSessionFactory().openSession();
Query query = sess.createQuery("from User");
List<User> list = query.list();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息</title>
<script>
	window.onload = function displayTime(){
		var clock = document.getElementById('clock');
		var now = new Date();
		clock.innerHTML = now.toLocaleTimeString();
		setTimeout(displayTime,1000);
	}
</script>
</head>
<body>
<%
  for(int i=0;i<list.size();i++){
	  User user = list.get(i);
   %>
    Uid:<%=user.getUid() %>  Uname:<%=user.getUname() %>  Upwd:<%=user.getUpwd() %>
    <a href="<%=request.getContextPath()%>/Delete.do?u=<%=user.getUid() %>">删除</a>
    <a  href="update.jsp?uid=<%=user.getUid() %>">修改</a>
    <br>
  <%
  }
   %>
  <a href="index.jsp">注册</a> <br>
  <a href="login.jsp">登录</a> <br>
  <span id ="clock"></span>
</body>
</html>