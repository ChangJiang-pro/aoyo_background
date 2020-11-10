package spring.aoyo_hou.mapper;


import spring.aoyo_hou.pojo.dingDanJiHe;
import spring.aoyo_hou.pojo.makeAnAppointment;

import java.util.List;

public interface OrderMapper {

    /*商品列表展示*/
    List<dingDanJiHe> orderShow();


   /* 商品修改*/
    int orderShowbyId(dingDanJiHe ding);

    /*预约订单展示*/
    List<makeAnAppointment> makeAnAppointmentShow();

    /*预约订单修改*/
    int makeAnAppointmentUodate(makeAnAppointment yuyue);
}
