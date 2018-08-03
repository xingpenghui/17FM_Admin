package com.feri.web.controller;

import com.feri.pojo.SysUser;
import com.feri.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 *@Author feri
 *@Date Created in 2018/8/3 12:24
 */
@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    //新增
    //登录
    @PostMapping("sysuserlogin.do")
    public String login(String username, String password, HttpSession session, Model model){
        SysUser user=sysUserService.selectByUsername(username,password);
        if(user!=null){
            session.setAttribute("user",user);
            return "admin.jsp";
        }else{
            model.addAttribute("msg","账号无效");
            return "login.jsp";
        }
    }
}
