package com.springboot05ems.service;


import com.springboot05ems.entity.HxCustom;

/**
 * (HxCustom)表服务接口
 *
 * @author makejava
 * @since 2023-05-01 02:56:45
 */
public interface HxCustomService {

    /**
     * 通过ID查询单条数据
     *
     * @param hx_hxCustomId 主键
     * @return 实例对象
     */
    HxCustom queryById(String hx_hxCustomId);

    /**
     * 分页查询
     *
     * @param hxCustom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    Page<HxCustom> queryByPage(HxCustom hxCustom, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hxCustom 实例对象
     * @return 实例对象
     */
    HxCustom insert(HxCustom hxCustom);

    /**
     * 修改数据
     *
     * @param hxCustom 实例对象
     * @return 实例对象
     */
    HxCustom update(HxCustom hxCustom);

    /**
     * 通过主键删除数据
     *
     * @param hx_hxCustomId 主键
     * @return 是否成功
     */
    boolean deleteById(String hx_hxCustomId);

}
