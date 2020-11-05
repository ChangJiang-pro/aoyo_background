package spring.aoyo_hou.mapper;


import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.pojo.SysUser;

import java.util.List;

public interface UserMapper {

    /*登陆*/
    SysUser login(SysUser user);
}
