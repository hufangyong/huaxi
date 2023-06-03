package com.springboot05ems.service;

import com.springboot05ems.entity.HxYuangong;

import java.util.List;

/**
 * (HxYuangong)表服务接口
 *
 * @author makejava
 * @since 2023-05-07 17:01:36
 */
public interface HxYuangongService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    List<HxYuangong> queryById(HxYuangong hxYuangong );

//    /**
//     * 分页查询
//     *
//     * @param hxYuangong 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    Page<HxYuangong> queryByPage(HxYuangong hxYuangong, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hxYuangong 实例对象
     * @return 实例对象
     */
    HxYuangong insert(HxYuangong hxYuangong);

    /**
     * 修改数据
     *
     * @param hxYuangong 实例对象
     * @return 实例对象
     */
    HxYuangong update(HxYuangong hxYuangong);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    boolean deleteById( );

}
