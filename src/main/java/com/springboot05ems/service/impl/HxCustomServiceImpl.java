package com.springboot05ems.service.impl;

import com.springboot05ems.mapper.HxCustomDao;
import com.springboot05ems.entity.HxCustom;
import com.springboot05ems.service.HxCustomService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (HxCustom)表服务实现类
 *
 * @author makejava
 * @since 2023-05-01 02:56:45
 */
@Service("hxCustomService")
public class HxCustomServiceImpl implements HxCustomService {
    @Resource
    private HxCustomDao hxCustomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hx_hxCustomId 主键
     * @return 实例对象
     */
    @Override
    public HxCustom queryById(String hx_hxCustomId) {
        return           hxCustomDao.queryById(hx_hxCustomId);
    }

    /**
     * 分页查询
     *
     * @param hxCustom 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<HxCustom> queryByPage(HxCustom hxCustom, PageRequest pageRequest) {
//        long total = this.hxCustomDao.count(hxCustom);
//        return new PageImpl<>(this.hxCustomDao.queryAllByLimit(hxCustom, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param hxCustom 实例对象
     * @return 实例对象
     */
    @Override
    public HxCustom insert(HxCustom hxCustom) {
        hxCustomDao.insert(hxCustom);
        return hxCustom;
    }

    /**
     * 修改数据
     *
     * @param hxCustom 实例对象
     * @return 实例对象
     */
    @Override
    public HxCustom update(HxCustom hxCustom) {
        hxCustomDao.update(hxCustom);
        return this.queryById(hxCustom.getHx_hxCustomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param hx_hxCustomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String hx_hxCustomId) {

        return hxCustomDao.deleteById(hx_hxCustomId) > 0;
    }
}
