<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>用户信息</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css" href="../../css/userinfo_css.css">

</head>

<body>
<div id="userinfo_background">
    <div class="h_url">
        <div class="u_ubox">
            <div class="h_lurl"> <a href="">位置</a> <a href="">[湖北 公安 黄山头]</a> <a id="ha_login" href="login">立即登陆</a> <a href="userExit.do">注销</a> </div>
            <div class="h_rurl"> <a href="">我的网站</a> <a href="">手机APP</a> <a href="">活动入口</a> <a href="">网站导航</a> </div>
        </div>
    </div>
    <a href="index">返回首页</a>
    <a href="">消息</a>
    <div id="icon_img"></div>
    <div id="userinfo">
        <form action="upduser.do?id=${users.id }" method="post">
            <table id="userinfo_tb" border="1px">
                <tr>
                    <td colspan="2" align="center">用户信息</td>
                </tr>
                <tr>
                    <td class="right_td">用户名:</td>
                    <td class="left_td"><input type="text" value="${users.name }" name="name" class="tb_input"/></td>
                </tr>
                <tr>
                    <td class="right_td">性别:</td>
                    <td class="left_td">${users.gender }</td>
                </tr>
                <tr>
                    <td class="right_td">电话:</td>
                    <td class="left_td"><input type="text" value="${users.phone }" name="phone" class="tb_input"/></td>
                </tr>
                <tr>
                    <td class="right_td">密码:</td>
                    <td class="left_td"><input type="text" value="${users.password }" name="password" class="tb_input"/></td>
                </tr>
                <tr>
                    <td class="right_td">用户编号:</td>
                    <td class="left_td">${users.usernum }</td>
                </tr>
                <tr>
                    <td class="right_td">注册时间:</td>
                    <td class="left_td">${users.joindate }</td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><button type="submit" id="update_tb">保存修改</button></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
