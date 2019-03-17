package com.scut.se.Controller.Common;

import com.scut.se.Resp.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CommonController {
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String getLoginPage(HttpServletRequest request, HttpServletResponse response) {
        return "loginPage";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public void verify(HttpServletRequest request, HttpServletResponse response, String user, String password) throws IOException {
        System.out.println("user" + user + ":" + password);
        String basePath = request.getScheme() + "://" + request.getServerName() + ":"
                + request.getServerPort() + request.getContextPath() + "/";
        if (user.equals("weiyi") && password.equals("123")) {
            UserBean userBean = new UserBean();
            userBean.setName(user);
            userBean.setPwd(password);
            request.getSession().setAttribute("user", userBean);

            response.sendRedirect(basePath + "Back/showUserInfo");
        } else
            response.sendRedirect(basePath+"loginPage");
    }
}
