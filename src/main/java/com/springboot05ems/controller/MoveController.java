package com.springboot05ems.controller;

import com.springboot05ems.dao.AcctUserDao;
import com.springboot05ems.dao.AdministrativeOfficeDao;
import com.springboot05ems.dao.DepartmentDao;
import com.springboot05ems.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hfy
 * @date 2022/9/6 18:38
 */
@Controller
public class MoveController {
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

    private String  url;
    //视频信息上传(客户信息页面跳转视频上传页面)


    @RequestMapping(value = "/moverAddressAdd", produces = "application/json;charset=UTF-8")
    public String updateEmp(HttpSession session, @RequestParam("v_file")MultipartFile file, Model model) {
        //v_file :前端页面视频视频上传路径
        System.out.print("上传文件==="+"\n");
        if(1==1){
            model.addAttribute("msg","文件已经存在,不需要重复上传！！！");
            return "emp/addMove";
        }

        //判断文件是否为空
        if (file.isEmpty()) {
            return "上传文件不可为空";
        }
        // 获取文件名
        String fileName = file.getOriginalFilename();
//        System.out.print("上传的文件名为: "+fileName+"\n");

      //  fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
        System.out.print("（加个时间戳，尽量避免文件名称重复）保存的文件名为: "+fileName+"\n");


        //加个时间戳，尽量避免文件名称重复(视频上传本地路径测试)
        String path = "D:/huaxixueyuanXcx/shipinshangchuanlujin/" +fileName;
        //String path = "E:/fileUpload/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
        //文件绝对路径
        System.out.print("保存文件绝对路径"+path+"\n");

        //创建文件路径
        File dest = new File(path);
        //判断文件是否已经存在
        if (dest.exists()) {
            model.addAttribute("msg","文件已经存在");
            return "emp/addMove";
        }
        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            //上传文件
            file.transferTo(dest); //保存文件
            System.out.print("保存文件路径"+path+"\n");
            url="http://localhost:8080/images/"+fileName;
          //  int jieguo= shiPinService.insertUrl(fileName,path,url);
       //     System.out.print("插入结果"+jieguo+"\n");
            System.out.print("保存的完整url===="+url+"\n");

        } catch (IOException e) {
            return "上传失败";
        }
        System.out.println("登录用户为==》"+session.getAttribute("loginUser"));
        //获取当前登录用户
        String loginUser ="systemUser";
        if(StringUtils.isEmpty(session.getAttribute("loginUser"))){
             loginUser =session.getAttribute("loginUser").toString();
        }

     //   acctUserDao.update(acctUser);
        //返回视频上传页面
        return "emp/addMove";
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

