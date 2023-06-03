package com.springboot05ems.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class AddMoveDao {



    //插入
    public int insertUrl(String name,String lujing,String url){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=lujing=="+lujing+"\n");
        System.out.print("开始插入=url=="+url+"\n");
    //    int jieguo=shiPinDao.insertUrl(name,lujing,url);
   //     System.out.print("插入结果==="+jieguo+"\n");
        return 0;
    }
//    //查询
//    public List<Shipin> selectShipin(){
//        List<Shipin> shipins=shiPinDao.selectShipin();
//        return  shipins;
//    }
}
