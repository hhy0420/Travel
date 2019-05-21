<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>叶子旅行社管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>叶子旅行社管理系统</h1>

    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="userList.do">用户管理</a></li>
                <li id="active"><a href="beautifulList.do">景点管理</a></li>
                <li><a href="routeList.do">路线管理</a></li>
                <li><a href="delicacyList.do">美食管理</a></li>
                <li><a href="password.jsp?username=${username}">密码修改</a></li>
                <li><a href="alogin.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>景点管理页面 >> 景点信息查看页面</span>
        </div>
        <div class="providerView">
            <p><strong>路线id：</strong><span>${routes.rid }</span></p>
            <p><strong>路线起点：</strong><span>${routes.rstart }</span></p>
            <p><strong>路线终点：</strong><span>${routes.rend }</span></p>
            <p><strong>路线所达景点：</strong><span>${routes.rscenery }</span></p>
            <p><strong>路线简介：</strong><span>${routes.rnotes }</span></p>
            <a href="routeList.do">返回</a>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>