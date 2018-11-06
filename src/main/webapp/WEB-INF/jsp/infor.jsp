<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>站内信</title>
    
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
    <div>
		<a href="index">返回首页</a>
		<a href="javascript:history.back();">返回上一页</a>
    	<table border="1px">
			<tr><td colspan="4" align="center">欢迎${userSession.name }</td></tr>
			<tr>
				<td height="50px"><a href="sendmsg">发送邮件</a></td>
				<td><a href="inbox.do?receiver=${userSession.id }">收件箱</a></td>
				<td><a href="outbox.do?sender=${userSession.id }">已发送信件</a>
				<td><a href="">垃圾箱</a></td>
			</tr>
    	</table>
    </div>
  </body>
</html>
