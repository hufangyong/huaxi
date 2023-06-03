package com.springboot05ems.service;


import com.springboot05ems.entity.HxDepartment;

import java.util.List;

/**
 * (HxDepartment)表服务接口
 *
 * @author makejava
 * @since 2023-05-07 23:40:25
 */
public interface HxDepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    List<HxDepartment> queryByDepartId( );



    /**
     * 新增数据
     *
     * @param hxDepartment 实例对象
     * @return 实例对象
     */
    HxDepartment insert(HxDepartment hxDepartment);

    /**
     * 修改数据
     *
     * @param hxDepartment 实例对象
     * @return 实例对象
     */
    HxDepartment update(HxDepartment hxDepartment);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    boolean deleteById( );

}
