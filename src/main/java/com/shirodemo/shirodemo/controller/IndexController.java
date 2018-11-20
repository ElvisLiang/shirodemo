package com.shirodemo.shirodemo.controller;

import com.shirodemo.shirodemo.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = {"/index","/"})
    public String index(Model model){
        User user = (User)SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user",user);
        return "index";
    }
}
