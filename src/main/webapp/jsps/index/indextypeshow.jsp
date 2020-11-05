<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>轮播图详情</title>
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
    <style>
        span {
            float: left;
        }

        #temp1 input {
            width: 150px;
        }

        #temp1 table tr {
            height: 50px;
        }

        #temp3 input {
            width: 100px;
        }

        img {
            height:   240px;
            width: 325px;
            float: left;
            box-shadow: 0 0 5px black;
        }
        /*//这是一个用做回显的盒子的样式*/
        .pic{
            width: 100px;
            height: 100px;
        }
        .pic img {
            width: 100%;
            height: 100%;
        }
    </style>
    <script>
        $(function () {
            $('.date_1').cxCalendar();
        })
        function updata() {
            $("input").removeAttr("disabled");
            $(".temp4").css("display", "none");
            $(".temp5").css("display", "block");
        }
        function updata1() {
            var formData = new FormData($("#temp6")[0]);
            console.log(formData)
            $.ajax({
                url: "/platformDriver/Updataimagetype",
                data: formData,
                type: "POST",
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("修改成功");

                }, error: function () {
                    alert("修改失败");
                }
            })
            $("#temp1 table input").attr("disabled", "disabled");
            $(".temp4").css("display", "block");
            $(".temp5").css("display", "none");
        }
    </script>
</head>

<body>
<c:import url="../utlis/background.jsp"/>
<c:import url="../utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">功能按钮详情</h3>
    <div style="margin: 40px; margin-top: 94px; box-shadow: 0 0 4px black; height: 620px; padding: 25px 50px 0 50px; text-align: left;" id="temp1">
        <form id="temp6" enctype="multipart/form-data" type="post" >
            <table style="float:left;">
                <input type="hidden" value="${TYPE.featuredServicesId}" name="featuredServicesId">
                <tr>
                    <td><span>名称：</span></td>
                    <td><input type="text" value="${TYPE.functionButtonName}" class="form-control" disabled name="functionButtonName"></td>
                </tr>
                <tr>
                    <td><span>描述 ：</span></td>
                    <td><input type="text" value="${TYPE.featuredServicesDesc}" class="form-control" disabled name="featuredServicesDesc"></td>
                </tr>
                <tr>
                    <td><span>修改时间：</span></td>
                    <td><input type="text" value="${TYPE.createTime}" id="time" class="form-control date_1" disabled></td>
                </tr>
                <tr>
                    <td><span>状态：</span></td>
                    <td><input type="text" value="${TYPE.featuredServicesIsenable}" class="form-control date_1" disabled name="featuredServicesIsenable"></td>
                </tr>
            </table>
            <div class="tab-pane" id="profile">
                <div class="article">
                    <div class="item" style="float:left;margin-left: 30px">
                        <label for="businessLicenseTemp" class="btn btn-default addImg ">
                            <img src="${TYPE.functionButtonUrl}" width="200px" height="200px">
                        </label>
                        <input style="display: none" id="businessLicenseTemp" onchange="fileimg(this)" type="file" name="businessLicenseTemp" class="preview"/>
                    </div>
                </div>
            </div>


        </form>
        <div style="float: right; margin-top: 250px;" id="temp3">
            <input type="button" value="修改" class="btn-primary btn temp4" onclick="updata()">
            <input type="button" value="完成" class="btn-primary btn temp5" onclick="updata1()" style="margin-left: 1em; display: none;">
        </div>
    </div>
</div>
</body>


</html>
<script>
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