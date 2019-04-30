package com.zufe.bbscourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    //  @Autowired
    // private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String displayLoginPage(Model model) {
        model.addAttribute("title", "用户登录");
        return "user/user-login";
    }

}
