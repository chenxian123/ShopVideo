<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>发送信息</title>

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
    <form action="sendmsg.do" method="get">
        <table width="50%" border="1" bordercolorlight="#000000" bordercolordark="#FFFFFF" bgcolor="#CCFFCC" cellpadding="4" align="left">
            <tr>
                <td colspan="2"> <div align="center"><b>发 送 邮 件</b></div> </td>
            </tr>
            <tr>
                <td>发件人：<input type="text" value="${userSession.name }">
                    <input type="hidden" name="sender" value="${userSession.id}"/>
                </td>
                <td>收件人：<input type="text" name="receiver" value="2"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <c:forEach items="${listuser }" var="userlist">
                        <a href="">${userlist.name }</a>
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                <div align="center">留 言<br>
                <textarea name="content" cols="30" rows="3"></textarea>
                </div>
                </td>
            </tr>
            <tr>
                <td> <div align="right"> <input type="submit" value="提 交"> </div> </td>
                <td> <input type="reset" value="重 写"> </td>
            </tr>
        </table>
    </form>
</body>
</html>
