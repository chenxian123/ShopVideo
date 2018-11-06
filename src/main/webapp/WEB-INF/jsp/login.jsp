<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>用户登录</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css" href="../../css/login_css.css"/>

    <script type="text/javascript" src="../../js/login_js.js"></script>
</head>

<body>
<div id="login_background">
    <a href="javascript:history.back();">返回首页</a>
    <div id="login_box">
        <form action="login.do" method="get" onsubmit="return logincheck()">
            <table id="login_tb">
                <tr>
                    <td class="td_word">用户名：</td>
                    <td class="td_text"><input id="name" type="text" name="name" value="请输入用户名" onclick="nameonclik()" onblur="nameonblur()"/></td>
                </tr>
                <tr>
                    <td class="td_msg"></td>
                    <td><p class="msg"></p></td>
                </tr>
                <tr>
                    <td class="td_word">密码：</td>
                    <td class="td_text"><input id="pwd" type="text" name="password" value="请输入密码" onclick="pwdonclik()" onblur="pwdonblur()"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td id="tb_checkbox"><input type="checkbox" id="automatic"  name="automatic" value="save"/>自动登录</td>
                </tr>
                <tr>
                    <td id="td_button" colspan="2"><button type="submit" id="login_bt">登陆</button></td>
                </tr>
                <tr>
                    <td id="tb_re">
                        <a id="register" href="">注册账号</a>
                        <a id="retrieve" href="">找回密码</a>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
