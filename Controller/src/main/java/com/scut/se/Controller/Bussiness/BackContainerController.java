package com.scut.se.Controller.Bussiness;

import com.scut.se.Dao.entity.Container;
import com.scut.se.Service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//"/Back"为前缀
@RequestMapping(value = "/container",method = RequestMethod.GET)
public class BackContainerController {

    @Autowired
    private ContainerService containerService;

    //利用ResponseBody注解将对象转为字符串，实现以Json格式显示容器信息
    @ResponseBody
    @RequestMapping(value = "/showCtInfoByJson",method = RequestMethod.GET)
    public Container showCtInfoByJson(HttpServletRequest request, HttpServletResponse response){
        return containerService.getContainerByName("nginx");
    }

    //JSP网页形式显示容器信息，需要配置自动添加前后缀
    @RequestMapping(value = "/showContainerInfo",method = RequestMethod.GET)
    public String showContainersInfo(HttpServletRequest request,HttpServletResponse response){
        Container container = containerService.getContainerByName("nginx");
        request.getSession().setAttribute("container",container);
        return "getContainer";
    }
}
