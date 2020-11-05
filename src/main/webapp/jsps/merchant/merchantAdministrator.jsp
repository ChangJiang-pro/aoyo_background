<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>奥友后端管理 首页</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.languages.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <link rel="stylesheet" href="/cxCalendar/css/jquery.cxcalendar.css">




    <script>
        $(function () {
            $("#tab1").bootstrapTable({
                url: "/merchant/merchantshow",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination:true,
                sidePagination: "client",
                pageSize: 5,
                columns: [
                    {
                        field: 'merchantName',
                        title: '商户名称',
                        formatter: function (value, row, index) {
                            return "<a href='/merchant/merchantshowhuixian?merchantId=" + row.merchantId + "'>" + value + "</a>";
                        }
                    }, {
                        field: 'merchantCode',
                        title: '商户编号'
                    },{
                        field: 'merchantType',
                        title: '商户类型'
                    },{
                        field: 'merchantAddress',
                        title: '商户地址'
                    },{
                        field: 'merchantTel',
                        title: '商户电话'
                    },{
                        field: 'merchantContacts',
                        title: '联系人'
                    },{
                        field: 'groupLeader',
                        title: '法人姓名'
                    },{
                        field: 'groupLeaderTel',
                        title: '法人电话'
                    },{
                        field: 'groupCreateTime',
                        title: '创建时间'
                    },{
                        field: 'merchantStatus',
                        title: '状态',
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return "<span>开启</span>";
                            } else if (value == 2) {
                                return "<span class='third-item'>关闭</span>";
                            }
                        }
                    }
                ]
            })
        })
    </script>

</head>

<body>
<c:import url="../utlis/background.jsp"/>
<c:import url="../utlis/broadside.jsp"/>

<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <center><h3 style="margin-bottom: 40px">商户管理</h3></center>


    <div class="sort_list" style="margin: 40px; margin-top: 10px; box-shadow: 0 0 4px black; height: 400px; padding: 10px;margin-top: 50px">
        <table id="tab1"></table>
    </div>
</div>




</body>

</html>


