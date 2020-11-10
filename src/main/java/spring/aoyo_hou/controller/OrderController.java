package spring.aoyo_hou.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.aoyo_hou.pojo.*;
import spring.aoyo_hou.service.ImgService;
import spring.aoyo_hou.service.OrderService;

import java.util.List;


@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /*
    *
    * 订单管理
    *
    * */
    /*订单列表展示*/
    @RequestMapping("orderShow")
    @ResponseBody
    public List<dingDanJiHe> orderShow() {
        List<dingDanJiHe> list = orderService.orderShow();
        return list;
    }
    /*订单修改*/
    @RequestMapping("orderShowbyId")
    @ResponseBody
    public int orderShowbyId(dingDanJiHe ding) {
        int i = orderService.orderShowbyId(ding);
        return i;
    }

    /*预约订单展示*/
    @RequestMapping("makeAnAppointmentShow")
    @ResponseBody
    public List<makeAnAppointment> makeAnAppointmentShow() {
        List<makeAnAppointment> list = orderService.makeAnAppointmentShow();
        System.out.println(123);
        System.out.println(list);
        return list;
    }


    /*预约订单修改*/
    @RequestMapping("makeAnAppointmentUodate")
    @ResponseBody
    public int makeAnAppointmentUodate(makeAnAppointment yuyue) {
        int i = orderService.makeAnAppointmentUodate(yuyue);
        return i;
    }

}



