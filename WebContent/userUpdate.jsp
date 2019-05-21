<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
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
                <li id="active"><a href="userList.do">用户管理</a></li>
                    <li><a href="beautifulList.jsp">景点管理</a></li>
                    <li><a href="routeList.jsp">路线管理</a></li>
                    <li><a href="delicacyList.jsp">美食管理</a></li>
                    <li><a href="password.jsp?username=${username}">密码修改</a></li>
                    <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd">
            <form action="updateaf.do" method="post">
            	<input type="hidden" name="userid" id="userid" value=${user.userid }>
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                    <label for="username">用户名称：</label>
                    <input type="text" name="username" id="username" value=${user.username }>
                    <span >*请输入用户名称</span>

                </div>
                 <div>
                    <label >用户性别：</label>
					<input type="text" name="usersex" id="usersex" value=${user.usersex }>
                    <span >*请输入用户性别（男或女）</span>
                    <span></span>
                </div>
                <div>
                    <label for="tel">联系电话：</label>
                    <input type="text" name="usertel" id="usertel" value=${user.usertel }>
                    <span >*请输入联系电话</span>
                </div>
                <div>
                    <label for="age">用户年龄：</label>
                    <input type="text" name="userage" id="userage" value=${user.userage }>
                    <span >*请输入用户年龄</span>
                </div>
                <div>
                    <label for="password">用户密码：</label>
                    <input type="text" name="password" id="password" value=${user.password }>
                    <span >*请输入用户密码</span>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.html">返回</a>-->
                    <input type="submit" value="保存" onclick="history.back(-1)"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                    <!-- <input type="submit" value="提交">
                    <input type="submit" value="返回"> -->
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>