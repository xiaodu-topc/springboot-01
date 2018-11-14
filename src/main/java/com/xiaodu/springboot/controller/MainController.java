package com.xiaodu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 15:15
 * @desc:
 */
@Controller
public class MainController {

    @RequestMapping("main")
    public String main() {
        return "main";
    }
}
