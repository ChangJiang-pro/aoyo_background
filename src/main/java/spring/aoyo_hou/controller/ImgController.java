package spring.aoyo_hou.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.service.ImgService;
import spring.aoyo_hou.utils.AliyunOSSUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("platformDriver")
public class ImgController {
    @Autowired
    private ImgService imgService;


    /*
    * 后端模块
    * 首页轮播图
    *
    * */

    //*查询轮播图表*//*
    @RequestMapping("slideshow")
    @ResponseBody
    public List<AoyoCommodityImg> slideshow() {
        List<AoyoCommodityImg> list = imgService.slideshow();
        return list;
    }

    /*删除*/
    @RequestMapping("shanchu")
    @ResponseBody
    public int shanchu(Integer id) {
        int i = imgService.shanchu(id);
        return i;
    }

    /*回显*/
    @RequestMapping("/huixian")
    public String  huixian(Integer commodityImgId, HttpServletRequest request) {
        AoyoCommodityImg img = imgService.huixian(commodityImgId);
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        request.setAttribute("IMG", img);
        System.out.println(img);
        return "index/rotateReplay";
    }


    //轮播图修改
    @RequestMapping("/Updataimage")
    @ResponseBody
    public int Updataimage(AoyoCommodityImg image,MultipartFile businessLicenseTemp, HttpServletRequest request) throws IOException {
        System.out.println(image);
        String imagename = businessLicenseTemp.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTemp.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);

        //修改信息
        image.setCommodityImgUrl("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl);
        System.out.println(image.getCommodityImgUrl());
        System.out.println(imageurl);
        System.out.println(image);

        int i = imgService.Updataimage(image);
        return 1;
    }

    /*
     * 后端模块
     * 首页功能按钮
     *
     * */
    @RequestMapping("slideshowtype")
    @ResponseBody
    public List<AoyoGroupFeaturedServices> slideshowtype() {
        List<AoyoGroupFeaturedServices> list = imgService.slideshowtype();
        System.out.println(list);
        return list;
    }

    /*回显*/
    @RequestMapping("/huixiantype")
    public String  huixiantype(Integer featuredServicesId, HttpServletRequest request) {
        AoyoGroupFeaturedServices TYPE = imgService.huixiantype(featuredServicesId);
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        request.setAttribute("TYPE", TYPE);
        System.out.println(TYPE);
        return "index/indextypeshow";
    }

    //功能按钮修改
    @RequestMapping("/Updataimagetype")
    @ResponseBody
    public int Updataimagetype(AoyoGroupFeaturedServices type11,MultipartFile businessLicenseTemp, HttpServletRequest request) throws IOException {
        System.out.println(type11);
        String imagename = businessLicenseTemp.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTemp.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);

        //修改信息
        type11.setFunctionButtonUrl("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl);
        System.out.println(type11.getFunctionButtonUrl());
        System.out.println(type11);
        int i = imgService.Updataimagetype(type11);
        return 1;
    }

}



