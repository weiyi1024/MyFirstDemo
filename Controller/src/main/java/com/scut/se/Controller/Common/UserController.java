package com.scut.se.Controller.Common;

import com.scut.se.Dao.entity.User;
import com.scut.se.Resp.UserInfo;
import com.scut.se.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注解该类为控制层类
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    //@ResponseBody
    //若没有ResponseBody注解，就会转发到返回值指向的地址
    public String userLogin(HttpServletRequest request, HttpServletResponse response){
        System.out.println("User login");
        return "login";
    }

    //有了ResponseBody注解，返回的是文本字符串
    @RequestMapping(value = "/logout")
    @ResponseBody
    public String userLogout(HttpServletRequest request, HttpServletResponse response){
        System.out.println("user logout");
        return "logout";
    }

    //利用@ResponseBody直接返回文本，返回Json格式的类实例
    @RequestMapping(value = "/getUserJson")
    @ResponseBody
    public UserInfo getUserJson(HttpServletRequest request, HttpServletResponse response){
        UserInfo mary = new UserInfo(true,"Mary",0,20);
        System.out.println("getUser");
        return mary;
    }

    //传数据给JSP去渲染，返回一个JSP页面
    @RequestMapping(value = "/getUserJsp")
    public String getUserJsp(HttpServletRequest request, HttpServletResponse response){
        UserInfo mary = new UserInfo(true,"Mary",0,20);
        System.out.println("getUser");
        request.setAttribute("user",mary);
        return "getUser";
    }

    @RequestMapping(value = "/getUserFromDB")
    @ResponseBody
    public User getUserFromDB(HttpServletRequest request, HttpServletResponse response){
        return userService.getUserByName("weiyi");
    }
}
