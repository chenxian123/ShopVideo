<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>icon-shop首页</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="../../css/index/head_css.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/index/bottom_css.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/index/center_css.css"/>
	<script type="text/javascript">
        function s_onclick(){
            document.getElementById("head_input").value="";
        }
        function b_onclick(){
            var saval=document.getElementById("head_input").value;
            if(saval==""){
                document.getElementById("head_input").value="输入搜索的内容";
            }
        }
       function iflogin(){
            var sess="<%=session.getAttribute("userSession")%>";
            var Alogin=document.getElementById("ha_login");
            var Blanding=document.getElementById("u_longin");
            var Alanding=document.getElementById("u_infor");
            if(sess != "null"){
                Alogin.innerHTML="${userSession.name }";
                Alogin.href="seluser.do?id=${userSession.id}"
                Blanding.style.display='none';
                Alanding.style.display='block';
            }else{
                Alogin.href="login"
                Blanding.style.display='black';
                Alanding.style.display='none';
            }
        }
        window.onload=iflogin;
    </script>
</head>

<body>
<!--头部-->
<div id="h_headbox">
  <div class="h_url">
    <div class="u_ubox">
        <div class="h_lurl"> <a href="">位置</a> <a href="">[湖北 公安 黄山头]</a> <a id="ha_login" href="login">立即登陆</a> <a href="userExit.do">注销</a> </div>
        <div class="h_rurl"> <a href="">我的网站</a> <a href="">手机APP</a> <a href="">活动入口</a> <a href="">网站导航</a> </div>
    </div>
</div>
  <div class="h_select">
    <div class="h_selbox">
      <div class="s_inpbox">
        <input id="head_input" type="text" value="输入搜索的内容" onclick="s_onclick()" onblur="b_onclick()"/>
        <button class="b_selbut">搜索</button>
        <ul class="s_urlpro">
          <li><a href="">电视剧</a></li>
          <li><a href="">动漫</a></li>
        </ul>
      </div>
      <div class="h_class">
        <ul>
          <li class="c_aurl"><a href="">网页主站</a></li>
          <li><a href="">电视剧</a></li>
          <li><a href="">综艺</a></li>
          <li><a href="">动漫</a></li>
          <li><a href="">动漫</a></li>
          <li><a href="">动漫</a></li>
		  <li><a href="">动漫</a></li>
		  <li><a href="">动漫</a></li>
        </ul>
      </div>
    </div>
  </div>
</div>
<!--中部-->
<div id="center">
    <div id="c_centerbox">
        <div class="c_hcontent">
            <div class="c_content">
                <img class="c_images" src="../../images/51miz-E262265-F507BA81.png"/>
            </div>
            <div class="userinf">
                <div id="u_longin">
                    <ul>
                        <li>
                            <a href="ShopAction_seluser?id=${usersSession.id}">
                                <img class="u-icon" src="../../images/51miz-E219356-1230629D.png"/>
                            </a>
                        </li>
                        <li><a class="btn-login" href="insuser">注册</a></li>
                        <li><a class="btn-login" href="login">立即登陆</a></li>
                    </ul>
                </div>
                <!-- 登陆成功后显示 -->
                <div id="u_infor">
                    <ul>
                        <li>
                            <a href="seluser.do?id=${userSession.id}">
                                <img class="u-icon" src="../../images/51miz-E219356-1230629D.png"/>
                            </a>
                        </li>
                        <li><a class="x_uname" href="seluser.do?id=${userSession.id}">${userSession.name }</a></li>
                        <li>
                            <div class="u_inforurl">
                                <ul>
                                    <li><a href="">收藏</a></li>
                                    <li><a href="">历史纪录</a></li>
                                    <li><a href="infor.do">信件</a></li>
                                    <li><a href="selAll.do">查询所有用户</a>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="c_bcontent">
            <h1>中下部内容</h1>
        </div>
    </div>
</div>
<!--底部-->
<div id="b_bottom">
		<div id="b_url">
				<ul>
					<li><a href="">哈哈哈哈啊哈</a></li>
					<li><a href="">哈哈哈哈啊哈</a></li>
					<li><a href="">哈哈哈哈啊哈</a></li>
				</ul>
				<ul>
					<li><a href="">哈哈哈哈啊哈</a></li>
					<li><a href="">哈哈哈哈啊哈</a></li>
				</ul>
				<ul>
					<li><a href="">哈哈哈哈啊哈</a></li>
					<li><a href="">哈哈哈哈啊哈</a></li>
				</ul>
				<ul>
					<li><a href="">哈哈哈哈啊哈</a></li>
					<li><a href="">哈哈哈哈啊哈</a></li>
				</ul>
		</div>
	</div>
</body>
</html>
