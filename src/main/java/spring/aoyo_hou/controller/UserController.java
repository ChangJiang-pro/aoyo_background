package spring.aoyo_hou.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.aoyo_hou.pojo.SysUser;
import spring.aoyo_hou.pojo.User;
import spring.aoyo_hou.response.BaseResponse;
import spring.aoyo_hou.response.JsonData;
import spring.aoyo_hou.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    //登录
    @RequestMapping("login")
    public String login(SysUser user, HttpSession session) {
        SysUser user1 = userService.login(user);
        session.setAttribute("name",user1.getUserName());
        session.setAttribute("username",user1.getUserAlias());
        session.setAttribute("img",user1.getUserImagePath());
        if (user1 != null) {
            session.setAttribute("USER", user1);
            return "index";
        } else {
            return "login";
        }
    }




}



