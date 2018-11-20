package com.shirodemo.shirodemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login(){
       boolean isLogin =  SecurityUtils.getSubject().isAuthenticated();
       if(isLogin){
           return "redirect:index";
       }else{
            return "login";
       }
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model){
        Subject subject = SecurityUtils.getSubject();
        try{
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            subject.login(token);
            return "redirect:index";
        }catch (UnknownAccountException e){
            log.info("Sorry未知的账户");
            model.addAttribute("message","未知的账户");
        }catch (DisabledAccountException e){
            log.info("冻结的账户");
            model.addAttribute("message","冻结的账户");
        }catch(IncorrectCredentialsException e){
            log.info("密码输入错误");
            model.addAttribute("message","密码输入错误");
        }catch(AuthenticationException e){
            log.info("认证失败！用户名不存在");
            model.addAttribute("message","用户名不存在");
        }catch(Exception e){
            log.info("未知错误");
            model.addAttribute("message","未知错误");
        }
        return "login";
    }
    @RequestMapping("/logout")
    @ResponseBody
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "您已经退出登陆";
    }
}
