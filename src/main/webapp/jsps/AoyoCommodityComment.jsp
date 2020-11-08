<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品评论</title>
    <script src="/static/vue/vue.js"></script>
    <link rel="stylesheet" href="/static/element/index.css">
    <script src="/static/element/index.js"></script>
    <script src="/static/vue/axios.js"></script>
    <script src="/static/vue/qs.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
</head>
<style>

</style>
<body>
<div>
    <h2>商品评论</h2>
</div>
<div id="app">
<template>
    <el-table
            :data="tableData.slice((currentPage-1)*pagesize,currentPage*pagesize)"
            border
            style="width: 100%;">
            <el-table-column
                    align="center"
                    prop="commodityDelId"
                    label="序号"
                    v-if="false">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityId"
                    label="序号">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="groupUserName"
                    label="用户名称">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityName"
                    label="商品名称">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="orderCode"
                    label="订单编号">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityCommentTitle"
                    label="评论标题">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityCommentContent"
                    label="评论内容">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityCommentTime"
                    label="评论时间">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityCommentLastupdateTime"
                    label="最后修改时间">
            </el-table-column>
            <el-table-column
                    align="center"
                    prop="commodityCommentRemarks"
                    label="备注">
            </el-table-column>
            <el-table-column
                    align="center"
                    label="操作">
                  <template slot-scope="scope" style="align-content: center">
                    <el-switch
                            @change="delid(scope.row)"
                            style="display: block"
                            v-model="scope.row.status"
                            active-color="#ff4949"
                            inactive-color="#13ce66"
                            active-text="隐藏"
                            inactive-text="显示">
                    </el-switch>
                    </template>
                   <%-- <template slot-scope="scope" style="align-content: center">
                    <el-button @click="yc(scope.row)"size="small" type="danger" round>隐藏</el-button>
                    <el-button @click="xs(scope.row)"size="small" type="success" round>显示</el-button>
                    </template>--%>
            </el-table-column>

    </el-table>
    <%--分页--%>
     <el-pagination
            background
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="currentPage"
            :page-sizes="[5, 10, 20, 40]"
            :page-size="pagesize"
            layout="total, sizes, prev, pager, next, jumper"
            :total="tableData.length">
    </el-pagination>
</template>
    </div>
</body>
<script type="text/javascript">

    new Vue({
        el: '#app',
        mounted() {
            var _this=this;
            axios.post('/comment/findAll',{
            }).then(function (res)  {
                // console.log(res.data);
                _this.tableData=res.data;
            }).catch(function (error) {
            });

            axios.post('/comment/findAll',{
            }).then(function (res)  {
                // console.log(res.data);
                _this.tableDataId=res.data;
            }).catch(function (error) {
            });
        },
        data (){
            return{
                currentPage:1, //初始页
                pagesize:5,
                tableData: [],
                tableDataId: [],
                handleClick:false
            }
        },

        methods : {
            // 初始页currentPage、初始每页数据数pagesize和数据data
            handleSizeChange: function (size) {
                this.pagesize = size;
                console.log(this.pagesize)  //每页下拉显示数据
            },
            handleCurrentChange: function (currentPage) {
                this.currentPage = currentPage;
                console.log(this.currentPage)  //点击第几页
            },

            delid:function (row) {
                var table=this.tableDataId;
                if(row.commodityId!=''){
                    row.commodityId = "",
                    row.groupUserName = "",
                    row.commodityName = "",
                    row.orderCode = "",
                    row.commodityCommentTitle = "",
                    row.commodityCommentContent = "",
                    row.commodityCommentTime = "",
                    row.commodityCommentLastupdateTime = "",
                    row.commodityCommentRemarks = ""
                }else {
                    for (var i = 0; i <table.length ; i++) {
                        if(table[i].commodityDelId==row.commodityDelId){
                            console.log(table[i]);
                            row.commodityId=table[i].commodityId,
                            row.groupUserName=table[i].groupUserName,
                            row.commodityName=table[i].commodityName,
                            row.orderCode=table[i].orderCode,
                            row.commodityCommentTitle=table[i].commodityCommentTitle,
                            row.commodityCommentContent=table[i].commodityCommentContent,
                            row.commodityCommentTime=table[i].commodityCommentTime,
                            row.commodityCommentLastupdateTime=table[i].commodityCommentLastupdateTime,
                            row.commodityCommentRemarks=table[i].commodityCommentRemarks
                        }
                    }
                }
            }

        }

    });

</script>
</html>
