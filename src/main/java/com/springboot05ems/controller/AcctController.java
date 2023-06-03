package com.springboot05ems.controller;

import com.github.pagehelper.util.StringUtil;
import com.springboot05ems.dao.*;
import com.springboot05ems.pojo.AcctUser;
import com.springboot05ems.pojo.AdministrativeOffice;
import com.springboot05ems.pojo.Department;
import com.springboot05ems.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;

/**
 * @author Hfy
 * @date 2022/9/6 18:38
 */
@Controller
public class AcctController {
    /*管理员信息*/
    @Autowired
    private EmployeeDao employeeDao;
    /*部门信息*/
    @Autowired
    private DepartmentDao departmentDao;
    /*客户信息*/
    @Autowired
    private AcctUserDao acctUserDao;
    /*科室信息*/
    @Autowired
    private AdministrativeOfficeDao administrativeOfficeDao;


    //确认客户信息
    @PostMapping("/acctUpdate")
    public String updateEmp(AcctUser acctUser,HttpSession session) {
        System.out.println("登录用户为==》"+session.getAttribute("loginUser"));
        //获取当前登录用户
        String loginUser ="systemUser";
        if(StringUtils.isEmpty(session.getAttribute("loginUser"))){
             loginUser =session.getAttribute("loginUser").toString();
        }

        acctUserDao.update(acctUser);
        //返回客户修改页面
        return "redirect:/acct";
    }

//    //删除员工信息
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable("id") int id) {
//        employeeDao.delete(id);
//        return "redirect:/emps";
//    }
//
//    //注销
//    @RequestMapping("/logout")
//    public String logout(HttpSession session) {
//        session.invalidate();   // 让当前的session失效，但是失效的时候浏览器会立刻创建一个新的session，所以调用原来session的getAttribute方法时候一定会抛出NullPointerException
//        return "redirect:/index.html";
//    }
}

