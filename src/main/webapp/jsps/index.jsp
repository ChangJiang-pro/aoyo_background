<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title> 首页</title>
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






</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <center><h3 style="margin-bottom: 40px">首页</h3></center>
    <div class="tab-pane" id="profile">
        <div class="article">
            <div class="item" style="float:left;margin-left: 30px">
                <label for="businessLicenseTemp" class="btn btn-default addImg ">
                    <img src="<%=session.getAttribute("img") %>" width="100px" height="100px">
                </label>
                <input style="display: none" id="businessLicenseTemp" onchange="fileimg(this)" type="file" name="businessLicenseTemp" class="preview"/>
            </div>
        </div>
    </div>
    <div style="margin-right: 500px">
            <span style="font-size: 40px">您好，欢迎<%=session.getAttribute("name") %></span><br>
            <span style="font-size: 20px">用户权限：<%=session.getAttribute("username") %></span>
    </div>
    <div style="margin-top: 80px">
        <img src="https://wscdevil.oss-cn-beijing.aliyuncs.com/devil/image/410e2c1da7a36f3816f549a17ca7d100.jpg" width="1100px" height="500px">
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


