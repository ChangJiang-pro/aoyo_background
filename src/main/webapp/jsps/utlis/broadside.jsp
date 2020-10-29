<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div style="float: left; margin: 0 0 0 100px; opacity: 0.8;">
    <div class="content">
        <ul class="vertical-nav dark red" style="text-align: center;">
            <li class="active"><a href="/jsps/index.jsp"><i class="icon-home"></i>首页
                <span class="submenu-icon"></span></a>
                <ul>
                    <li><a href="/jsps/purchaseRequest.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/stockOut.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                </ul>
            </li>
           <%-- <c:if test="${USER.uRole==1||USER.uRole==2}">--%>
                <li><a href="#"><i class="icon-question"></i>分类
                    <span class="submenu-icon"></span></a>
                        <%--权限1，2可查看--%>
                    <ul>
                        <li><a href="/jsps/purchaseRequest.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/stockOut.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                    </ul>
                </li>
        <%-- </c:if>--%>
            <%--<c:if test="${USER.uRole==1||USER.uRole==2}">--%>
                <li><a href="#"><i class="icon-briefcase"></i>门店
                    <span class="submenu-icon"></span></a>
                    <ul>
                        <li><a href="/jsps/purchaseRequest.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/stockOut.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                        <li><a href="/jsps/abnormal.jsp">xx</a>
                        </li>
                    </ul>
                  </li>
            <%--</c:if>--%>




            <%--<c:if test="${USER.uRole==1||USER.uRole==2}">--%>

            <li><a href="#"><i class="icon-cogs"></i>我的
                <span class="submenu-icon"></span></a>
                <%--权限1，2可查看--%>
                <ul>
                    <li><a href="/jsps/purchaseRequest.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/stockOut.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                    <li><a href="/jsps/abnormal.jsp">xx</a>
                    </li>
                </ul>
            </li>
        <%--</c:if>--%>





        <%--<c:if test="${USER.uRole==1}">
        <li><a href="#"><i class="icon-group"></i>账号管理<span class="submenu-icon"></span></a>
            <ul>
                    <li><a href="/jsps/user.jsp">用户管理</a></li>
            </ul>
        </li>
        </c:if>--%>

        <%--<li><a href="/jsps/venderList.jsp"><i class="icon-question"
                                              style="padding-left: 20px;width: 20px;padding-right: 35px;"></i>厂家、代理管理</a>
        </li>--%>

        </ul>

    </div>
</div>