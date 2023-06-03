package com.springboot05ems;

import com.springboot05ems.dao.DepartmentDao;
import com.springboot05ems.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.Collection;

@SpringBootTest
class SpringBoot05EmsApplicationTests {

    @Test
    void contextLoads() {
        DepartmentDao departmentDao = new DepartmentDao();
        Collection<Department> departments = departmentDao.getDepartments();
        System.out.println(departments);
    }
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads2() throws Exception {
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }
}
