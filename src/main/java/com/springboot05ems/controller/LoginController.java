package com.springboot05ems.controller;

import com.springboot05ems.dao.EmployeeDao;
import com.springboot05ems.entity.HxYuangong;
import com.springboot05ems.service.HxYuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author BoBooY
 * @date 2022/9/6 11:52
 */
@Controller
public class LoginController {
    /*管理员信息*/
    @Autowired
    private HxYuangongService hxYuangongService;

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {

        //任意用户名和123密码即可登录
//        if(!StringUtils.isEmpty(username) && password.equals("123")) {
//            //登录注册session
//            session.setAttribute("loginUser",username);
//            return "redirect:/main.html"; //跳转首页
//        } else {
//            //登录失败！存放错误信息
//            model.addAttribute("msg","用户名或密码错误！");
//            return "index";
//        }
            if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            List<HxYuangong> list= new ArrayList<>();
            HxYuangong hxYuangong =new HxYuangong();
            hxYuangong.setName(username);//用户名
            hxYuangong.setPassword(password);//密码
            list = hxYuangongService.queryById(hxYuangong);
            if(list != null && !list.isEmpty()){
                //登录注册session
                session.setAttribute("loginUser",username);
                return "redirect:/main.html"; //跳转首页
            }else {
                //登录失败！存放错误信息
                model.addAttribute("msg","用户名或密码错误！");
                return "index";
            }

        } else {
            //登录失败！存放错误信息
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }
    }
}
