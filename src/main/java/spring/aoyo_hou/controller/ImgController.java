package spring.aoyo_hou.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import spring.aoyo_hou.pojo.*;
import spring.aoyo_hou.response.BaseResponse;
import spring.aoyo_hou.service.ImgService;
import spring.aoyo_hou.utils.AliyunOSSUtil;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
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


    /*
    *
    * APP分类列表
    *
    * */

    /*展示APP分类列表*/
    @RequestMapping("appFenLei")
    @ResponseBody
    public List<AoyoAppClass> appFenLei() {
        List<AoyoAppClass> list = imgService.appFenLei();
        return list;
    }

    /*展示APP分类修改*/
    @RequestMapping("appFenLeibyId")
    @ResponseBody
    public BaseResponse appFenLeibyId(AoyoAppClass appClass, HttpServletRequest request)  {
        int i  = imgService.appFenLeibyId(appClass);
        System.out.println(appClass);
        return new BaseResponse(200,"success0",appClass) ;
    }



    /*展示APP商品品牌*/
    @RequestMapping("appBrand")
    @ResponseBody
    public List<AoyoCommodityBrand> appBrand() {
        List<AoyoCommodityBrand> list = imgService.appBrand();
        System.out.println(list);
        return list;
    }


    /*APP商品品牌修改*/
    @RequestMapping("appBrandbyId")
    @ResponseBody
    public BaseResponse appBrandbyId(AoyoCommodityBrand commodityBrand, HttpServletRequest request)  {
        int i  = imgService.appBrandbyId(commodityBrand);
        return new BaseResponse(200,"success0",commodityBrand) ;
    }

    /*APP商品功能模块*/
    @RequestMapping("appcommodity")
    @ResponseBody
    public List<AoyoAppClass> appcommodity(){
        List<AoyoAppClass> list = imgService.appcommodity();
        System.out.println(list);
        return list;
    }


    /*APP商品功能模块修改*/
    @RequestMapping("/UpdataAppCommodity")
    @ResponseBody
    public int UpdataAppCommodity(AoyoAppClass appClass,MultipartFile businessLicenseTemp, HttpServletRequest request) throws IOException {
        System.out.println(appClass);
        String imagename = businessLicenseTemp.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTemp.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);

        //修改信息
        appClass.setAppClassIcon("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl);
        System.out.println(appClass.getAppClassIcon());
        System.out.println(appClass);
        int i = imgService.UpdataAppCommodity(appClass);
        return 1;
    }

}



