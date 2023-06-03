package com.springboot05ems.service.impl;

import com.springboot05ems.entity.HxDepartment;
import com.springboot05ems.mapper.HxDepartmentDao;
import com.springboot05ems.service.HxDepartmentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (HxDepartment)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 23:40:25
 */
@Service("hxDepartmentService")
public class HxDepartmentServiceImpl implements HxDepartmentService {
    @Resource
    private HxDepartmentDao hxDepartmentDao;


    @Override
    public  List<HxDepartment> queryByDepartId() {
     List<HxDepartment> listDepart = hxDepartmentDao.queryByDepartId();
        return listDepart;
    }

    @Override
    public boolean deleteById() {
        return false;
    }

    @Override
    public HxDepartment update(HxDepartment hxDepartment) {
        return null;
    }

    @Override
    public HxDepartment insert(HxDepartment hxDepartment) {
        return null;
    }
}
