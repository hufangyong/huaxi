package com.springboot05ems.dao;

import com.springboot05ems.pojo.AdministrativeOffice;
import com.springboot05ems.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Hfy
 * @date 2023/4/25 19:57
 */
@Repository
public class AdministrativeOfficeDao {
    // 模拟数据库中的数据
    private static Map<Integer, AdministrativeOffice> adminis = null;

    static {
        adminis = new HashMap<Integer, AdministrativeOffice>();   // 创建一个部门集合

        adminis.put(101,new AdministrativeOffice(101,"骨科"));
        adminis.put(102,new AdministrativeOffice(102,"外科"));
        adminis.put(103,new AdministrativeOffice(103,"内科"));
        adminis.put(104,new AdministrativeOffice(104,"消化科"));
        adminis.put(105,new AdministrativeOffice(105,"皮肤科"));

    }

    //获取所有科室的信息
    public Collection<AdministrativeOffice> getAdministrative() {
        return adminis.values();
    }

    // 通过ID查询部门
    public AdministrativeOffice getAdministrativById(Integer id) {
        return adminis.get(id);
    }
}
