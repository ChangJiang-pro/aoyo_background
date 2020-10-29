package spring.aoyo_hou.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.service.ImgService;

import java.util.List;

@RestController
@RequestMapping("platformDriver")
public class ImgController {
    @Autowired
    private ImgService imgService;


    //*查询轮播图表*//*
    @RequestMapping("slideshow")
    @ResponseBody
    public List<AoyoCommodityImg> slideshow() {
        List<AoyoCommodityImg> list = imgService.slideshow();
        System.out.println(list);
        return list;
    }


    /*学习中心修改是否允许招生*//*
    *//*不允许 updatewschool*//*
    @RequestMapping("updatewZcenroll2")
    @ResponseBody
    public int updatewZcenroll2(Integer id) {
        int i = wenrollService.updatewZcenroll2(id);
        return i;
    }*/
}



