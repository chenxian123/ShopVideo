<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
    <a href="index">返回首页</a>
    <a href="javascript:history.back();">返回上一页</a>
    <h1>提示：<s:property value="msg"/></h1>
   	<table border="1px">s
   		<tr>
   			<td>编号</td>
   			<td>姓名</td>
			<td>性别</td>
   			<td>电话</td>
   			<td>用户编号</td>
   			<td>注册ip</td>
   			<td>注册时间</td>
   			<td>编辑</td>
   		</tr>
		<c:forEach items="${listuser}" var="userlist">
	    	<tr>
	    		<td>${userlist.id }</td>
	    		<td>${userlist.name }</td>
				<td>${userlist.gender }</td>
	    		<td>${userlist.phone }</td>
	    		<td>${userlist.usernum }</td>
	    		<td>${userlist.regip }</td>
	    		<td>${userlist.joindate }</td>
	    		<td>
	    			<a href="seluser.do?id=${userlist.id }">修改</a>
	    			<a href="deluser.do?id=${userlist.id }">删除</a>
	    		</td>
	    	</tr>
		</c:forEach>
	 </table>
  </body>
</html>
