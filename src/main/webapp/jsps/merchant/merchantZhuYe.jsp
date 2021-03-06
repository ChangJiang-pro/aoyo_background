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
                url: "/merchant/merchantzhuye",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination:true,
                sidePagination: "client",
                pageSize: 5,
                columns: [
                    {
                        field: 'merchantId',
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index + 1;
                        }
                    }, {
                        field: 'merchantName',
                        title: '商户名称'
                    },{
                        field: 'merchantCode',
                        title: '商户编号'
                    },{
                        field: 'merchantType',
                        title: '商户类型'
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
                    },
                    {
                        field: 'merchantId',
                        title: '操作',
                        formatter: function (value, row, index) {
                            return "<input type=\"button\" class=\"btn btn-primary\" onclick=\"modifyUser1('"+value+"')\" value=\"查看\">";
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
    <center><h3 style="margin-bottom: 40px">商户主页</h3></center>


    <div class="sort_list" style="margin: 40px; margin-top: 10px; box-shadow: 0 0 4px black; height: 400px; padding: 10px;margin-top: 50px">
        <table id="tab1"></table>
    </div>
</div>




</body>


<!-- 修改的模态框（Modal） -->
<div class="modal fade" id="myModalUpdate3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal"   id="updateUser3" enctype="multipart/form-data"  type="post">
                    <div class="form-group">
                        <div class="col-sm-7" id="div02">
                            <input type="hidden" id="merchantId" name="merchantId"/>
                        </div>
                    </div>
                    <div class="article">
                        <div class="item" style="float:left;margin-left: 30px">
                            <span style="margin-top: 6px">商户展示图：</span><br>
                            <label for="businessLicenseTemp" class="btn btn-default addImg ">
                                <img  width="200px" height="200px" id="img1">
                            </label>
                            <input style="display: none" id="businessLicenseTemp" onchange="fileimg(this)"  type="file" name="businessLicenseTemp" class="preview"/>
                        </div>
                        <div>
                            <span>商户信息描述：</span><br>
                            <textarea rows="3" cols="20" id="merchantDescribe" name="merchantDescribe">
                            </textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-4 col-sm-10">
                            <button id="sendMai2" type="button" onclick="xiugai()" class="btn btn-primary">修改
                            </button>
                            &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                            &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                            <button type="reset" class="btn btn-primary">重置</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
</html>
<script>


    /* 配合修改的单查*/
    function modifyUser1(merchantId) {
        $.ajax({
            type: "post",
            dataType: "json",
            url: "/merchant/merchantzhuyeById",
            data: {"merchantId": merchantId},
            success: function (data) {
                $("#img1").attr('src',data.data.merchantImg)
                $("#myModalUpdate3").modal("show");
                $("#merchantId").val(data.data.merchantId);
                $("#merchantDescribe").val(data.data.merchantDescribe);
            },
            error: function (msg) {
                alert(11)
            }
        });
    }

    /* 修改 */
    function xiugai(){
        var formData = new FormData($("#updateUser3")[0]);
        console.log(formData)
        $.ajax({
            type: "POST",
            dataType: "json",
            url:"/merchant/UpdataMerchantzhuyeById",
            data: formData,
            processData: false,
            contentType: false,
            success: function (data) {
                alert("修改成功");

            }, error: function () {
                console.log(formData);
                alert("修改失败");
            }
        })
    }




















    //图片回显
    var filemaxsize = 1024 * 1;//接受的文件最大10M
    function fileimg(file) {
        // 获取文件后缀名
        var size = file.files[0].size / 1024;
        if (size>filemaxsize){
            alert(size)
            alert("附件大小不能大于" + filemaxsize / 1024 + "M！");
            return false;
        }
        var ext=file.value.substring(file.value.lastIndexOf(".")+1).toLowerCase()
        // gif在IE浏览器暂时无法显示
        if(ext!='png'&&ext!='jpg'&&ext!='jpeg'){
            if (ext != '') {
                alert("图片的格式必须为png或者jpg或者jpeg格式！");
            }
            return;
        }
        $(file).next(".delimg").css("display","inline-block");
        var addImg= $(file).prevAll(".addImg").children("img")
        $(file).addClass("file")
        var reader= new FileReader()
        function getObjectURL(file)
        {
            var url = "";
            if(window.createObjectURL!=undefined)
            {
                url = window.createObjectURL(file);
            }
            else if(window.URL!=undefined)
            {
                url = window.URL.createObjectURL(file);
            }
            else if (window.webkitURL != undefined)
            {
                url = window.webkitURL.createObjectURL(file);
            }
            return url;
        }
        var files=file.files[0];//获取文件信息
        console.log(files);
        // var lujing = getObjectURL(files)
        reader.readAsDataURL(files);
        reader.onload = function(){
            //读取完成后，将结果赋值给img的src
            // imge.src=this.result
            // alert(lujing)
            $(addImg).attr("src",this.result)
        }
    }
    var clickImg = function(obj){
        $(obj).parent().find('.upload_input').click();
    }
    //H5渲染
    function html5Reader(file,pic,addImg,deleteImg){
        var file = file.files[0];
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function(e){
            pic.attr("src",this.result);
        }
    }
</script>


