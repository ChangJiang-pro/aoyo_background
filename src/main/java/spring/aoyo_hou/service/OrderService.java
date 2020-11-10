package spring.aoyo_hou.service;


import spring.aoyo_hou.pojo.dingDanJiHe;
import spring.aoyo_hou.pojo.makeAnAppointment;

import java.util.List;

public interface OrderService {

    List<dingDanJiHe> orderShow();

    int orderShowbyId(dingDanJiHe ding);

    List<makeAnAppointment> makeAnAppointmentShow();

    int makeAnAppointmentUodate(makeAnAppointment yuyue);
}
