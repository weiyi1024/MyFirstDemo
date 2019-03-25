package com.scut.se.Controller.Bussiness;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//"/Back"为前缀
public class BackController {

    @RequestMapping(value = "/showUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public String showUserInfo(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Login Success!");
        return "This is a page to tell you login success";
    }

}
