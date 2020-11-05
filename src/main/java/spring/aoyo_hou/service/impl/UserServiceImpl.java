package spring.aoyo_hou.service.impl;

import org.springframework.stereotype.Service;
import spring.aoyo_hou.mapper.ImgMapper;
import spring.aoyo_hou.mapper.UserMapper;
import spring.aoyo_hou.pojo.AoyoCommodityImg;
import spring.aoyo_hou.pojo.AoyoGroupFeaturedServices;
import spring.aoyo_hou.pojo.SysUser;
import spring.aoyo_hou.service.ImgService;
import spring.aoyo_hou.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public SysUser login(SysUser user) {
        return userMapper.login(user);
    }
}
