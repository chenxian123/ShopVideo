<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>垃圾箱</title>

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
<table border="1px">
    <tr>
        <td>发件人姓名</td>
        <td>信件内容</td>
    </tr>
    <c:forEach items="${listinfor }" var="inforlist">
        <tr>
            <td>${inforlist.sender}</td>
            <td>${inforlist.content}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
