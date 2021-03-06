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
        /*修改*/
        function updata1() {
            var formData = new FormData($("#temp6")[0]);
            console.log("1212")
            console.log(formData)
            $.ajax({
                url: "/merchant/merchantUpdata",
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
    <h3 style="margin-bottom: 40px">商户详情</h3>
    <div style="margin: 40px; margin-top: 94px; box-shadow: 0 0 4px black; height: 620px; padding: 25px 50px 0 50px; text-align: left;" id="temp1">
        <form id="temp6"  type="post"  enctype="multipart/form-data">
            <table style="float:left;">
                <input type="hidden" value="${MER.merchantId}" name="merchantId">
                <input type="hidden" value="${MER.groupId}" name="groupId">
                <tr>
                   <span>
                         <td><span style="margin-top: 6px">商户名称：</span>
                         <input type="text" value="${MER.merchantName}" class="form-control" disabled name="merchantName"></td>
                         <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">商户类型：</span>
                         <input type="text" value="${MER.merchantType}" class="form-control" disabled name="merchantType"></td>

                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">商铺地址：</span>
                         <input type="text" value="${MER.merchantAddress}" class="form-control" disabled name="merchantAddress"></td>
                   </span>
                </tr>

                <tr>
                   <span>
                         <td><span style="margin-top: 6px">创建时间：</span>
                         <input type="text" value="${MER.groupCreateTime}" id="time" class="form-control date_1" disabled ></td>
                         <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">商铺电话：</span>
                         <input type="text" value="${MER.merchantTel}" class="form-control" disabled name="merchantTel"></td>

                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">联&nbsp;&nbsp;系&nbsp;&nbsp;人：</span>
                         <input type="text" value="${MER.merchantContacts}" class="form-control" disabled name="merchantContacts"></td>
                   </span>
                </tr>


                <tr>
                   <span>
                         <td><span style="margin-top: 6px">状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态：</span>
                         <input type="text" value="${MER.merchantStatus}" class="form-control" disabled name="merchantStatus"></td>
                         <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">法&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;人：</span>
                         <input type="text" value="${MER.groupLeader}" class="form-control" disabled name="groupLeader"></td>

                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

                          <td><span style="margin-top: 6px">法人电话：</span>
                         <input type="text" value="${MER.groupLeaderTel}" class="form-control" disabled name="groupLeaderTel"></td>
                   </span>
                </tr>


            </table>
            <div class="tab-pane" id="profile">
                <div class="article">
                    <div class="item" style="float:left;margin-left: 30px">
                        <span style="margin-top: 6px">法人身份证正面照：</span><br>
                        <label for="businessLicenseTemp" class="btn btn-default addImg ">

                            <img src="${MER.groupLegalPersonImgJust}" width="200px" height="200px">
                        </label>
                        <input style="display: none" id="businessLicenseTemp" onchange="fileimg1(this)" type="file" name="businessLicens    eTemp" class="preview"/>
                    </div>
                </div>
                <div class="article">
                    <div class="item" style="float:left;margin-left: 30px">
                        <span style="margin-top: 6px">法人身份证反面照：</span><br>
                        <label for="businessLicenseTempOne" class="btn btn-default addImg ">

                            <img src="${MER.groupLegalPersonImgBack}" width="200px" height="200px">
                        </label>
                        <input style="display: none" id="businessLicenseTempOne" onchange="fileimg(this)" type="file" name="businessLicenseTempOne" class="preview"/>
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