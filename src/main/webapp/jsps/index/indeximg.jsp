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
                url: "/platformDriver/slideshow",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination:true,
                sidePagination: "client",
                pageSize: 5,
                columns: [
                    {
                        field: 'commodityImgDesc',
                        title: '图片名称',
                        formatter: function (value, row, index) {
                            return "<a href='/platformDriver/huixian?commodityImgId=" + row.commodityImgId + "'>" + value + "</a>";
                        }
                    }, {
                        field: 'commodityImgLastupdateTime',
                        title: '创建时间'
                    },{
                        field: 'commodityImgSort',
                        title: '图片排序'
                    },{
                        field: 'commodityImgStatus',
                        title: '图片状态',
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return "<span>开启</span>";
                            } else if (value == 2) {
                                return "<span class='third-item'>关闭</span>";
                            }
                        }
                    },{
                        field: 'commodityImgId',
                        title: '操作',
                        formatter: function (value, row, index) {
                            return "<input type=\"button\" class=\"btn btn-primary\" onclick=\"chakan('"+value+"')\" value=\"删除 \">"

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
    <center><h3 style="margin-bottom: 40px">轮播图管理</h3></center>


    <div class="sort_list" style="margin: 40px; margin-top: 10px; box-shadow: 0 0 4px black; height: 400px; padding: 10px;margin-top: 50px">
        <table id="tab1"></table>
    </div>
</div>




</body>

</html>

<script>

    /*刷新页面*/
    function shuaXin() {
        $('#tab1').bootstrapTable('refresh');
    }


    /*删除高校*/
    function shanchu(commodityImgId) {
        var msg = "您真的确定要删除吗？\n\n请确认！";
        if (confirm(msg)==true){
            return shanchu1(commodityImgId);
        }else{
            return false;
        }
    }
    function shanchu1(commodityImgId) {
        $.ajax({
            type:"post",
            dataType:"json",
            url:"/platformDriver/shanchu",
            data:{"id":commodityImgId},
            success:function () {
                alert("删除成功")
                shuaXin();
            },
            error: function () {
                alert("失败了");
            }
        })
    }

</script>
