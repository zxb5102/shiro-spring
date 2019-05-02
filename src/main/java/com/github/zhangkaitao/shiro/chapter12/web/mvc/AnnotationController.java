package com.github.zhangkaitao.shiro.chapter12.web.mvc;

import javax.annotation.PostConstruct;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-12
 * <p>Version: 1.0
 */
@Controller
public class AnnotationController {

    @RequestMapping("/hello1")
    public String hello1() {
        SecurityUtils.getSubject().checkRole("admin");
        return "success";
    }
    @RequestMapping("/login")
    public String login(@RequestParam String username,@RequestParam String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        subject.login(token);
    	return "success";
    }

    @RequiresRoles("admin")
    @RequestMapping("/hello2")
    public String hello2() {
        return "success";
    }
}
