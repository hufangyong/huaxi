package com.springboot05ems.controller;

import com.springboot05ems.dao.AcctUserDao;
import com.springboot05ems.dao.AdministrativeOfficeDao;
import com.springboot05ems.dao.DepartmentDao;
import com.springboot05ems.dao.EmployeeDao;
import com.springboot05ems.entity.HxCustom;
import com.springboot05ems.entity.HxDepartment;
import com.springboot05ems.entity.HxYuangong;
import com.springboot05ems.pojo.AcctUser;
import com.springboot05ems.pojo.AdministrativeOffice;
import com.springboot05ems.pojo.Department;
import com.springboot05ems.pojo.Employee;
import com.springboot05ems.service.HxDepartmentService;
import com.springboot05ems.service.HxYuangongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author BoBooY
 * @date 2022/9/6 18:38
 */
@Controller
public class EmployeeController {
    /*管理员信息*/
    @Autowired
    private EmployeeDao employeeDao;
    /*部门信息*/
    @Autowired
    private DepartmentDao departmentDao;
    /*客户信息*/
    @Autowired
    private AcctUserDao acctUser;
    /*科室信息*/
    @Autowired
    private AdministrativeOfficeDao administrativeOfficeDao;
    /*页面获取最新部门信息*/
    @Autowired
    private HxDepartmentService hxDepartmentService;

    //跳转到list页面
    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        System.out.println(employees);
        model.addAttribute("emps", employees);
        return "emp/list";
    }
    //跳转到acct页面获取所有录入用户信息
    @RequestMapping("/acct")
    public String acct(Model model) {
     //  Collection<AcctUser> acct = acctUser.getAll();
      HxCustom acct = acctUser.getHxCustomAll();
        System.out.println(acct);
        model.addAttribute("accts", acct);
        return "emp/acctBook";
    }
    //视频上传页面
    @RequestMapping("/moveAdd")
    public String moveAdd(Model model) {
        //  Collection<AcctUser> acct = acctUser.getAll();
        HxCustom acct = acctUser.getHxCustomAll();
        List<HxDepartment> depatList =new ArrayList<>();
        depatList = hxDepartmentService.queryByDepartId();
        System.out.println(acct);
        //页面获取部门下拉选项信息
        model.addAttribute("depats", depatList);
        return "emp/addMove";
    }
    //跳转添加员工页面
    @GetMapping("/add")
    public String add(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    //添加员工
    @PostMapping("/addEmp")
    public String addEmp(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //跳转至编辑员工信息页面
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        Employee employee = employeeDao.getEmployee(id);
        // System.out.println(employee);
        model.addAttribute("emp", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/update";
    }

    //跳转至编辑客户信息页面
    @GetMapping("/updateAcct/{id}")
    public String updateAcct(@PathVariable("id") int id, Model model) {
        AcctUser aUser = acctUser.getAcctUser(id);
        // System.out.println(employee);
        model.addAttribute("acctUser", aUser);//客户信息
        Collection<AdministrativeOffice> administrative =administrativeOfficeDao .getAdministrative();
        model.addAttribute("administratives", administrative);//科室信息
        return "emp/updateAcct";
    }

    //修改员工信息
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //删除员工信息
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }

    //注销
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();   // 让当前的session失效，但是失效的时候浏览器会立刻创建一个新的session，所以调用原来session的getAttribute方法时候一定会抛出NullPointerException
        return "redirect:/index.html";
    }
}

