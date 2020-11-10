package spring.aoyo_hou.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import spring.aoyo_hou.pojo.*;
import spring.aoyo_hou.response.BaseResponse;
import spring.aoyo_hou.service.MerchantService;
import spring.aoyo_hou.service.UserService;
import spring.aoyo_hou.utils.AliyunOSSUtil;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;


    //*查询商户列表*//*
    @RequestMapping("merchantshow")
    @ResponseBody
    public List<AoyoMerchant> merchantshow() {
        List<AoyoMerchant> list = merchantService.merchantshow();
        //System.out.println(list);
        return list;
    }


    /*回显*/
    @RequestMapping("/merchantshowhuixian")
    public String  merchantshowhuixian(Integer merchantId, HttpServletRequest request) {
        AoyoMerchant mer = merchantService.merchantshowhuixian(merchantId);
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        request.setAttribute("MER", mer);
        return "merchant/merchantshowe";
    }

    //商户修改
    @RequestMapping("/merchantUpdata")
    @ResponseBody
    public int merchantUpdata(AoyoMerchant image , MultipartFile businessLicenseTemp, MultipartFile businessLicenseTempOne,HttpServletRequest request) throws IOException {
        String imagename = businessLicenseTemp.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTemp.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);
        //修改信息
        image.setGroupLegalPersonImgJust("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl);


        String imagename1 = businessLicenseTempOne.getOriginalFilename();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddHHmmss");
        String str1 = format1.format(new Date());
        File filename1 = new File(str1+imagename1);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTempOne.getInputStream(),filename1);
        String imageurl1= AliyunOSSUtil.upload(filename1);
        image.setGroupLegalPersonImgBack("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl1);
        int i = merchantService.merchantUpdata(image);
        return 1;
    }





    /*
    *
    * 商户列表
    *
    * */



    //*查询商户列表*//*
    @RequestMapping("merchantzhuye")
    @ResponseBody
    public List<AoyoMerchant> merchantzhuye() {
        List<AoyoMerchant> list = merchantService.merchantzhuye();
        return list;
    }


    /*商户首页单查*/
    @RequestMapping("/merchantzhuyeById")
    @ResponseBody
    public BaseResponse merchantzhuyeById( Integer merchantId, HttpServletRequest request) {
        AoyoMerchant merchant = merchantService.merchantzhuyeById(merchantId);
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(merchant);
        return new BaseResponse(200,"success0",merchant) ;
    }


    //功能按钮修改
    @RequestMapping("/UpdataMerchantzhuyeById")
    @ResponseBody
    public int UpdataMerchantzhuyeById(AoyoMerchant merch,MultipartFile businessLicenseTemp, HttpServletRequest request) throws IOException {
        System.out.println(businessLicenseTemp);
        System.out.println(merch);
        String imagename = businessLicenseTemp.getOriginalFilename();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(new Date());
        File filename = new File(str+imagename);
        //转multipart为file
        FileUtils.copyInputStreamToFile(businessLicenseTemp.getInputStream(),filename);
        String imageurl= AliyunOSSUtil.upload(filename);

        //修改信息
        merch.setMerchantImg("https://wscdevil.oss-cn-beijing.aliyuncs.com/"+imageurl);
        System.out.println(merch.getMerchantImg());
        System.out.println(merch);
        int i = merchantService.UpdataMerchantzhuyeById(merch);
        return i;
    }




    /*
    *
    * 特色服务
    *
    * */


    //*特色服务列表*//*
    @RequestMapping("merchantFuWu")
    @ResponseBody
    public List<AoyoMerchant> merchantFuWu() {
        List<AoyoMerchant> list = merchantService.merchantFuWu();
        System.out.println(list);
        return list;
    }


    /*特色服务单查*/
    @RequestMapping("/merchantFuWuById")
    @ResponseBody
    public BaseResponse merchantFuWuById( Integer featuredServicesId, HttpServletRequest request) {
        AoyoGroupFeaturedServices merchant = merchantService.merchantFuWuById(featuredServicesId);
        System.out.println(merchant);
        return new BaseResponse(200,"success0",merchant) ;
    }

    /*特色服务修改*/
    @RequestMapping("merchantFuWuXiuGaiById")
    @ResponseBody
    public int merchantFuWuXiuGaiById(AoyoGroupFeaturedServices feature) {
        int i = merchantService.merchantFuWuXiuGaiById(feature);
        return i;
    }



    /*
    *
    * 套餐类型
    *
    * */


    //*特色服务列表*//*
    @RequestMapping("merchantTaoCan")
    @ResponseBody
    public List<AoyoGroupFeaturedServices> merchantTaoCan() throws ParseException {
        List<AoyoGroupFeaturedServices> list = merchantService.merchantTaoCan();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(new Date());
        Date date =  sdf.parse(s);
        System.out.println(list);
        return list;
    }


    //*特色服务修改*//*
    @RequestMapping("merchantTaoCanbyId")
    @ResponseBody
    public BaseResponse merchantTaoCanbyId( AoyoGroupFeaturedServices featuredServices, HttpServletRequest request) throws ParseException {
        int i  = merchantService.merchantTaoCanbyId(featuredServices);
        System.out.println(featuredServices);
        return new BaseResponse(200,"success0",featuredServices) ;
    }



}



