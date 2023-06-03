package com.springboot05ems.dao;

import com.springboot05ems.entity.HxCustom;
import com.springboot05ems.pojo.AcctUser;
import com.springboot05ems.service.HxCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author 用户信息
 * @date 2023/4/28 20:25
 */
@Repository
public class AcctUserDao {
    // 模拟数据库中的数据
    private static Map<Integer, AcctUser> acctList = null;
@Autowired
private HxCustomService hxCustomService;
    static {
        acctList = new HashMap<>();   // 创建一个用户信息
        try{
            acctList.put(1001, new AcctUser(1001,"123",0,"30","13022202220","医生","上海","暂无",103,"0",new Date(),"02",null));
//            acctList.put(1002, new AcctUser());
//            acctList.put(1003, new AcctUser());
//            acctList.put(1004, new AcctUser());
//            acctList.put(1005, new AcctUser());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    // 增加员工/修改员工,主键自增
    private static Integer initid = 1006;



    public void save(AcctUser userDao){
        if(userDao.getId()==null){
            userDao.setId(initid++);
        }
      //  employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        acctList.put(userDao.getId(),userDao);
    }
    public void update(AcctUser userDao){
        if(userDao.getId()==null){
            userDao.setId(initid++);
        }
        //  employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        acctList.put(userDao.getId(),userDao);
    }

    // 查询全部员工信息
    public Collection<AcctUser> getAll(){
        return acctList.values();
    }


    // 通过ID客户基本信息
    public AcctUser getAcctUser(Integer id){
        return acctList.get(id);
    }
    // 删除员工
    public void delete(Integer id){
        acctList.remove(id);
    }

    // 查询全部客户信息
    public HxCustom getHxCustomAll(){
       HxCustom cc=hxCustomService.queryById("0000000001");
       return cc;
       // return null;
    }
}
