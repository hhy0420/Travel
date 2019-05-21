<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <a href="alogin.html">退出</a>
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
                    <li><a href="delicacyList.jsp">美食管理</a></li>
                    <li><a href="password.jsp?username=${username}">密码修改</a></li>
                    <li><a href="alogin.html">退出系统</a></li>
                </ul>
            </nav>
        </div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>景点管理页面</span>
            </div>
            
            	<div class="search">
            	<form action="seek1.do">
                <span>景点名：</span>
                <input type="text" id="bname" name="bname" placeholder="请输入景点名"/>
                <input type="submit" value="查询"/>
                <a href="beautifulAdd.jsp">添加景点</a>
                </form>
            </div>
            
            
            <!--景点-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">景点id</th>
                    <th width="20%">景点名称</th>
                    <th width="10%">景点地址</th>
                    <th width="10%">景点门票价</th>
                    <th width="10%">景点简介</th>
                    <th width="30%">操作</th>
                </tr>
                <c:forEach items="${beas}" var="bb" >
                <tr>
                    <td>${bb.bid}</td>
                    <td>${bb.bname}</td>
                    <td>${bb.baddress}</td>
                    <td>${bb.bprice}</td>
                    <td>${bb.bnotes}</td>
                    <td>
                        <a href="beautifulView.do?bid=${bb.bid }"><img src="images/read.png" alt="查看" title="查看"/></a>
                        <a href="userupdate.do?bid=${bb.bid }"><img src="images/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="beaDelete.do?bid=${bb.bid }"><img src="images/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
                </c:forEach>
                
            </table>

        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<!-- <div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该景点吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div> -->

    <footer class="footer">
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>