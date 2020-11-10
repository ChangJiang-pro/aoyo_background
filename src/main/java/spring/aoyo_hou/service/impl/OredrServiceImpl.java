package spring.aoyo_hou.service.impl;

import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.OrderMapper;
import spring.aoyo_hou.pojo.*;
import spring.aoyo_hou.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OredrServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<dingDanJiHe> orderShow() {
        return orderMapper.orderShow();
    }

    @Override
    public int orderShowbyId(dingDanJiHe ding) {
        return orderMapper.orderShowbyId(ding);
    }

    @Override
    public List<makeAnAppointment> makeAnAppointmentShow() {
        return orderMapper.makeAnAppointmentShow();
    }

    @Override
    public int makeAnAppointmentUodate(makeAnAppointment yuyue) {
        return orderMapper.makeAnAppointmentUodate(yuyue);
    }
}
