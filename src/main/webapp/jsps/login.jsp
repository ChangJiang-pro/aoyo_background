<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link rel="icon" type="image/x-icon" href="#" />
    <link type="text/css" rel="styleSheet"  href="/login/main.css" />
    <title>账号登录</title>

</head>


<body>
<div id="bg">
    <div id="login_wrap">
        <div id="login"><!-- 登录注册切换动画 -->
            <div id="status">
                <i style="top: 0">用户</i>
                <i style="top: 35px">登录</i>
            </div>
            <span>
                    <form action="${pageContext.request.contextPath}/user/login" method="post">
                        <input name="id" id="id" hidden="hidden">
                        <p class="form"><input type="text" name="uName" id="user" placeholder="用户名"></p>
                        <p class="form"><input type="password" id="uPass" name="uPass" placeholder="密码  "></p>
                        <input type="submit" value="登 录" class="btn"  style="margin-right: 20px;">
                    </form>
                </span>
        </div>

        <div id="login_img"><!-- 图片绘制框 -->
            <span class="circle">
                    <span></span>
                    <span></span>
                </span>
            <span class="star">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                </span>
            <span class="fly_star">
                    <span></span>
                    <span></span>
                </span>
        </div>
    </div>
</div>
</body>

</html>
