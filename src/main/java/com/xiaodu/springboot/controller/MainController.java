package com.xiaodu.springboot.controller;

import cn.hutool.core.util.ObjectUtil;
import com.xiaodu.springboot.entity.User;
import com.xiaodu.springboot.jpa.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 15:15
 * @desc:
 */
@Controller
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    private @Autowired UserRepository repository;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String username, String password, boolean remeberCheckbox, Model model,
                        HttpServletRequest request,HttpServletResponse response) {
//        验证是否记录cookie
        if(remeberCheckbox){
        Cookie cookieremember = new Cookie("remember",remeberCheckbox + "");
            Cookie cookieuser = new Cookie("username",username);
            Cookie cookiepass = new Cookie("password",password);
            Cookie[] cookies = request.getCookies();
            if(cookies != null)
            for (Cookie cookie: cookies) {
                System.out.println(cookie.getName() + ":" + cookie.getValue());
            }
            response.addCookie(cookieremember);
            response.addCookie(cookieuser);
            response.addCookie(cookiepass);
        }

//        登录验证
         User user = repository.getUserByUsername(username);
        // 验证用户名
        if(!ObjectUtils.isEmpty(user)) {
            if(password.equals(user.getPassword())) {   // 登录成功
            return "dashboard";
            }else {
                model.addAttribute("msg","密码不正确");
            }
        }else {
            // 验证失败  返回登录界面index
            model.addAttribute("msg","用户名不存在");
        }
        return "index";
    }
}
